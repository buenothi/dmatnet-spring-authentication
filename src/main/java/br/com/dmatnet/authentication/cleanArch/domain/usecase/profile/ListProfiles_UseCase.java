package br.com.dmatnet.authentication.cleanArch.domain.usecase.profile;

import br.com.dmatnet.authentication.cleanArch.application.gateway.ProfileRepository;
import br.com.dmatnet.authentication.cleanArch.application.gateway.UserRepository;
import br.com.dmatnet.authentication.cleanArch.domain.entities.person.user.Profile;
import br.com.dmatnet.authentication.cleanArch.domain.entities.person.user.User;

import java.util.List;
import java.util.UUID;

public class ListProfiles_UseCase {

    private final ProfileRepository repository;

    public ListProfiles_UseCase(ProfileRepository repository) {
        this.repository = repository;
    }

    public List<Profile> listProfile() {
        return this.repository.findAllProfiles();
    }
}
