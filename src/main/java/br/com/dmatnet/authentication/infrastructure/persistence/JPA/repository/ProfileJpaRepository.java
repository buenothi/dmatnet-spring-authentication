package br.com.dmatnet.authentication.infrastructure.persistence.JPA.repository;

import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.user.ProfileEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileJpaRepository extends JpaRepository<ProfileEntity, String> {
}
