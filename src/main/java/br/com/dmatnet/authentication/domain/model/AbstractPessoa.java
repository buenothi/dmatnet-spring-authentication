package br.com.dmatnet.authentication.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractPessoa implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private UUID idPessoa;
    private String nome;
    private Set<Endereco> enderecos;
    private Set<Telefone> telefones;
    private Set<Email> emails;
    private LocalDateTime dataCadastroPessoa;

    @Override
    public String toString() {
        return "PessoaEntity [idPessoa=" + idPessoa + ", nome=" + nome + "]";
    }

}
