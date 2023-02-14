package br.com.dmatnet.authentication.adapter.dto;

import br.com.dmatnet.authentication.adapter.dto.cidade.CidadeDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoDTO implements Serializable, Cloneable {

    @Serial
    private static final long serialVersionUID = 1L;
    private long idEndereco;
    private EnderecoTipoDTO logradouro;// conforme tabela 20 do eSocial
    private String logradouroNome;
    private int logradouroNumero;
    private String logradouroComplemento;
    private String bairro;
    private String cep;
    private String caixaPostal;
    private LocalDate dataInicioEndereco;
    private LocalDate dataTerminoEndereco;
    private CidadeDTO cidade;
    private String logradouroTipo;
    private String logradouroPais;

    public void setLogradouroNome(String logradouroNome) {
        this.logradouroNome = logradouroNome.toUpperCase();
    }

    public void setLogradouroComplemento(String logradouroComplemento) {
        if (logradouroComplemento != null) {
            this.logradouroComplemento = logradouroComplemento.toUpperCase();
        }
    }

    public void setBairro(String bairro) {
        if (bairro != null) {
            this.bairro = bairro.toUpperCase();
        }
    }

    public void setLogradouroTipo(String logradouroTipo) {
        if (logradouroTipo != null) {
            this.logradouroTipo = logradouroTipo.toUpperCase();
        }
    }

    public void setLogradouroPais(String logradouroPais) {
        if (logradouroPais != null) {
            this.logradouroPais = logradouroPais.toUpperCase();
        }
    }

    @Override
    public EnderecoDTO clone() throws CloneNotSupportedException {
        return (EnderecoDTO) super.clone();
    }
}
