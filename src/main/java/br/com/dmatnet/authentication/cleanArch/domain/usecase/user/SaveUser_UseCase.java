package br.com.dmatnet.authentication.cleanArch.domain.usecase.user;

import br.com.dmatnet.authentication.cleanArch.application.gateway.UserRepository;
import br.com.dmatnet.authentication.cleanArch.domain.entities.person.user.User;

public class SaveUser_UseCase {

    private final UserRepository repository;

    public SaveUser_UseCase(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(User user) {
        return repository.saveUser(user);
    }
}
