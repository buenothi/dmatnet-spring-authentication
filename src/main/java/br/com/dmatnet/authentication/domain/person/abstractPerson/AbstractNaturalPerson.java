package br.com.dmatnet.authentication.domain.person.abstractPerson;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public abstract class AbstractNaturalPerson extends AbstractPerson implements Serializable {

    @Serial
    private static final long serialVersionUID = 0;
    private int genre;
    private int race;
    private int maritalStatus;
    private NaturalPersonDocuments personDocuments;
    private LocalDate birthDate;

}
