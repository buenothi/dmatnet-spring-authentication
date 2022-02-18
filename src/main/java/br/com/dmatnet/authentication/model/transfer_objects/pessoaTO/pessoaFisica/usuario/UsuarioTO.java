package br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica.usuario;

import java.io.Serializable;
import java.util.List;

import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.AbstractPessoaFisicaEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class UsuarioTO extends AbstractPessoaFisicaEntity implements Serializable {

	private static final long serialVersionUID = 8217011121551586768L;
	private String login;
	private String senha;
	private Long idUsuarioPai;
	private boolean ativo;
	private List<PerfilTO> perfis;
	
}