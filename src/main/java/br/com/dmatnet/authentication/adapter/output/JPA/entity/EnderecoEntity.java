package br.com.dmatnet.authentication.adapter.output.JPA.entity;

import br.com.dmatnet.authentication.adapter.output.JPA.entity.cidade.CidadeEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "tbl_endereco")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EnderecoEntity implements Serializable, Cloneable {

    @Serial
    private static final long serialVersionUID = 1L;
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
    private LocalDate dataInicioEndereco;
    private LocalDate dataTerminoEndereco;
    @ManyToOne
    @JoinColumn(name = "CIDADE_ID")
    private CidadeEntity cidade;
    private String logradouroTipo;
    private String logradouroPais;

    public void setLogradouroNome(String logradouroNome) {
        if (logradouroNome != null) {
            this.logradouroNome = logradouroNome.toUpperCase();
        }
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
    public EnderecoEntity clone() throws CloneNotSupportedException {
        return (EnderecoEntity) super.clone();
    }
}
