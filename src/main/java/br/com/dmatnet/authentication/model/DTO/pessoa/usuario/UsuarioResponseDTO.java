package br.com.dmatnet.authentication.model.DTO.pessoa.usuario;

import br.com.dmatnet.authentication.model.DTO.pessoa.AbstractPessoaFisicaDTO;
import br.com.dmatnet.authentication.model.DTO.pessoa.EmailDTO;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class UsuarioResponseDTO extends AbstractPessoaFisicaDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String login;
    @JsonIgnore
    private String senha;
    private UUID idUsuarioPai;
    private boolean ativo;
    private List<PerfilDTO> perfis;

    public UsuarioResponseDTO(String nome, LocalDate dataNascimento, Set<EmailDTO> emails, String login, String senha, boolean ativo, List<PerfilDTO> perfis) {
        super.setNome(nome);
        super.setDataNascimento(dataNascimento);
        super.setEmails(emails);
        this.login = login;
        this.senha = senha;
        this.ativo = ativo;
        this.perfis = perfis;
    }

}
