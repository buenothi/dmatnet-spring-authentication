package br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica.usuario;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class LoginTO implements Serializable {

    @NotEmpty
    private String login;

    @NotEmpty
    private String senha;

}
