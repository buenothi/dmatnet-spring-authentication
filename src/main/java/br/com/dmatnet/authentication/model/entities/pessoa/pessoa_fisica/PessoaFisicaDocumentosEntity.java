package br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.*;

@Embeddable
@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class PessoaFisicaDocumentosEntity implements Serializable, Cloneable {

	// registro de identificação civil (para atendimento do eSocial)
	private Long numRic;
	private String ricOrgExpedidor;

	@Temporal(TemporalType.DATE)
	private Date ricDataExpedicao;

	private String numRG;
	private String rgOrgExpedidor;

	@Temporal(TemporalType.DATE)
	private Date rgDataExpedicao;

	private Long numCPF;

	private Long numRNE;
	private String rneOrgExpedidor;

	@Temporal(TemporalType.DATE)
	private Date rneDataExpedicao;

	private Long numCNH;
	private String cnhUf;

	@Temporal(TemporalType.DATE)
	private Date cnhDataExpedicao;

	@Temporal(TemporalType.DATE)
	private Date cnhValidade;

	@Temporal(TemporalType.DATE)
	private Date cnhPrimeiraEmissao;

	private String cnhCategoria;

	@Serial
	private static final long serialVersionUID = 1L;

	@Override
	public PessoaFisicaDocumentosEntity clone() throws CloneNotSupportedException {
		return (PessoaFisicaDocumentosEntity) super.clone();
	}

}
