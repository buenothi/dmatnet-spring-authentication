package br.com.dmatnet.authentication.model.entities.pessoa;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

import javax.persistence.*;

import lombok.*;
import org.hibernate.annotations.Type;

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
	@Column(columnDefinition = "BINARY(16)")
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
