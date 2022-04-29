package br.com.dmatnet.authentication.model.transfer_objects.pessoaTO;

import java.io.Serial;
import java.io.Serializable;

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
@EqualsAndHashCode
public class EnderecoTipoTO implements Serializable {

	private int idNomeLogradouro;
	private String siglaLogradouro;
	private String nomeLogradouro;
	@Serial
    private static final long serialVersionUID = 1L;

}
