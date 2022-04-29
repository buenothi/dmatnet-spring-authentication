package br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica;

import br.com.dmatnet.authentication.model.entities.pessoa.AbstractPessoaEntity;
import lombok.*;

import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractPessoaFisicaEntity extends AbstractPessoaEntity implements Serializable {

	@Serial
	private static final long serialVersionUID = -6151998038625475024L;
	private int genero;
	private int raca;
	private int estadoCivil;

	@Embedded
	private PessoaFisicaDocumentosEntity documentosPessoais;
	private Date dataNascimento;

}
