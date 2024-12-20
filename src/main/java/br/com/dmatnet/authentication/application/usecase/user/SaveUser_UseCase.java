package br.com.dmatnet.authentication.application.usecase.user;

import br.com.dmatnet.authentication.application.gateway.UserRepository;
import br.com.dmatnet.authentication.domain.person.user.User;

public class SaveUser_UseCase {

    private final UserRepository repository;

    public SaveUser_UseCase(UserRepository repository) {
        this.repository = repository;
    }

    public User saveUser(User user) {
        return repository.saveUser(user);
    }
}
