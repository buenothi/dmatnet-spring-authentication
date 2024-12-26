package br.com.dmatnet.authentication.domain.person.abstractPerson;

import java.io.Serial;
import java.io.Serializable;

public record TelephoneType(long idTelephoneType,
                            String type) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

}
