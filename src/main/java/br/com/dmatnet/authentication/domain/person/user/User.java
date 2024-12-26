package br.com.dmatnet.authentication.domain.person.user;

import br.com.dmatnet.authentication.domain.person.abstractPerson.AbstractNaturalPerson;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public class User extends AbstractNaturalPerson implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String login;
    private String password;
    private UUID idUserCreator;
    private boolean activeUser;
    private List<Profile> profiles;

}
