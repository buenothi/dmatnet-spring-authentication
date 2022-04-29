package br.com.dmatnet.authentication.model.entities.pessoa;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.*;

@Entity
@Table(name = "tbl_Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractPessoaEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private UUID idPessoa;

	private String nome;

	@OneToMany(cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE })
	@JoinColumn(name = "PESSOA_ID")
	private Set<EnderecoEntity> enderecos;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "PESSOA_ID")
	private Set<TelefoneEntity> telefones;

	@OneToMany(cascade = { CascadeType.ALL })
	@JoinColumn(name = "PESSOA_ID")
	private Set<EmailEntity> emails;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dataCadastroPessoa;

	@Serial
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "PessoaEntity [idPessoa=" + idPessoa + ", nome=" + nome + "]";
	}

}
