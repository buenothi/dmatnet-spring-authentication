package br.com.dmatnet.authentication.model.entities.pessoa;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import lombok.*;

@Entity
@Table(name = "tbl_telefone")
@Getter
@Setter
@NoArgsConstructor
public class TelefoneEntity implements Serializable, Cloneable, Comparable<TelefoneEntity> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTelefone;
	private String numeroTelefone;

	@ManyToOne
	@JoinColumn(name = "TELEFONETIPO_ID")
	private TelefoneTipoEntity tipoTelefone;

	@Serial
	private static final long serialVersionUID = 1L;

	@Override
	public TelefoneEntity clone() throws CloneNotSupportedException {
		return (TelefoneEntity) super.clone();
	}

	@Override
	public int compareTo(TelefoneEntity outroTelefone) {
		if(outroTelefone.getNumeroTelefone().equals(this.getNumeroTelefone())) {
			return 0;
		}
		return -1;
	}
}
