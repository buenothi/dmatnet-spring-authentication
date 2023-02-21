package br.com.dmatnet.authentication.adapter.input.rest;

import br.com.dmatnet.authentication.adapter.dto.usuario.UsuarioRequestDTO;
import br.com.dmatnet.authentication.adapter.dto.usuario.UsuarioResponseDTO;
import br.com.dmatnet.authentication.adapter.converter.UsuarioConverter;
import br.com.dmatnet.authentication.adapter.output.JPA.entity.pessoa_fisica.usuario.UsuarioEntity;
import br.com.dmatnet.authentication.adapter.security.UsuarioAuthService;
import jakarta.validation.Valid;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/autenticacao")
public class UsuarioController {

    @Autowired
    private UsuarioAuthService usuarioAuthService;

    @Autowired
    private UsuarioConverter usuarioConverter;

    @Autowired
    private BCryptPasswordEncoder encoder;

    @PostMapping
    @Transactional
    public ResponseEntity<?> salvarUsuario(@RequestBody @Valid @NotNull UsuarioRequestDTO usuario) {

        usuario.setSenha(encoder.encode(usuario.getSenha()));

        UsuarioEntity usuarioCriado = usuarioAuthService.save(usuarioConverter.usuarioRequestToEntity(usuario));

        var uri = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/" + (usuarioCriado.getIdPessoa()))
                .build()
                .toUri();

        return ResponseEntity.created(uri).body(usuarioConverter.toUsuarioResponseDTO(usuarioCriado));
    }

    @GetMapping
    @Transactional
    public ResponseEntity<?> getUsuario(@RequestParam(value = "id") String id) {
        Optional<UsuarioEntity> usuarioEntity = usuarioAuthService.findUsuarioById(UUID.fromString(id));

        if (usuarioEntity.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        UsuarioResponseDTO usuarioDTO = usuarioConverter.toUsuarioResponseDTO(usuarioEntity.get());

        return ResponseEntity.ok(usuarioDTO);
    }

    @DeleteMapping
    @Transactional
    public ResponseEntity<?> delete(@RequestParam(value = "id") String id) {

        Optional<UsuarioEntity> usuarioADeletar = usuarioAuthService.findUsuarioById(UUID.fromString(id));

        if (usuarioADeletar.isEmpty()) {
            return ResponseEntity.notFound().build();
        }

        usuarioAuthService.delete(usuarioADeletar.get());

        return ResponseEntity.ok(null);
    }

}
