package br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario;

import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.AbstractPessoaFisicaEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="tbl_usuarios")
@Data
@NoArgsConstructor
public class UsuarioEntity extends AbstractPessoaFisicaEntity implements Serializable, UserDetails {

	@Column(unique = true)
	private String login;
	private String senha;
	private Long idUsuarioPai;
	private boolean ativo;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Perfil> perfis;
	
	private static final long serialVersionUID = 1L;

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return this.perfis;
	}

	@Override
	public String getPassword() {
		return this.senha;
	}

	@Override
	public String getUsername() {
		return this.login;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return this.ativo;
	}

}
