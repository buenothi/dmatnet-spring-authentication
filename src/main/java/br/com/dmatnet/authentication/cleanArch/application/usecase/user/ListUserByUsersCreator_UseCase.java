package br.com.dmatnet.authentication.cleanArch.application.usecase.user;

import br.com.dmatnet.authentication.cleanArch.application.gateway.UserRepository;
import br.com.dmatnet.authentication.cleanArch.domain.entities.person.user.User;

import java.util.List;
import java.util.UUID;

public class ListUserByUsersCreator_UseCase {

    private final UserRepository repository;

    public ListUserByUsersCreator_UseCase(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> listUserByUserCreatorId(UUID id) {
        return this.repository.findUserByIdUserCreator(id);
    }
}
