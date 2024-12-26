package br.com.dmatnet.authentication.domain.person.abstractPerson;

import java.io.Serial;
import java.io.Serializable;

public record AddressType(int idAddressName,
						  String addressAcronym,
						  String addressName) implements Serializable {

	@Serial
    private static final long serialVersionUID = 1L;

}
