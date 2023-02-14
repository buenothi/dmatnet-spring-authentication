package br.com.dmatnet.authentication.domain.model;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class PessoaFisicaDocumentos implements Serializable, Cloneable {

    @Serial
    private static final long serialVersionUID = 1L;
    // registro de identificação civil (para atendimento do eSocial)
    private Long numRic;
    private String ricOrgExpedidor;
    private LocalDate ricDataExpedicao;
    private String numRG;
    private String rgOrgExpedidor;
    private LocalDate rgDataExpedicao;
    private String numCPF;
    private String numRNE;
    private String rneOrgExpedidor;
    private LocalDate rneDataExpedicao;
    private Long numCNH;
    private String cnhUf;
    private LocalDate cnhDataExpedicao;
    private LocalDate cnhValidade;
    private LocalDate cnhPrimeiraEmissao;
    private String cnhCategoria;

    public PessoaFisicaDocumentos(Long numRic, String ricOrgExpedidor, LocalDate ricDataExpedicao, String numRG, String rgOrgExpedidor, LocalDate rgDataExpedicao, String numCPF, String numRNE, String rneOrgExpedidor, LocalDate rneDataExpedicao, Long numCNH, String cnhUf, LocalDate cnhDataExpedicao, LocalDate cnhValidade, LocalDate cnhPrimeiraEmissao, String cnhCategoria) {
        this.numRic = numRic;
        this.ricOrgExpedidor = ricOrgExpedidor;
        this.ricDataExpedicao = ricDataExpedicao;
        this.numRG = numRG;
        this.rgOrgExpedidor = rgOrgExpedidor;
        this.rgDataExpedicao = rgDataExpedicao;
        this.numCPF = numCPF;
        this.numRNE = numRNE;
        this.rneOrgExpedidor = rneOrgExpedidor;
        this.rneDataExpedicao = rneDataExpedicao;
        this.numCNH = numCNH;
        this.cnhUf = cnhUf;
        this.cnhDataExpedicao = cnhDataExpedicao;
        this.cnhValidade = cnhValidade;
        this.cnhPrimeiraEmissao = cnhPrimeiraEmissao;
        this.cnhCategoria = cnhCategoria;
    }

    @Override
    public PessoaFisicaDocumentos clone() throws CloneNotSupportedException {
        return (PessoaFisicaDocumentos) super.clone();
    }

}
