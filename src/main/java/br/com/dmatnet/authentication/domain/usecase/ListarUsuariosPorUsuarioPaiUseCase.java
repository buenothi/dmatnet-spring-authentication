package br.com.dmatnet.authentication.domain.usecase;

import br.com.dmatnet.authentication.domain.model.usuario.Usuario;
import br.com.dmatnet.authentication.port.input.IListarUsuariosPorUsuarioPai;

import java.util.List;
import java.util.UUID;

public class ListarUsuariosPorUsuarioPaiUseCase implements IListarUsuariosPorUsuarioPai {
    @Override
    public List<Usuario> listarUsuariosPorUsuarioPai(UUID id) {
        return null;
    }
}
