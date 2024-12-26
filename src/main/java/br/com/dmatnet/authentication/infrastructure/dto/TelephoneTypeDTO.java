package br.com.dmatnet.authentication.infrastructure.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
public class TelephoneTypeDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private long idTelephoneType;
    private String type;

}
