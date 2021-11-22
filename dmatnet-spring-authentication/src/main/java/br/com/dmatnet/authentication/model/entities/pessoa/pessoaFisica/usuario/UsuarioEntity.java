package br.com.dmatnet.authentication.model.entities.pessoa.pessoaFisica.usuario;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.dmatnet.authentication.model.entities.pessoa.pessoaFisica.AbstractPessoaFisicaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_usuarios")
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class UsuarioEntity extends AbstractPessoaFisicaEntity implements Serializable {

	@Column(unique = true)
	private String login;
	private String senha;
	private Long idUsuarioPai;

	private static final long serialVersionUID = 1L;

}
