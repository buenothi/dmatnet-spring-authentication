package br.com.dmatnet.authentication.adapter.dto.usuario;

import lombok.*;

import java.io.Serial;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class PerfilDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 2938086839928013787L;
    @NonNull
    private String nome;

    public String getAuthority() {
        return this.nome;
    }

}
