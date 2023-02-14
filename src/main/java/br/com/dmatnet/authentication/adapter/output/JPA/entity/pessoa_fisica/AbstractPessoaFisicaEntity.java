package br.com.dmatnet.authentication.adapter.output.JPA.entity.pessoa_fisica;

import br.com.dmatnet.authentication.adapter.output.JPA.entity.AbstractPessoaEntity;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractPessoaFisicaEntity extends AbstractPessoaEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = -6151998038625475024L;
    private int genero;
    private int raca;
    private int estadoCivil;

    @Embedded
    private PessoaFisicaDocumentosEntity documentosPessoais;
    private LocalDate dataNascimento;

}
