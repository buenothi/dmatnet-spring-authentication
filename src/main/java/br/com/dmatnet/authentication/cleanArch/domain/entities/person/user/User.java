package br.com.dmatnet.authentication.cleanArch.domain.entities.person.user;

import br.com.dmatnet.authentication.cleanArch.domain.entities.person.abstractPerson.AbstractNaturalPerson;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User extends AbstractNaturalPerson implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private String login;
    private String password;
    private UUID idUserCreator;
    private boolean activeUser;
    private List<Profile> profiles;

}
