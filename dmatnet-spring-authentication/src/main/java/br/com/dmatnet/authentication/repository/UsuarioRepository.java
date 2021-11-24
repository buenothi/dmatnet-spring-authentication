package br.com.dmatnet.authentication.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;

public interface UsuarioRepository extends PagingAndSortingRepository<UsuarioEntity, Long>{

}
