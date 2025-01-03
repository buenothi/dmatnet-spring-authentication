package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.user;

import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.abstractPerson.AbstractNaturalPersonEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serial;
import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "tbl_user")
@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public class UserEntity extends AbstractNaturalPersonEntity implements UserDetails {

    @Serial
    private static final long serialVersionUID = 1L;
    @Column(unique = true)
    private String login;
    private String password;
    private UUID idUserCreator;
    private boolean activeUser;
    @OneToMany(fetch = FetchType.EAGER)
    private List<ProfileEntity> profiles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of();
    }

    @Override
    public String getUsername() {
        return this.login;
    }
}
