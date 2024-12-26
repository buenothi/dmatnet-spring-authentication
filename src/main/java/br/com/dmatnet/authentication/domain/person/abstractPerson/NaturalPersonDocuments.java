package br.com.dmatnet.authentication.domain.person.abstractPerson;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

public record NaturalPersonDocuments(Long numRic, String ricOrgExpedidor, LocalDate ricDataExpedicao, String numRG,
                                     String rgOrgExpedidor, LocalDate rgDataExpedicao, String numCPF, String numRNE,
                                     String rneOrgExpedidor, LocalDate rneDataExpedicao, Long numCNH, String cnhUf,
                                     LocalDate cnhDataExpedicao, LocalDate cnhValidade, LocalDate cnhPrimeiraEmissao,
                                     String cnhCategoria) implements Serializable, Cloneable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Override
    public NaturalPersonDocuments clone() throws CloneNotSupportedException {
        return (NaturalPersonDocuments) super.clone();
    }

}
