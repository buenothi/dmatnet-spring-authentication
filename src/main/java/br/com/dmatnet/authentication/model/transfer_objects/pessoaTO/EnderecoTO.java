package br.com.dmatnet.authentication.model.transfer_objects.pessoaTO;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

import br.com.dmatnet.authentication.model.entities.pessoa.cidade.CidadeEntity;
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
public class EnderecoTO implements Serializable, Cloneable {

	private long idEndereco;
	private EnderecoTipoTO logradouro;// conforme tabela 20 do eSocial
	private String logradouroNome;
	private int logradouroNumero;
	private String logradouroComplemento;
	private String bairro;
	private String cep;
	private String caixaPostal;
	private Date dataInicioEndereco;
	private Date dataTerminoEndereco;
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
	public EnderecoTO clone() throws CloneNotSupportedException {
		return (EnderecoTO) super.clone();
	}
}
