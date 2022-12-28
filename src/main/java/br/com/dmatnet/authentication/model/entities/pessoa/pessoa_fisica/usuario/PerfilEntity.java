package br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "tbl_perfis")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class PerfilEntity implements Serializable, GrantedAuthority {

    @Serial
    private static final long serialVersionUID = 2938086839928013787L;
    @Id
    @NonNull
    private String nome;
    @Override
    public String getAuthority() {
        return this.nome;
    }


}
