package br.com.dmatnet.authentication.infrastructure.converter;

import br.com.dmatnet.authentication.domain.person.user.User;
import br.com.dmatnet.authentication.infrastructure.dto.user.UserRequestDTONatural;
import br.com.dmatnet.authentication.infrastructure.dto.user.UserResponseDTONatural;
import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.user.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

    private final ModelMapper modelMapper;

    public UserConverter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public UserRequestDTONatural userEntityToUserRequestDTO(UserEntity entity) {
        return modelMapper.map(entity, UserRequestDTONatural.class);
    }

    public UserResponseDTONatural userEntityToUserResponseDTO(UserEntity entity) {
        return modelMapper.map(entity, UserResponseDTONatural.class);
    }

    public UserEntity userRequestToUserEntity(UserRequestDTONatural dto) {
        return modelMapper.map(dto, UserEntity.class);
    }

    public UserEntity userResponseToUserEntity(UserResponseDTONatural dto) {
        return modelMapper.map(dto, UserEntity.class);
    }

    public User userEntityToUser(UserEntity entity) {
        return modelMapper.map(entity, User.class);
    }

    public UserEntity userToUserEntity(User user) {
        return modelMapper.map(user, UserEntity.class);
    }

}
