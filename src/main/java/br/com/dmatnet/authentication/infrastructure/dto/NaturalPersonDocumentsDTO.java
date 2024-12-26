package br.com.dmatnet.authentication.infrastructure.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Data
public class NaturalPersonDocumentsDTO implements Serializable, Cloneable {

    @Serial
    private static final long serialVersionUID = 1L;
    // registro de identificação civil (para atendimento do eSocial)
    private final Long numRic;
    private final String ricOrgExpedidor;
    private final LocalDate ricDataExpedicao;
    private final String numRG;
    private final String rgOrgExpedidor;
    private final LocalDate rgDataExpedicao;
    private final String numCPF;
    private final String numRNE;
    private final String rneOrgExpedidor;
    private final LocalDate rneDataExpedicao;
    private final Long numCNH;
    private final String cnhUf;
    private final LocalDate cnhDataExpedicao;
    private final LocalDate cnhValidade;
    private final LocalDate cnhPrimeiraEmissao;
    private final String cnhCategoria;

    @Override
    public NaturalPersonDocumentsDTO clone() throws CloneNotSupportedException {
        return (NaturalPersonDocumentsDTO) super.clone();
    }

}
