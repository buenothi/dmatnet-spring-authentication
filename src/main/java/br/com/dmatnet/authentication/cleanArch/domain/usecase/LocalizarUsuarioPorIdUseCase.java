package br.com.dmatnet.authentication.cleanArch.domain.usecase;

import br.com.dmatnet.authentication.cleanArch.domain.entities.usuario.Usuario;
import br.com.dmatnet.authentication.port.input.ILocalizarUsuarioPorId;

import java.util.Optional;
import java.util.UUID;

public class LocalizarUsuarioPorIdUseCase implements ILocalizarUsuarioPorId {
    @Override
    public Optional<Usuario> localizarUsuarioPorId(UUID id) {
        return Optional.empty();
    }
}
