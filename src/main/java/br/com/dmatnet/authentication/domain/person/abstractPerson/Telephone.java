package br.com.dmatnet.authentication.domain.person.abstractPerson;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Data
@Builder
public class Telephone implements Serializable, Cloneable, Comparable<Telephone> {

    @Serial
    private static final long serialVersionUID = 1L;
    private long idTelephone;
    private String telephoneNumber;
    private TelephoneType telephoneType;

    @Override
    public Telephone clone() throws CloneNotSupportedException {
        return (Telephone) super.clone();
    }

    @Override
    public int compareTo(Telephone otherTelephone) {
        if (otherTelephone.getTelephoneNumber().equals(this.getTelephoneNumber())) {
            return 0;
        }
        return -1;
    }
}
