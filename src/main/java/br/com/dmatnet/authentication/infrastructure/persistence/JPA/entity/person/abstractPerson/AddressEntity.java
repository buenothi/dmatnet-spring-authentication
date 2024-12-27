package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.abstractPerson;

import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.city.CityEntity;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_address")
@Data
public class AddressEntity implements Serializable, Cloneable {

    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idAddress;
    @ManyToOne
    @JoinColumn(name = "address_type_id")
    private AddressTypeEntity addressType;// conforme tabela 20 do eSocial
    private String addressName;
    private int addressNumber;
    private String addressComplement;
    private String neighborhood;
    private String zipCode;
    private String postOffceBox;
    private LocalDate startAddressDate;
    private LocalDate endAddressDate;
    @ManyToOne
    @JoinColumn(name = "CITY_ID")
    private CityEntity city;
    private String type;
    private String country;

    @Override
    public AddressEntity clone() throws CloneNotSupportedException {
        return (AddressEntity) super.clone();
    }
}
