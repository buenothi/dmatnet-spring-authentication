package br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

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
	private LocalDate ricDataExpedicao;

	private String numRG;
	private String rgOrgExpedidor;

	@Temporal(TemporalType.DATE)
	private LocalDate rgDataExpedicao;

	private String numCPF;

	private String numRNE;
	private String rneOrgExpedidor;

	@Temporal(TemporalType.DATE)
	private LocalDate rneDataExpedicao;

	private Long numCNH;
	private String cnhUf;

	@Temporal(TemporalType.DATE)
	private LocalDate cnhDataExpedicao;

	@Temporal(TemporalType.DATE)
	private LocalDate cnhValidade;

	@Temporal(TemporalType.DATE)
	private LocalDate cnhPrimeiraEmissao;

	private String cnhCategoria;

	@Serial
	private static final long serialVersionUID = 1L;

	public PessoaFisicaDocumentosEntity(Long numRic, String ricOrgExpedidor, LocalDate ricDataExpedicao, String numRG, String rgOrgExpedidor, LocalDate rgDataExpedicao, String numCPF, String numRNE, String rneOrgExpedidor, LocalDate rneDataExpedicao, Long numCNH, String cnhUf, LocalDate cnhDataExpedicao, LocalDate cnhValidade, LocalDate cnhPrimeiraEmissao, String cnhCategoria) {
		this.numRic = numRic;
		this.ricOrgExpedidor = ricOrgExpedidor;
		this.ricDataExpedicao = ricDataExpedicao;
		this.numRG = numRG;
		this.rgOrgExpedidor = rgOrgExpedidor;
		this.rgDataExpedicao = rgDataExpedicao;
		this.numCPF = numCPF;
		this.numRNE = numRNE;
		this.rneOrgExpedidor = rneOrgExpedidor;
		this.rneDataExpedicao = rneDataExpedicao;
		this.numCNH = numCNH;
		this.cnhUf = cnhUf;
		this.cnhDataExpedicao = cnhDataExpedicao;
		this.cnhValidade = cnhValidade;
		this.cnhPrimeiraEmissao = cnhPrimeiraEmissao;
		this.cnhCategoria = cnhCategoria;
	}

	@Override
	public PessoaFisicaDocumentosEntity clone() throws CloneNotSupportedException {
		return (PessoaFisicaDocumentosEntity) super.clone();
	}

}
