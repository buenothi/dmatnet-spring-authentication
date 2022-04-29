package br.com.dmatnet.authentication.model.entities.pessoa.cidade;

import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbl_estados")
@Getter
@Setter
@NamedQueries({
		@NamedQuery(name = "Estados.listarTodasCidadesPorEstado", 
				query = "SELECT cid FROM CidadeEntity cid WHERE cid.estado=:estado")})
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
