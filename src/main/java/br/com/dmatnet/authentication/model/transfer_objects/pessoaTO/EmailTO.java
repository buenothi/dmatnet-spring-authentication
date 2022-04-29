package br.com.dmatnet.authentication.model.transfer_objects.pessoaTO;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

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
	@NotEmpty
	private String nomeEmail;

	@NotEmpty
	private boolean isEmailPrincipal;

	@Serial
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
		if (Objects.equals(outroEmail.getNomeEmail(), this.nomeEmail)) {
			return 0;
		}
		return -1;
	}

}
