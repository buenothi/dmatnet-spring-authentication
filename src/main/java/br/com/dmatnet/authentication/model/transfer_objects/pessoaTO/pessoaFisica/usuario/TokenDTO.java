package br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica.usuario;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TokenDTO {

    private String type;
    private String token;

}
