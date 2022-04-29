package br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name="tbl_perfis")
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class PerfilEntity implements Serializable, GrantedAuthority {

	@Id
	@NonNull
	private String nome;

	@ManyToMany(mappedBy = "perfis")
	private List<UsuarioEntity> usuarios;

	@Serial
	private static final long serialVersionUID = 2938086839928013787L;
	
	@Override
	public String getAuthority() {
		return this.nome;
	}
	
	
}
