package br.com.dmatnet.authentication.infrastructure.converter;

import br.com.dmatnet.authentication.infrastructure.dto.user.UserRequestDTONatural;
import br.com.dmatnet.authentication.infrastructure.dto.user.UserResponseDTONatural;
import br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.entity.naturalPerson.user.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    @Autowired
    ModelMapper modelMapper;

    public UserRequestDTONatural toUserRequestDTO(UserEntity entity) {
        return modelMapper.map(entity, UserRequestDTONatural.class);
    }

    public UserResponseDTONatural toUserResponseDTO(UserEntity entity) {
        return modelMapper.map(entity, UserResponseDTONatural.class);
    }

    public UserEntity userRequestToEntity(UserRequestDTONatural dto) {
        return modelMapper.map(dto, UserEntity.class);
    }

    public UserEntity userResponseToEntity(UserResponseDTONatural dto) {
        return modelMapper.map(dto, UserEntity.class);
    }

}
