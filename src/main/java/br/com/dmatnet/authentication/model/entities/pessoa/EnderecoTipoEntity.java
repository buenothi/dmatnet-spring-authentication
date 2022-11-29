package br.com.dmatnet.authentication.model.entities.pessoa;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.*;

@Entity
@Table(name = "tbl_Logradouro")
@Getter
@Setter
@NoArgsConstructor
public class EnderecoTipoEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idNomeLogradouro;
	
	private String siglaLogradouro;

	private String nomeLogradouro;

	@Serial
    private static final long serialVersionUID = 1L;

}
