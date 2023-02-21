package br.com.dmatnet.authentication.port.input;

import br.com.dmatnet.authentication.domain.model.usuario.Usuario;

public interface IDeletarUsuario {

    void deleteUsuario(Usuario usuario);
}
