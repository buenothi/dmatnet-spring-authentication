package br.com.dmatnet.authentication.application.usecase.profile;

import br.com.dmatnet.authentication.application.gateway.ProfileRepository;
import br.com.dmatnet.authentication.domain.person.user.Profile;

import java.util.List;

public class ListProfiles_UseCase {

    private final ProfileRepository repository;

    public ListProfiles_UseCase(ProfileRepository repository) {
        this.repository = repository;
    }

    public List<Profile> listProfile() {
        return this.repository.findAllProfiles();
    }
}
