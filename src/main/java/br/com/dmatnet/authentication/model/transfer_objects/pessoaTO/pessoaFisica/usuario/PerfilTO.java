package br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica.usuario;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PerfilTO implements Serializable {
	
	@Serial
    private static final long serialVersionUID = 6560264837143469631L;
	private String nome;

	@JsonBackReference
	private List<UsuarioTO> usuarios;
	
}
