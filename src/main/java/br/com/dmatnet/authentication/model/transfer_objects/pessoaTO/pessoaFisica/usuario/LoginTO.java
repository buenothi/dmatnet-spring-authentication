package br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica.usuario;

import lombok.*;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode(callSuper = false)
public class LoginTO implements Serializable {

    @NotEmpty
    @Min(3)
    private String login;

    @NotEmpty
    @Min(3)
    private String senha;

}
