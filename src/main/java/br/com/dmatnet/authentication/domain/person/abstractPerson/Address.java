package br.com.dmatnet.authentication.domain.person.abstractPerson;

import br.com.dmatnet.authentication.domain.city.City;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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

    public void setAddressName(String addressName) {
        this.addressName = addressName.toUpperCase();
    }

    public void setAddressComplement(String AddressComplement) {
        if (AddressComplement != null) {
            this.addressComplement = AddressComplement.toUpperCase();
        }
    }

    public void setNeighborhood(String bairroneighborhood) {
        if (bairroneighborhood != null) {
            this.neighborhood = bairroneighborhood.toUpperCase();
        }
    }

    public void setAddressCountry(String addressCountry) {
        if (addressCountry != null) {
            this.addressCountry = addressCountry.toUpperCase();
        }
    }

    @Override
    public Address clone() throws CloneNotSupportedException {
        return (Address) super.clone();
    }
}
