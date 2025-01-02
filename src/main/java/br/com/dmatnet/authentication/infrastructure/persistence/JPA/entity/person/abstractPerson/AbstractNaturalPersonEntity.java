package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.abstractPerson;

import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.time.LocalDate;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
public abstract class AbstractNaturalPersonEntity extends AbstractPersonEntity {

    @Serial
    private static final long serialVersionUID = -6151998038625475024L;
    private int genre;
    private int race;
    private int maritalStatus;

    @Embedded
    private NaturalPersonDocumentsEntity personDocuments;
    private LocalDate birthDate;

}

