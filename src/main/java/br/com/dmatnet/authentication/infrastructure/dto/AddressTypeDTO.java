package br.com.dmatnet.authentication.infrastructure.dto;

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
public class AddressTypeDTO implements Serializable {

	private int idAddressName;
	
	private String addressAcronym;

	private String addressName;

	@Serial
    private static final long serialVersionUID = 1L;

}
