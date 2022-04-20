package br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica;

import br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.AbstractPessoaTO;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class AbstractPessoaFisicaTO extends AbstractPessoaTO implements Serializable {

	private int genero;
	
	private int raca;
	
	private int estadoCivil;
	
	private PessoaFisicaDocumentosTO documentosPessoais;
	
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Serial
	private static final long serialVersionUID = 1L;
}
