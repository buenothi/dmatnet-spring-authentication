package br.com.dmatnet.authentication.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoTipo implements Serializable {

	private int idNomeLogradouro;
	
	private String siglaLogradouro;

	private String nomeLogradouro;

	@Serial
    private static final long serialVersionUID = 1L;

}
