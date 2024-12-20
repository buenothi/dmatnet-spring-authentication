package br.com.dmatnet.authentication.application.gateway;

import br.com.dmatnet.authentication.domain.person.user.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository {

    Optional<User> findUserById(UUID id);

    Optional<User> findUserByLogin(String login);

    List<User> findUserByIdUserCreator(UUID idUserCreator);

    void deleteUser(User user);

    User saveUser(User user);
}