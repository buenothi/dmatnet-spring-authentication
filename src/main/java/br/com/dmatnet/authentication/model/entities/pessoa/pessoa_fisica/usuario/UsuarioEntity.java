package br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario;

import br.com.dmatnet.authentication.model.entities.pessoa.EmailEntity;
import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.AbstractPessoaFisicaEntity;
import lombok.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name="tbl_usuarios")
@Data
@NoArgsConstructor
public class UsuarioEntity extends AbstractPessoaFisicaEntity implements Serializable, UserDetails {

	public UsuarioEntity(
			String nome,
			Date dataNascimento,
			Set<EmailEntity> emails,
			String login,
			String senha,
			boolean ativo,
			List<Perfil> perfis) {
		super.setNome(nome);
		super.setDataNascimento(dataNascimento);
		super.setEmails(emails);
		this.login = login;
		this.senha = senha;
		this.ativo = ativo;
		this.perfis = perfis;
	}

	@Column(unique = true)
	private String login;
	private String senha;
	private UUID idUsuarioPai;
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
