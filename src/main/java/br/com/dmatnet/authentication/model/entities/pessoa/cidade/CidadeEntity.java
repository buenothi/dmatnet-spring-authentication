package br.com.dmatnet.authentication.model.entities.pessoa.cidade;

import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="tbl_cidades")
public class CidadeEntity implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 3)
	private String cidadeNome;
	
	@ManyToOne
	@JoinColumn(name="estado_ID")
	private EstadoEntity estado;
	
	@Serial
    private static final long serialVersionUID = 1L;

	public CidadeEntity() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCidadeNome() {
		return cidadeNome;
	}

	public void setCidadeNome(String cidadeNome) {
		this.cidadeNome = cidadeNome;
	}

	public EstadoEntity getEstado() {
		return estado;
	}

	public void setEstado(EstadoEntity estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return cidadeNome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidadeNome == null) ? 0 : cidadeNome.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CidadeEntity other = (CidadeEntity) obj;
		if (cidadeNome == null) {
			if (other.cidadeNome != null)
				return false;
		} else if (!cidadeNome.equals(other.cidadeNome))
			return false;
		if (estado == null) {
			return other.estado == null;
		} else return estado.equals(other.estado);
	}

}
