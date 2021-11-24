package br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica;

import java.io.Serializable;
import java.util.Date;

import br.com.dmatnet.authentication.model.entities.pessoa.AbstractPessoaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class AbstractPessoaFisicaEntity extends AbstractPessoaEntity implements Serializable {

	private static final long serialVersionUID = -6151998038625475024L;
	private int genero;
	private int raca;
	private int estadoCivil;	
	private PessoaFisicaDocumentosEntity documentosPessoais;
	private Date dataNascimento;

}
