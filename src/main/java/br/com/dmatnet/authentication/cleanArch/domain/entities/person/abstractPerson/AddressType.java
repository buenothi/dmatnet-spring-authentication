package br.com.dmatnet.authentication.cleanArch.domain.entities.person.abstractPerson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressType implements Serializable {

	private int idAddressName;
	
	private String addressAcronym;

	private String addressName;

	@Serial
    private static final long serialVersionUID = 1L;

}
