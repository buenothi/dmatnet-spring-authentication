package br.com.dmatnet.authentication.model.entities.pessoa;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;

import lombok.*;

@Entity
@Table(name = "tbl_email")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class EmailEntity implements Serializable, Cloneable, Comparable<EmailEntity> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEmail;

	@Pattern(regexp = "^[_A-Za-z\\d-+]+(\\.[_A-Za-z\\d-]+)*@[A-Za-z\\d-]+(\\.[A-Za-z\\d]+)*(\\.[A-Za-z]{2,})$")
	@NonNull
	private String email;

	@NonNull
	private boolean isEmailPrincipal;

	@Serial
	private static final long serialVersionUID = 1L;

	@Override
	protected EmailEntity clone() throws CloneNotSupportedException {
		return (EmailEntity) super.clone();
	}

	@Override
	public int compareTo(EmailEntity outroEmail) {
		if (outroEmail.getEmail().equalsIgnoreCase(this.email)) {
			return 0;
		}
		return -1;
	}

}
