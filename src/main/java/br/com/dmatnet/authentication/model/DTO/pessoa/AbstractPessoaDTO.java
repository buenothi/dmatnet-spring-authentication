package br.com.dmatnet.authentication.model.DTO.pessoa;

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
public abstract class AbstractPessoaDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private UUID idPessoa;
    private String nome;
    private Set<EnderecoDTO> enderecos;
    private Set<TelefoneDTO> telefones;
    private Set<EmailDTO> emails;
    private LocalDateTime dataCadastroPessoa;

    @Override
    public String toString() {
        return "PessoaEntity [idPessoa=" + idPessoa + ", nome=" + nome + "]";
    }

}
