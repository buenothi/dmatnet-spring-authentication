package br.com.dmatnet.authentication.adapter.dto;

import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class EmailDTO implements Serializable, Cloneable, Comparable<EmailDTO> {

    @Serial
    private static final long serialVersionUID = 1L;
    private long idEmail;
    @Pattern(regexp = "^[_A-Za-z\\d-+]+(\\.[_A-Za-z\\d-]+)*@[A-Za-z\\d-]+(\\.[A-Za-z\\d]+)*(\\.[A-Za-z]{2,})$")
    @NonNull
    private String email;
    private boolean isEmailPrincipal;

    @Override
    protected EmailDTO clone() throws CloneNotSupportedException {
        return (EmailDTO) super.clone();
    }

    @Override
    public int compareTo(EmailDTO outroEmail) {
        if (outroEmail.getEmail().equalsIgnoreCase(this.email)) {
            return 0;
        }
        return -1;
    }

}
