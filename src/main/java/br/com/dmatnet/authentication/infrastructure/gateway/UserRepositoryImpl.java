package br.com.dmatnet.authentication.infrastructure.gateway;

import br.com.dmatnet.authentication.application.gateway.UserRepository;
import br.com.dmatnet.authentication.domain.person.user.User;
import br.com.dmatnet.authentication.infrastructure.converter.UserConverter;
import br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.repository.UserR2DBCRepository;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Component
public class UserRepositoryImpl implements UserRepository {

    private final UserR2DBCRepository repository;
    private final UserConverter converter;

    public UserRepositoryImpl(UserR2DBCRepository repository, UserConverter converter) {
        this.repository = repository;
        this.converter = converter;
    }

    @Override
    public Optional<User> findUserById(UUID id) {
        return Optional.empty();
    }

    @Override
    public Optional<User> findUserByLogin(String login) {
        return Optional.empty();
    }

    @Override
    public List<User> findUserByIdUserCreator(UUID idUserCreator) {
        return repository.findByIdUserCreator(idUserCreator)
                .map(converter::userEntityToUser)
                .toStream()
                .toList();
    }

    @Override
    public void deleteUser(User user) {
        final var delete = repository.delete(
                converter.userToUserEntity(user)
        );
    }

    @Override
    public User saveUser(User user) {
        return converter
                .userEntityToUser(repository
                        .save(converter.userToUserEntity(user))
                        .block());
    }
}
