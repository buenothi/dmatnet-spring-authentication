package br.com.dmatnet.authentication.model.entities.pessoa;

import java.io.Serial;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
