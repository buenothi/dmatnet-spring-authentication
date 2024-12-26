package br.com.dmatnet.authentication.infrastructure.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractNaturalPersonDTO extends AbstractPersonDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -6151998038625475024L;
    private int genre;
    private int race;
    private int maritalState;
    private NaturalPersonDocumentsDTO personDocuments;
    private LocalDate birthDate;

}
