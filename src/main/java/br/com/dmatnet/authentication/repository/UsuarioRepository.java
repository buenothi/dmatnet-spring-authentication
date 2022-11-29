package br.com.dmatnet.authentication.repository;

import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, UUID> {

    Optional<UsuarioEntity> findById(UUID id);

    Optional<UsuarioEntity> findByLogin(String login);

    List<UsuarioEntity> findByIdUsuarioPai(Long idUsuarioPai);

}
