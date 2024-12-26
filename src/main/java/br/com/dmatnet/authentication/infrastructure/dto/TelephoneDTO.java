package br.com.dmatnet.authentication.infrastructure.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class TelephoneDTO implements Serializable, Cloneable, Comparable<TelephoneDTO> {

    @Serial
    private static final long serialVersionUID = 1L;
    private long idTelephone;
    private String telephoneNumber;
    private TelephoneTypeDTO telephoneType;

    @Override
    public TelephoneDTO clone() throws CloneNotSupportedException {
        return (TelephoneDTO) super.clone();
    }

    @Override
    public int compareTo(TelephoneDTO otherTelephone) {
        if (otherTelephone.getTelephoneNumber().equals(this.getTelephoneNumber())) {
            return 0;
        }
        return -1;
    }
}
