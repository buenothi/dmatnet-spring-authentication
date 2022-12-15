package br.com.dmatnet.authentication.model.entities.pessoa.cidade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tbl_estados")
@Getter
@Setter
@NamedQueries({
		@NamedQuery(name = "Estados.listarTodasCidadesPorEstado", 
				query = "SELECT cid FROM CidadeEntity cid WHERE cid.estado=:estado")})
@AllArgsConstructor
public class EstadoEntity implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull
	@Size(min = 3)
	private String estadoSigla;
	
	@NotNull
	@Size(min = 3)
	private String estadoNome;

	@OneToMany(mappedBy = "estado")
	private List<CidadeEntity> cidades;

	@Serial
	private static final long serialVersionUID = 1L;

	public EstadoEntity() {
		super();
	}

}
