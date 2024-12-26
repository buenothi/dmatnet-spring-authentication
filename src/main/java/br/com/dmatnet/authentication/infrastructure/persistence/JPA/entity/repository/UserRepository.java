package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.repository;

import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.naturalPerson.user.UserEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends R2dbcRepository<UserEntity, UUID> {

    Optional<UserEntity> findByLogin(String login);

    List<UserEntity> findByIdUsuarioPai(UUID idUsuarioPai);

}
