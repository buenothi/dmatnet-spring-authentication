package br.com.dmatnet.authentication.infrastructure.dto.user;

import br.com.dmatnet.authentication.infrastructure.dto.AbstractNaturalPersonDTO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
public class UserRequestDTONatural extends AbstractNaturalPersonDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private final String login;
    private final String password;
    private final UUID idUserCreator;
    private final boolean activeUser;
    private final List<ProfileDTO> profiles;

}
