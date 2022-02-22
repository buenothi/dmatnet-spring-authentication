package br.com.dmatnet.authentication.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends PagingAndSortingRepository<UsuarioEntity, Long>{

    UsuarioEntity findByLogin(String login);

    List<UsuarioEntity> findByIdUsuarioPai(Long idUsuarioPai);

}
