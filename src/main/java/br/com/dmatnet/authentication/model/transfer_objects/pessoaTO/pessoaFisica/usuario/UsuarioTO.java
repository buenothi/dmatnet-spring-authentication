package br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica.usuario;

import br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica.AbstractPessoaFisicaTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class UsuarioTO extends AbstractPessoaFisicaTO implements Serializable {

	@Serial
	private static final long serialVersionUID = 8217011121551586768L;

	@NotEmpty
	@Min(3)
	private String login;

	@NotEmpty
	@Min(3)
	@JsonIgnore
	private String senha;

	private Long idUsuarioPai;

	@NotEmpty
	private boolean ativo;

	@JsonManagedReference
	private List<PerfilTO> perfis;
	
}
