package br.com.dmatnet.authentication.infrastructure.persistence.JPA.repository;

import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.user.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserJpaRepository extends JpaRepository<UserEntity, UUID> {
}
