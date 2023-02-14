package br.com.dmatnet.authentication.adapter.output.JPA.entity.pessoa_fisica.usuario;

import br.com.dmatnet.authentication.adapter.output.JPA.entity.EmailEntity;
import br.com.dmatnet.authentication.adapter.output.JPA.entity.pessoa_fisica.AbstractPessoaFisicaEntity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tbl_usuarios")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class UsuarioEntity extends AbstractPessoaFisicaEntity implements Serializable, UserDetails {

    @Serial
    private static final long serialVersionUID = 1L;
    @Column(unique = true)
    private String login;
    private String senha;
    private UUID idUsuarioPai;
    private boolean ativo;
    @OneToMany(fetch = FetchType.EAGER)
    private List<PerfilEntity> perfis;

    public UsuarioEntity(
            String nome,
            LocalDate dataNascimento,
            Set<EmailEntity> emails,
            String login,
            String senha,
            boolean ativo,
            List<PerfilEntity> perfis) {
        super.setNome(nome);
        super.setDataNascimento(dataNascimento);
        super.setEmails(emails);
        this.login = login;
        this.senha = senha;
        this.ativo = ativo;
        this.perfis = perfis;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.perfis;
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.login;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return this.ativo;
    }

}
