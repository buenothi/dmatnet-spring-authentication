package br.com.dmatnet.authentication.service;

import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import br.com.dmatnet.authentication.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

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

    public UsuarioEntity save(UsuarioEntity usuario) {
        return usuarioRepository.save(usuario);
    }

    public void delete(UsuarioEntity usuario) {
        usuarioRepository.delete(usuario);
    }

    public Optional<UsuarioEntity> findUsuarioById(Long id) {
        return usuarioRepository.findById(id);
    }

    public Optional<UsuarioEntity> listUsuariosByUsuarioPai (Long idUsuarioPai){
        return usuarioRepository.findById(idUsuarioPai);
    }

}
