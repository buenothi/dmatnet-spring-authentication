package br.com.dmatnet.authentication.port.input;

import br.com.dmatnet.authentication.domain.model.usuario.Usuario;

import java.util.List;
import java.util.UUID;

public interface IListarUsuariosPorUsuarioPai {

    List<Usuario> listarUsuariosPorUsuarioPai(UUID id);
}
