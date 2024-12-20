package br.com.dmatnet.authentication.application.usecase.user;

import br.com.dmatnet.authentication.application.gateway.UserRepository;
import br.com.dmatnet.authentication.domain.person.user.User;

import java.util.Optional;
import java.util.UUID;

public class FindUserById_UseCase {

    private final UserRepository repository;

    public FindUserById_UseCase(UserRepository repository) {
        this.repository = repository;
    }

    public Optional<User> findUserById(UUID id) {
        return this.repository.findUserById(id);
    }
}
