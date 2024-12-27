package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.abstractPerson;

import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@MappedSuperclass
@Data
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
public abstract class AbstractNaturalPersonEntity extends AbstractPersonEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -6151998038625475024L;
    private int genre;
    private int race;
    private int maritalStatus;

    @Embedded
    private NaturalPersonDocumentsEntity personDocuments;
    private LocalDate birthDate;

}

