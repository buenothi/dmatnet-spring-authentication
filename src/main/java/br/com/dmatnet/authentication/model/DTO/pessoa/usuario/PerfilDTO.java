package br.com.dmatnet.authentication.model.DTO.pessoa.usuario;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class PerfilDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 2938086839928013787L;
    @NonNull
    private String nome;
    @JsonBackReference
    private List<UsuarioRequestDTO> usuarios;

    public String getAuthority() {
        return this.nome;
    }

}
