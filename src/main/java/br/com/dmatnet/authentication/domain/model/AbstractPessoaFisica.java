package br.com.dmatnet.authentication.domain.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public abstract class AbstractPessoaFisica extends AbstractPessoa implements Serializable {

    @Serial
    private static final long serialVersionUID = -6151998038625475024L;
    private int genero;
    private int raca;
    private int estadoCivil;
    private PessoaFisicaDocumentos documentosPessoais;
    private LocalDate dataNascimento;

}
