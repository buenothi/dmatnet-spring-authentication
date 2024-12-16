package br.com.dmatnet.authentication.cleanArch.domain.usecase.profile;

import br.com.dmatnet.authentication.cleanArch.application.gateway.ProfileRepository;
import br.com.dmatnet.authentication.cleanArch.application.gateway.UserRepository;
import br.com.dmatnet.authentication.cleanArch.domain.entities.person.user.Profile;
import br.com.dmatnet.authentication.cleanArch.domain.entities.person.user.User;

public class SaveProfile_UseCase {

    private final ProfileRepository repository;

    public SaveProfile_UseCase(ProfileRepository repository) {
        this.repository = repository;
    }

    public User saveProfile(Profile profile) {
        return repository.saveProfile(profile);
    }
}
