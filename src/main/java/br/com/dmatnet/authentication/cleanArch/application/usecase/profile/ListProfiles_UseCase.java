package br.com.dmatnet.authentication.cleanArch.application.usecase.profile;

import br.com.dmatnet.authentication.cleanArch.application.gateway.ProfileRepository;
import br.com.dmatnet.authentication.cleanArch.domain.entities.person.user.Profile;

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
