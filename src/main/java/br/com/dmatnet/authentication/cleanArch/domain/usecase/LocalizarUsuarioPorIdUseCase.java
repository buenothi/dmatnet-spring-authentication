package br.com.dmatnet.authentication.cleanArch.domain.usecase;

import br.com.dmatnet.authentication.cleanArch.domain.entities.usuario.Usuario;

import java.util.Optional;
import java.util.UUID;

public class LocalizarUsuarioPorIdUseCase {
    public Optional<Usuario> localizarUsuarioPorId(UUID id) {
        return Optional.empty();
    }
}
