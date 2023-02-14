package br.com.dmatnet.authentication.adapter.output.JPA.entity.pessoa_fisica.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import java.io.Serial;
import java.io.Serializable;

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
