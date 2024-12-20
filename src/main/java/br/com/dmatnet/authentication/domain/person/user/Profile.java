package br.com.dmatnet.authentication.domain.person.user;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Profile implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @NonNull
    private String name;

    public String getAuthority() {
        return this.name;
    }

}
