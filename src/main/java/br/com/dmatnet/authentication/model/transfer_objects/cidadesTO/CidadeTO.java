package br.com.dmatnet.authentication.model.transfer_objects.cidadesTO;

import java.io.Serial;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class CidadeTO implements Serializable {

	private long id;
	private String cidadeNome;
	private EstadoTO estado;
	@Serial
    private static final long serialVersionUID = 1L;

}
