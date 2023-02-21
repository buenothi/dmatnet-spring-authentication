package br.com.dmatnet.authentication.port.input;

import br.com.dmatnet.authentication.domain.model.usuario.Usuario;

import java.util.Optional;
import java.util.UUID;

public interface ILocalizarUsuarioPorId {

    Optional<Usuario> localizarUsuarioPorId(UUID id);
}
