package br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica.usuario;

import br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica.AbstractPessoaFisicaTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

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
	private String login;

	@NotEmpty
	@JsonIgnore
	private String senha;

	private Long idUsuarioPai;

	@NotEmpty
	private boolean ativo;

	@JsonManagedReference
	private List<PerfilTO> perfis;
	
}
