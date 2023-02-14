package br.com.dmatnet.authentication.domain.model;

import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Email implements Serializable, Cloneable, Comparable<Email> {

    @Serial
    private static final long serialVersionUID = 1L;
    private long idEmail;
    @Pattern(regexp = "^[_A-Za-z\\d-+]+(\\.[_A-Za-z\\d-]+)*@[A-Za-z\\d-]+(\\.[A-Za-z\\d]+)*(\\.[A-Za-z]{2,})$")
    @NonNull
    private String email;
    private boolean isEmailPrincipal;

    @Override
    protected Email clone() throws CloneNotSupportedException {
        return (Email) super.clone();
    }

    @Override
    public int compareTo(Email outroEmail) {
        if (outroEmail.getEmail().equalsIgnoreCase(this.email)) {
            return 0;
        }
        return -1;
    }

}
