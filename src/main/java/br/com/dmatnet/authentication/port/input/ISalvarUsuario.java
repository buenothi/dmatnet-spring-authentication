package br.com.dmatnet.authentication.port.input;

import br.com.dmatnet.authentication.cleanArch.domain.entities.usuario.Usuario;

public interface ISalvarUsuario {

     Usuario salvarUsuario(Usuario usuario);

}
