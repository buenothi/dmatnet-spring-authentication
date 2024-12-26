package br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.repository;

import br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.entity.naturalPerson.user.UserEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserR2DBCRepository extends ReactiveCrudRepository<UserEntity, UUID> {

    Optional<UserEntity> findByLogin(String login);

    List<UserEntity> findByIdUsuarioPai(UUID idUsuarioPai);

}
