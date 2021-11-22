package br.com.dmatnet.authentication.model.entities.pessoa.pessoaFisica;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import br.com.dmatnet.authentication.model.entities.pessoa.AbstractPessoaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Inheritance(strategy=InheritanceType.JOINED)
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class AbstractPessoaFisicaEntity extends AbstractPessoaEntity implements Serializable {

	private int genero;
	
	private int raca;
	
	private int estadoCivil;
	
	private PessoaFisicaDocumentosEntity documentosPessoais;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	private static final long serialVersionUID = 1L;
}
