package br.com.dmatnet.authentication.domain.person.user;

import java.io.Serial;
import java.io.Serializable;

public record Profile(String name) implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    public String getAuthority() {
        return this.name;
    }

}
