package br.com.dmatnet.authentication.model.transfer_objects.pessoaTO;

import java.io.Serializable;

import javax.validation.constraints.Email;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(exclude = {"tipoEmail", "isEmailPrincipal"})
public class EmailTO implements Serializable, Cloneable, Comparable<EmailTO> {

	private long idEmail;

	@Email
	private String nomeEmail;
	private boolean isEmailPrincipal;
	private EmailTipoTO tipoEmail;
	private static final long serialVersionUID = 1L;

	public void setNomeEmail(String nomeEmail) {
		this.nomeEmail = nomeEmail.toUpperCase();
	}
	
	@Override
	protected EmailTO clone() throws CloneNotSupportedException {
		return (EmailTO) super.clone();
	}

	@Override
	public int compareTo(EmailTO outroEmail) {
		if (outroEmail.getNomeEmail() == this.nomeEmail) {
			return 0;
		}
		return -1;
	}

}
