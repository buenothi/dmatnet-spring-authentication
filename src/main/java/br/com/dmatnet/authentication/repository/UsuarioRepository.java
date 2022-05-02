package br.com.dmatnet.authentication.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends PagingAndSortingRepository<UsuarioEntity, UUID>{

    @Override
    Optional<UsuarioEntity> findById(UUID id);

    Optional<UsuarioEntity> findByLogin(String login);

    List<UsuarioEntity> findByIdUsuarioPai(Long idUsuarioPai);

}
