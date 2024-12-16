package br.com.dmatnet.authentication.cleanArch.domain.usecase.user;

import br.com.dmatnet.authentication.cleanArch.application.gateway.UserRepository;
import br.com.dmatnet.authentication.cleanArch.domain.entities.person.user.User;

public class DeleteUser_UseCase {

    private final UserRepository repository;

    public DeleteUser_UseCase(UserRepository repository) {
        this.repository = repository;
    }

    public void deleteUser(User user) {
        this.repository.deleteUser(user);
    }
}
