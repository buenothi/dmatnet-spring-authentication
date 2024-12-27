package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.abstractPerson;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tbl_telephone_type")
@Data
public class TelephoneTypeEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idTelephoneType;
    private String Type;

}
