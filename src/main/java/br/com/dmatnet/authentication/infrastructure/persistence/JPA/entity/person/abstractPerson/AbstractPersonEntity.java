package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.abstractPerson;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "tbl_person")
@Inheritance(strategy = InheritanceType.JOINED)
@Data
@SuperBuilder
public abstract class AbstractPersonEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(columnDefinition = "BINARY(16)")
    private UUID idPerson;
    private String name;
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
    @JoinColumn(name = "PERSON_ID")
    private Set<AddressEntity> addresses;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "PERSON_ID")
    private Set<TelephoneEntity> telephones;
    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "PERSON_ID")
    private Set<EmailEntity> emails;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime registerPersonDate;

}
