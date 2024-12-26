package br.com.dmatnet.authentication.infrastructure.converter;

import br.com.dmatnet.authentication.infrastructure.dto.user.UserRequestDTONatural;
import br.com.dmatnet.authentication.infrastructure.dto.user.UserResponseDTONatural;
import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.naturalPerson.user.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    @Autowired
    ModelMapper modelMapper;

    public UserRequestDTONatural toUsuarioRequestDTO(UserEntity entity) {
        return modelMapper.map(entity, UserRequestDTONatural.class);
    }

    public UserResponseDTONatural toUsuarioResponseDTO(UserEntity entity) {
        return modelMapper.map(entity, UserResponseDTONatural.class);
    }

    public UserEntity usuarioRequestToEntity(UserRequestDTONatural dto) {
        return modelMapper.map(dto, UserEntity.class);
    }

    public UserEntity usuarioResponseToEntity(UserResponseDTONatural dto) {
        return modelMapper.map(dto, UserEntity.class);
    }

}
