package br.com.dmatnet.authentication.domain.model.usuario;

import br.com.dmatnet.authentication.domain.model.AbstractPessoaFisica;
import br.com.dmatnet.authentication.domain.model.Email;
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
public class Usuario extends AbstractPessoaFisica implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String login;
    private String senha;
    private UUID idUsuarioPai;
    private boolean ativo;
    private List<Perfil> perfis;

    public Usuario(String nome, LocalDate dataNascimento, Set<Email> emails, String login, String senha, boolean ativo, List<Perfil> perfis) {
        super.setNome(nome);
        super.setDataNascimento(dataNascimento);
        super.setEmails(emails);
        this.login = login;
        this.senha = senha;
        this.ativo = ativo;
        this.perfis = perfis;
    }

}
