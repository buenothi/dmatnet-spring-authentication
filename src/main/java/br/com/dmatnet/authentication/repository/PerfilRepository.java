package br.com.dmatnet.authentication.repository;

import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.PerfilEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface PerfilRepository extends PagingAndSortingRepository<PerfilEntity, String> {

    Optional<PerfilEntity> findByNome(String nome);

}
