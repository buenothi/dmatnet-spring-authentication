package br.com.dmatnet.authentication.application.usecase.profile;

import br.com.dmatnet.authentication.application.gateway.ProfileRepository;
import br.com.dmatnet.authentication.domain.person.user.Profile;

public class DeleteProfile_UseCase {

    private final ProfileRepository repository;

    public DeleteProfile_UseCase(ProfileRepository repository) {
        this.repository = repository;
    }

    public void deleteUser(Profile profile) {
        this.repository.deleteProfile(profile);
    }
}
