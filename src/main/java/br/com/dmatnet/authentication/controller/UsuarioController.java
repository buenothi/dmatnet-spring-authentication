package br.com.dmatnet.authentication.controller;

import br.com.dmatnet.authentication.model.converter.UsuarioConverter;
import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica.usuario.LoginTO;
import br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica.usuario.TokenDTO;
import br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica.usuario.UsuarioTO;
import br.com.dmatnet.authentication.service.TokenService;
import br.com.dmatnet.authentication.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/autenticacao")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioConverter usuarioConverter;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    @Transactional
    public ResponseEntity<?> salvarUsuario(@RequestBody @Valid UsuarioTO usuario) {

        UsuarioEntity usuarioCriado = usuarioService.save(usuarioConverter.toUsuarioEntity(usuario));

        var uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + (usuarioCriado.getIdPessoa()))
                .build()
                .toUri();

        return ResponseEntity.created(uri).body(null);
    }

    @PostMapping("/auth")
    @Transactional
    public ResponseEntity<TokenDTO> autenticar(@RequestBody @Validated LoginTO login) {

        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(login.getLogin(), login.getSenha());

        Authentication authentication = authenticationManager.authenticate(usernamePasswordAuthenticationToken);

        String token = tokenService.generateToken(authentication);

        return ResponseEntity.ok(TokenDTO.builder().type("Bearer").token(token).build());
    }

    @GetMapping
    @Transactional
    public ResponseEntity<?> getUsuario(@RequestParam(value = "id") String id) {
        Optional<UsuarioEntity> usuarioEntity = usuarioService.findUsuarioById(UUID.fromString(id));

        if (usuarioEntity.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        UsuarioTO usuarioTO = usuarioConverter.toUsuarioTO(usuarioEntity.get());

        return ResponseEntity.ok(usuarioTO);
    }

    @DeleteMapping
    @Transactional
    public ResponseEntity<?> delete(@RequestParam(value = "id") String id) {

        Optional<UsuarioEntity> usuarioADeletar = usuarioService.findUsuarioById(UUID.fromString(id));

        if (usuarioADeletar.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        usuarioService.delete(usuarioADeletar.get());

        return ResponseEntity.ok(null);
    }

}
