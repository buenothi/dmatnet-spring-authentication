package br.com.dmatnet.authentication.domain.person.abstractPerson;

import br.com.dmatnet.authentication.domain.city.City;
import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Data
@Builder
public class Address implements Serializable, Cloneable {

    @Serial
    private static final long serialVersionUID = 1L;
    private long idAddress;
    private AddressType eSocialAddressType;// conforme tabela 20 do eSocial
    private String addressName;
    private int addressNumber;
    private String addressComplement;
    private String neighborhood;
    private String zipCode;
    private String postOfficeBox;
    private LocalDate startAddressDate;
    private LocalDate endAddressDate;
    private City city;
    private String addressCountry;

    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}
