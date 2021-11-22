package br.com.dmatnetauthentication.model.entities.pessoaEntity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_email")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"tipoEmail", "isEmailPrincipal"})
public class EmailEntity implements Serializable, Cloneable, Comparable<EmailEntity> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEmail;

	@Pattern(regexp = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")
	private String nomeEmail;

	private boolean isEmailPrincipal;

	@ManyToOne
	@JoinColumn(name = "EMAILTIPO_ID")
	private EmailTipoEntity tipoEmail;
	private static final long serialVersionUID = 1L;

	public void setNomeEmail(String nomeEmail) {
		this.nomeEmail = nomeEmail.toUpperCase();
	}
	
	@Override
	protected EmailEntity clone() throws CloneNotSupportedException {
		return (EmailEntity) super.clone();
	}

	@Override
	public int compareTo(EmailEntity outroEmail) {
		if (outroEmail.getNomeEmail() == this.nomeEmail) {
			return 0;
		}
		return -1;
	}

}
