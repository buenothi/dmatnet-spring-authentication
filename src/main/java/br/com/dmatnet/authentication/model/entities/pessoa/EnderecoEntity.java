package br.com.dmatnet.authentication.model.entities.pessoa;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import br.com.dmatnet.authentication.model.entities.pessoa.cidade.CidadeEntity;
import lombok.*;

@Entity
@Table(name = "tbl_endereco")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoEntity implements Serializable, Cloneable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idEndereco;
	
	@ManyToOne
	@JoinColumn(name = "LOGRADOURO_ID")
	private EnderecoTipoEntity logradouro;// conforme tabela 20 do eSocial

	private String logradouroNome;
	private int logradouroNumero;
	private String logradouroComplemento;
	private String bairro;
	private String cep;
	private String caixaPostal;
	private Date dataInicioEndereco;
	private Date dataTerminoEndereco;

	@ManyToOne
	@JoinColumn(name = "CIDADE_ID")
	private CidadeEntity cidade;

	private String logradouroTipo;
	private String logradouroPais;

	@Serial
    private static final long serialVersionUID = 1L;

	public void setLogradouroNome(String logradouroNome) {
		this.logradouroNome = logradouroNome.toUpperCase();
	}

	public void setLogradouroComplemento(String logradouroComplemento) {
		this.logradouroComplemento = logradouroComplemento.toUpperCase();
	}

	public void setBairro(String bairro) {
		this.bairro = bairro.toUpperCase();
	}

	public void setLogradouroTipo(String logradouroTipo) {
		this.logradouroTipo = logradouroTipo.toUpperCase();
	}

	public void setLogradouroPais(String logradouroPais) {
		this.logradouroPais = logradouroPais.toUpperCase();
	}

	@Override
	public EnderecoEntity clone() throws CloneNotSupportedException {
		return (EnderecoEntity) super.clone();
	}
}
