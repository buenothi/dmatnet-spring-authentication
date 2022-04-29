package br.com.dmatnet.authentication.model.transfer_objects.pessoaTO;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(exclude = { "enderecos", "telefones", "emails", "dataCadastroPessoa"})
public abstract class AbstractPessoaTO implements Serializable {

	private long idPessoa;

	@NotEmpty
	@Size(min = 3)
	private String nome;
	private Set<EnderecoTO> enderecos;
	private Set<TelefoneTO> telefones;
	private Set<EmailTO> emails;
	private Date dataCadastroPessoa;

	@Serial
	private static final long serialVersionUID = 1L;

}
