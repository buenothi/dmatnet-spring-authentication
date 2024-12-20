package br.com.dmatnet.authentication.infrastructure.persistence.repository;

import br.com.dmatnet.authentication.infrastructure.persistence.entity.pessoa_fisica.usuario.PerfilEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PerfilRepository extends JpaRepository<PerfilEntity, String> {

    Optional<PerfilEntity> findByNome(String nome);

}
