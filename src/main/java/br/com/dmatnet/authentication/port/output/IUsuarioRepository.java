package br.com.dmatnet.authentication.port.output;

import br.com.dmatnet.authentication.cleanArch.domain.entities.usuario.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface IUsuarioRepository {

    Optional<Usuario> findById(UUID id);

    Optional<Usuario> findByLogin(String login);

    List<Usuario> findByIdUsuarioPai(UUID idUsuarioPai);
}
