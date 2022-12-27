package br.com.dmatnet.authentication.model.entities.pessoa;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tbl_email")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class EmailEntity implements Serializable, Cloneable, Comparable<EmailEntity> {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmail;
    @Pattern(regexp = "^[_A-Za-z\\d-+]+(\\.[_A-Za-z\\d-]+)*@[A-Za-z\\d-]+(\\.[A-Za-z\\d]+)*(\\.[A-Za-z]{2,})$")
    @NonNull
    private String email;
    @NonNull
    private boolean isEmailPrincipal;

    @Override
    protected EmailEntity clone() throws CloneNotSupportedException {
        return (EmailEntity) super.clone();
    }

    @Override
    public int compareTo(EmailEntity outroEmail) {
        if (outroEmail.getEmail().equalsIgnoreCase(this.email)) {
            return 0;
        }
        return -1;
    }

}
