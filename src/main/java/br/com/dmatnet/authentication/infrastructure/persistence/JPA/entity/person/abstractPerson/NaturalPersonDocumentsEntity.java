package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.abstractPerson;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Builder;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Embeddable
@Data
@Builder
public class NaturalPersonDocumentsEntity implements Serializable, Cloneable {

    @Serial
    private static final long serialVersionUID = 1L;
    // registro de identificação civil (para atendimento do eSocial)
    private Long numRic;
    private String ricOrgExpedidor;
    @Temporal(TemporalType.DATE)
    private LocalDate ricDataExpedicao;
    private String numRG;
    private String rgOrgExpedidor;
    @Temporal(TemporalType.DATE)
    private LocalDate rgDataExpedicao;
    private String numCPF;
    private String numRNE;
    private String rneOrgExpedidor;
    @Temporal(TemporalType.DATE)
    private LocalDate rneDataExpedicao;
    private Long numCNH;
    private String cnhUf;
    @Temporal(TemporalType.DATE)
    private LocalDate cnhDataExpedicao;
    @Temporal(TemporalType.DATE)
    private LocalDate cnhValidade;
    @Temporal(TemporalType.DATE)
    private LocalDate cnhPrimeiraEmissao;
    private String cnhCategoria;

    @Override
    public NaturalPersonDocumentsEntity clone() throws CloneNotSupportedException {
        return (NaturalPersonDocumentsEntity) super.clone();
    }

}
