package br.com.dmatnet.authentication.model.entities.pessoa;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tbl_Pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractPessoaEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "BINARY(16)")
    private UUID idPessoa;
    private String nome;
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
    @JoinColumn(name = "PESSOA_ID")
    private Set<EnderecoEntity> enderecos;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "PESSOA_ID")
    private Set<TelefoneEntity> telefones;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "PESSOA_ID")
    private Set<EmailEntity> emails;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime dataCadastroPessoa;

    @Override
    public String toString() {
        return "PessoaEntity [idPessoa=" + idPessoa + ", nome=" + nome + "]";
    }

}
