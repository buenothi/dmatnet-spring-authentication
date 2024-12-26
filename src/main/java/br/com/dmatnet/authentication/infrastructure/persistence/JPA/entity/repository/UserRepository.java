package br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.repository;

import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.naturalPerson.user.UserEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends ReactiveCrudRepository<UserEntity, UUID> {

    Optional<UserEntity> findByLogin(String login);

    List<UserEntity> findByIdUsuarioPai(UUID idUsuarioPai);

}
