package br.com.dmatnet.authentication.application.usecase.user;

import br.com.dmatnet.authentication.application.gateway.UserRepository;
import br.com.dmatnet.authentication.domain.person.user.User;

import java.util.Optional;
import java.util.UUID;

public class FindUserByLogin_UseCase {

    private final UserRepository repository;

    public FindUserByLogin_UseCase(UserRepository repository) {
        this.repository = repository;
    }

    public Optional<User> findUserByLogin(String username) {
        return this.repository.findUserByLogin(username);
    }
}
