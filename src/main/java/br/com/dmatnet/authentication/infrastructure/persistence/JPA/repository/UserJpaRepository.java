package br.com.dmatnet.authentication.infrastructure.persistence.JPA.repository;

import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.user.UserEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserJpaRepository extends CrudRepository<UserEntity, UUID> {

    Optional<UserEntity> findByLogin(String login);
}
