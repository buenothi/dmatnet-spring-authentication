package br.com.dmatnet.authentication.service;

import br.com.dmatnet.authentication.model.builders.UsuarioBuilder;
import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import br.com.dmatnet.authentication.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
public class UsuarioServiceTest {

    @MockBean
    UsuarioRepository usuarioRepository;
    @Autowired
    UsuarioService usuarioService;
    private UsuarioEntity usuario = new UsuarioEntity();
    @Autowired
    private final UsuarioBuilder usuarioBuilder = new UsuarioBuilder();

    @BeforeEach
    public void criarUsuarioMock() {

        this.usuario = this.usuarioBuilder.gerarUsuarioEntityTeste();

    }

    @Test
    public void shouldBe_callLoadUserByName_Sucess() {
        when(usuarioRepository.findByLogin(anyString()))
                .thenReturn(Optional.ofNullable(this.usuario));

        assertEquals(usuarioService.loadUserByUsername("Teste").getUsername(), "Teste");
    }

    @Test
    public void shouldBe_callLoadUserByName_ThrowUsernameNotFoundException() {
        when(usuarioRepository.findByLogin(anyString()))
                .thenReturn(Optional.empty());

        assertThrows(UsernameNotFoundException.class, () -> {
            usuarioService.loadUserByUsername("Usuario Inexistente");
        }, "Usuario não encontrado!");
    }

    @Test
    public void shouldBe_saveNewUser_Success() {
        when(usuarioRepository.save(any()))
                .thenReturn(usuario);

        assertEquals(usuarioService.save(usuario)
                .getUsername(), usuario.getUsername());
    }

    @Test
    public void shouldBe_deleteUser_Success() {
        doNothing().when(usuarioRepository).delete(any());

        usuarioService.delete(usuario);

        verify(usuarioRepository, Mockito.times(1))
                .delete(usuario);
    }

    @Test
    public void shouldBe_findUsuarioById_Success() {
        when(usuarioRepository.findById(any()))
                .thenReturn(Optional.ofNullable(usuario));

        assertEquals(usuarioService
                .findUsuarioById(UUID.randomUUID()).get().getUsername(), usuario.getUsername());
    }

    @Test
    public void shouldBe_listUsuariosByUsuarioPai_Success() {
        List<UsuarioEntity> listaUsuarioTeste = new ArrayList<>();
        listaUsuarioTeste.add(usuario);

        when(usuarioRepository.findByIdUsuarioPai(any()))
                .thenReturn(listaUsuarioTeste);

        assertEquals(usuarioService
                .listUsuariosByUsuarioPai(UUID.randomUUID()).size(), 1);

    }

    @TestConfiguration
    static class usuarioServiceTestConfiguration {

        @Bean
        public UsuarioService usuarioServiceTest() {
            return new UsuarioService();
        }

        @Bean
        public UsuarioBuilder usuarioBuilder() {
            return new UsuarioBuilder();
        }

    }

}
