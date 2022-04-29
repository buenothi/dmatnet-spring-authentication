package br.com.dmatnet.authentication.model.entities.pessoa;

import java.io.Serial;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
