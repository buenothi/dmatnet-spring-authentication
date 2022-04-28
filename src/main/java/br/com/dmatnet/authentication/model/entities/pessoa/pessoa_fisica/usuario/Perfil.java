package br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name="tbl_perfis")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class Perfil implements Serializable, GrantedAuthority {

	@Id
	private String nome;
	
	private static final long serialVersionUID = 2938086839928013787L;
	
	@Override
	public String getAuthority() {
		return this.nome;
	}
	
	
}
