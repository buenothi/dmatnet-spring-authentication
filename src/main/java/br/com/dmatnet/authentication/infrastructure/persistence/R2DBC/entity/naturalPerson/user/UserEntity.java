package br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.entity.naturalPerson.user;

import br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.entity.EmailEntity;
import br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.entity.naturalPerson.AbstractPersonFisicaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
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
@Data
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends AbstractPersonFisicaEntity implements Serializable, UserDetails {

    @Serial
    private static final long serialVersionUID = 1L;
    @Column(unique = true)
    private String login;
    private String password;
    private UUID idUserCreator;
    private boolean activeUser;
    @OneToMany(fetch = FetchType.EAGER)
    private List<ProfileEntity> profiles;

    public UserEntity(
            String nome,
            LocalDate dataNascimento,
            Set<EmailEntity> emails,
            String login,
            String password,
            boolean activeUser,
            List<ProfileEntity> profiles) {
        super.setNome(nome);
        super.setDataNascimento(dataNascimento);
        super.setEmails(emails);
        this.login = login;
        this.password = password;
        this.activeUser = activeUser;
        this.profiles = profiles;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.profiles;
    }

    @Override
    public String getPassword() {
        return this.password;
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
        return this.activeUser;
    }

}
