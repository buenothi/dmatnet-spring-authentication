package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.abstractPerson;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name = "tbl_address_type")
@Data
public class AddressTypeEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAddressType;
    private String addressAcronym;
    private String addressName;

}
