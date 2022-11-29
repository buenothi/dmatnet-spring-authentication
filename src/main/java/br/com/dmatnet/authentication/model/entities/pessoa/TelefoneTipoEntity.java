package br.com.dmatnet.authentication.model.entities.pessoa;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.*;

@Entity
@Table(name = "tbl_telefoneTipo")
@Getter
@Setter
@NoArgsConstructor
public class TelefoneTipoEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idTelefoneTipo;
	private String tipo;
	@Serial
    private static final long serialVersionUID = 1L;

}
