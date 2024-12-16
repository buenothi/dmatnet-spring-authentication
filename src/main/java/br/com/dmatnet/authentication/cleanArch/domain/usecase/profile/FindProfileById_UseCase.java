package br.com.dmatnet.authentication.cleanArch.domain.usecase.profile;

import br.com.dmatnet.authentication.cleanArch.application.gateway.ProfileRepository;
import br.com.dmatnet.authentication.cleanArch.application.gateway.UserRepository;
import br.com.dmatnet.authentication.cleanArch.domain.entities.person.user.Profile;
import br.com.dmatnet.authentication.cleanArch.domain.entities.person.user.User;

import java.util.Optional;
import java.util.UUID;

public class FindProfileById_UseCase {

    private final ProfileRepository repository;

    public FindProfileById_UseCase(ProfileRepository repository) {
        this.repository = repository;
    }

    public Optional<Profile> findUserById(UUID id) {
        return this.repository.findProfileById(id);
    }
}
