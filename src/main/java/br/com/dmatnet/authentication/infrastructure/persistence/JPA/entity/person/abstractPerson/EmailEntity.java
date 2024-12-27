package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.abstractPerson;

import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tbl_email")
@Data
public class EmailEntity implements Serializable, Cloneable, Comparable<EmailEntity> {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEmail;
    @Pattern(regexp = "^[_A-Za-z\\d-+]+(\\.[_A-Za-z\\d-]+)*@[A-Za-z\\d-]+(\\.[A-Za-z\\d]+)*(\\.[A-Za-z]{2,})$")
    private final String email;
    private final boolean isMainEmail;

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
