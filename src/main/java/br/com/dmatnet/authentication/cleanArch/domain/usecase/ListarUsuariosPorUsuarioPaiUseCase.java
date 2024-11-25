package br.com.dmatnet.authentication.cleanArch.domain.usecase;

import br.com.dmatnet.authentication.cleanArch.domain.entities.usuario.Usuario;
import br.com.dmatnet.authentication.port.input.IListarUsuariosPorUsuarioPai;

import java.util.List;
import java.util.UUID;

public class ListarUsuariosPorUsuarioPaiUseCase implements IListarUsuariosPorUsuarioPai {
    @Override
    public List<Usuario> listarUsuariosPorUsuarioPai(UUID id) {
        return null;
    }
}
