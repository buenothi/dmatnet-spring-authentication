package br.com.dmatnet.authentication.port.input;

import br.com.dmatnet.authentication.domain.model.usuario.Usuario;

public interface ISalvarUsuario {

     Usuario salvarUsuario(Usuario usuario);

}
