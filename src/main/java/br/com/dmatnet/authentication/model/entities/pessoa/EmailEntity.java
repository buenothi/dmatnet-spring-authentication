package br.com.dmatnet.authentication.model.entities.pessoa;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import lombok.*;

@Entity
@Table(name = "tbl_email")
@Getter
@Setter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode(exclude = {"tipoEmail", "isEmailPrincipal"})
public class EmailEntity implements Serializable, Cloneable, Comparable<EmailEntity> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEmail;

	@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
	@NonNull
	private String email;

	@NonNull
	private boolean isEmailPrincipal;

	private static final long serialVersionUID = 1L;

	@Override
	protected EmailEntity clone() throws CloneNotSupportedException {
		return (EmailEntity) super.clone();
	}

	@Override
	public int compareTo(EmailEntity outroEmail) {
		if (outroEmail.getEmail() == this.email) {
			return 0;
		}
		return -1;
	}

}
