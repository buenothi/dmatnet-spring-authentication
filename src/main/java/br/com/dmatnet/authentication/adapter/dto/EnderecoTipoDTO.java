package br.com.dmatnet.authentication.adapter.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tbl_Logradouro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoTipoDTO implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idNomeLogradouro;
	
	private String siglaLogradouro;

	private String nomeLogradouro;

	@Serial
    private static final long serialVersionUID = 1L;

}
