package br.com.dmatnet.authentication.application.gateway;

import br.com.dmatnet.authentication.domain.person.user.Profile;
import br.com.dmatnet.authentication.domain.person.user.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ProfileRepository {

    Optional<Profile> findProfileByName(String name);

    void deleteProfile(Profile profile);

    Optional<Profile> findProfileById(UUID id);

    List<Profile> findAllProfiles();

    User saveProfile(Profile profile);
}
