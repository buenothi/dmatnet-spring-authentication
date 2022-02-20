package br.com.dmatnet.authentication.service;

import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import br.com.dmatnet.authentication.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UsuarioService implements UserDetailsService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        UsuarioEntity usuario = usuarioRepository.findByLogin(username);

        if (usuario == null) {
            throw new UsernameNotFoundException("Usuario não encontrado!");
        }

        return usuario;
    }


}
