package br.com.dmatnet.authentication.service;

import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import br.com.dmatnet.authentication.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Transactional
public class UsuarioService implements UserDetailsService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<UsuarioEntity> usuario = usuarioRepository.findByLogin(username);

        if (usuario.isEmpty()) {
            throw new UsernameNotFoundException("Usuario não encontrado!");
        }

        return usuario.get();
    }

    public UsuarioEntity save(UsuarioEntity usuario) {
        return usuarioRepository.save(usuario);
    }

    public void delete(UsuarioEntity usuario) {
        usuarioRepository.delete(usuario);
    }

    public Optional<UsuarioEntity> findUsuarioById(UUID id) {
        return usuarioRepository.findById(id);
    }

    public List<UsuarioEntity> listUsuariosByUsuarioPai(UUID idUsuarioPai) {
        return usuarioRepository.findByIdUsuarioPai(idUsuarioPai);
    }

}
