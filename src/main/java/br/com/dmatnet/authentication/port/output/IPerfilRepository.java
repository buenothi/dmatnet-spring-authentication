package br.com.dmatnet.authentication.port.output;

import br.com.dmatnet.authentication.domain.model.usuario.Perfil;

import java.util.Optional;

public interface IPerfilRepository {

    Optional<Perfil> findByNome(String nome);
}
