package br.com.dmatnet.authentication.application.usecase.profile;

import br.com.dmatnet.authentication.application.gateway.ProfileRepository;
import br.com.dmatnet.authentication.domain.person.user.Profile;

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
