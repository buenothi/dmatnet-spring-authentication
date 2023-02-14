package br.com.dmatnet.authentication.adapter.converter;

import br.com.dmatnet.authentication.adapter.dto.usuario.UsuarioRequestDTO;
import br.com.dmatnet.authentication.adapter.dto.usuario.UsuarioResponseDTO;
import br.com.dmatnet.authentication.adapter.output.JPA.entity.pessoa_fisica.usuario.UsuarioEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {

    @Autowired
    ModelMapper modelMapper;

    public UsuarioRequestDTO toUsuarioRequestDTO(UsuarioEntity entity) {
        return modelMapper.map(entity, UsuarioRequestDTO.class);
    }

    public UsuarioResponseDTO toUsuarioResponseDTO(UsuarioEntity entity) {
        return modelMapper.map(entity, UsuarioResponseDTO.class);
    }

    public UsuarioEntity usuarioRequestToEntity(UsuarioRequestDTO dto) {
        return modelMapper.map(dto, UsuarioEntity.class);
    }

    public UsuarioEntity usuarioResponseToEntity(UsuarioResponseDTO dto) {
        return modelMapper.map(dto, UsuarioEntity.class);
    }

}
