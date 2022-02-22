package br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica;

import br.com.dmatnet.authentication.model.entities.pessoa.AbstractPessoaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;
import java.util.Date;

@MappedSuperclass
@Inheritance(strategy= InheritanceType.JOINED)
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public abstract class AbstractPessoaFisicaEntity extends AbstractPessoaEntity implements Serializable {

	private static final long serialVersionUID = -6151998038625475024L;
	private int genero;
	private int raca;
	private int estadoCivil;

	@Embedded
	private PessoaFisicaDocumentosEntity documentosPessoais;
	private Date dataNascimento;

}
