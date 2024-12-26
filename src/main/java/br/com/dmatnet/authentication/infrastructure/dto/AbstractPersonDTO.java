package br.com.dmatnet.authentication.infrastructure.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Data
public abstract class AbstractPersonDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private UUID idPerson;
    private String name;
    private Set<AddressDTO> addresses;
    private Set<TelephoneDTO> telephones;
    private Set<EmailDTO> emails;
    private LocalDateTime registerPersonDate;

}