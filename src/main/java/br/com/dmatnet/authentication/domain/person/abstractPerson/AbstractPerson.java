package br.com.dmatnet.authentication.domain.person.abstractPerson;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public abstract class AbstractPerson implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private UUID idPerson;
    private String name;
    private Set<Address> addresses;
    private Set<Telephone> telephones;
    private Set<Email> emails;
    private LocalDateTime registerPersonDate;

}
