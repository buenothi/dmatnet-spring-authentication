package br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class PessoaFisicaDocumentosTO implements Serializable, Cloneable {

	@Serial
	private static final long serialVersionUID = 8729299174885632883L;

	// registro de identificação civil (para atendimento do eSocial)
	private Long numRic;
	private String ricOrgExpedidor;
	private Date ricDataExpedicao;
	private String numRG;
	private String rgOrgExpedidor;
	private Date rgDataExpedicao;

	@NotEmpty
	private Long numCPF;
	private Long numRNE;
	private String rneOrgExpedidor;
	private Date rneDataExpedicao;
	private Long numCNH;
	private String cnhUf;
	private Date cnhDataExpedicao;
	private Date cnhValidade;
	private Date cnhPrimeiraEmissao;
	private String cnhCategoria;


	@Override
	public PessoaFisicaDocumentosTO clone() throws CloneNotSupportedException {
		return (PessoaFisicaDocumentosTO) super.clone();
	}

}
