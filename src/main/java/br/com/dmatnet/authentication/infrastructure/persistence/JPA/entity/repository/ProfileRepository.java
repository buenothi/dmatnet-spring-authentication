package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.repository;

import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.naturalPerson.user.ProfileEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;

import java.util.Optional;

public interface ProfileRepository extends R2dbcRepository<ProfileEntity, String> {

    Optional<ProfileEntity> findByNome(String nome);

}
