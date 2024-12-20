package br.com.dmatnet.authentication.domain.person.abstractPerson;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@EqualsAndHashCode
public class NaturalPersonDocuments implements Serializable, Cloneable {

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
    public NaturalPersonDocuments clone() throws CloneNotSupportedException {
        return (NaturalPersonDocuments) super.clone();
    }

}
