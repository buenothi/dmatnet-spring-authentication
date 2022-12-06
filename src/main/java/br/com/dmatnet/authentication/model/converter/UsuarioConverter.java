package br.com.dmatnet.authentication.model.converter;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import br.com.dmatnet.authentication.model.transfer_objects.pessoaTO.pessoaFisica.usuario.UsuarioTO;

@Component
public class UsuarioConverter {
	
	@Autowired
	ModelMapper modelMapper;
	
	public UsuarioTO toUsuarioTO(UsuarioEntity entity) {
		return modelMapper.map(entity, UsuarioTO.class);
	}

	public UsuarioEntity toUsuarioEntity(UsuarioTO to) {
		return modelMapper.map(to, UsuarioEntity.class);
	}

}
