package br.com.dmatnet.authentication.domain.person.abstractPerson;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public abstract class AbstractNaturalPerson extends AbstractPerson {

    @Serial
    private static final long serialVersionUID = 0;
    private int genre;
    private int race;
    private int maritalStatus;
    private NaturalPersonDocuments personDocuments;
    private LocalDate birthDate;

}
