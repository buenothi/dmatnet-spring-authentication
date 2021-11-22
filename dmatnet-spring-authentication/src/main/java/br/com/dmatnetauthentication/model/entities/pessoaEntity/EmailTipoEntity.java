package br.com.dmatnetauthentication.model.entities.pessoaEntity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_emailTipo")
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class EmailTipoEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEmailTipo;
	private String tipo;
	private static final long serialVersionUID = 1L;

}
