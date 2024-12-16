package br.com.dmatnet.authentication.cleanArch.application.usecase.profile;

import br.com.dmatnet.authentication.cleanArch.application.gateway.ProfileRepository;
import br.com.dmatnet.authentication.cleanArch.domain.entities.person.user.Profile;

public class DeleteProfile_UseCase {

    private final ProfileRepository repository;

    public DeleteProfile_UseCase(ProfileRepository repository) {
        this.repository = repository;
    }

    public void deleteUser(Profile profile) {
        this.repository.deleteProfile(profile);
    }
}
