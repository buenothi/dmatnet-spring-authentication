package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.naturalPerson.user;

import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.EmailEntity;
import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.naturalPerson.AbstractPersonFisicaEntity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tbl_usuarios")
@Data
@EqualsAndHashCode(callSuper = true)
public class UserEntity extends AbstractPersonFisicaEntity implements Serializable {

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

}
