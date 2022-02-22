package br.com.dmatnet.authentication.controller;

import br.com.dmatnet.authentication.model.converter.UsuarioConverter;
import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica.usuario.UsuarioTO;
import br.com.dmatnet.authentication.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/autenticacao")
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @Autowired
    UsuarioConverter usuarioConverter;

    @PostMapping
    @Transactional
    public ResponseEntity<?> salvarUsuario(@RequestBody @Valid UsuarioTO usuario) {

        UsuarioEntity usuarioCriado = usuarioService.save(usuarioConverter.toUsuarioEntity(usuario));

        var uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path(Long.toString(usuarioCriado.getIdPessoa()))
                .build()
                .toUri();

        return ResponseEntity.created(uri).body(null);
    }

    @DeleteMapping(path = "/{id}", consumes = {"application/json"})
    @Transactional
    public ResponseEntity<?> delete(@PathVariable Long id) {

        Optional<UsuarioEntity> usuarioADeletar = usuarioService.findUsuarioById(id);

        if (usuarioADeletar.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        usuarioService.delete(usuarioADeletar.get());

        return ResponseEntity.ok(null);
    }

}
