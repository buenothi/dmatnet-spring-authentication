package br.com.dmatnet.authentication.model.transfer_objects.cidadesTO;

import java.io.Serializable;
import java.util.List;

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
public class EstadoTO implements Serializable {

	private long id;
	private String estadoSigla;
	private String estadoNome;
	private List<CidadeTO> cidades;
	private static final long serialVersionUID = 1L;

}
