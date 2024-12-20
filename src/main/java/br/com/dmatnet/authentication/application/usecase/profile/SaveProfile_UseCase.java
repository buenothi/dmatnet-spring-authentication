package br.com.dmatnet.authentication.application.usecase.profile;

import br.com.dmatnet.authentication.application.gateway.ProfileRepository;
import br.com.dmatnet.authentication.domain.person.user.Profile;
import br.com.dmatnet.authentication.domain.person.user.User;

public class SaveProfile_UseCase {

    private final ProfileRepository repository;

    public SaveProfile_UseCase(ProfileRepository repository) {
        this.repository = repository;
    }

    public User saveProfile(Profile profile) {
        return repository.saveProfile(profile);
    }
}
