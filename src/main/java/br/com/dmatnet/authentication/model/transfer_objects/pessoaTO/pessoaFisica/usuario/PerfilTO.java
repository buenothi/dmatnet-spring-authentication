package br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica.usuario;

import java.io.Serializable;
import java.util.List;

import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode
public class PerfilTO implements Serializable {
	
	private static final long serialVersionUID = 6560264837143469631L;
	private String nome;
	private List<UsuarioEntity> usuarios;
	
}
