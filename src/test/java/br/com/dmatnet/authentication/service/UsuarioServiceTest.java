package br.com.dmatnet.authentication.service;

import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import br.com.dmatnet.authentication.repository.UsuarioRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class UsuarioServiceTest {

    @TestConfiguration
    static class usuarioServiceTestConfiguration {

        @Bean
        public UsuarioService usuarioServiceTest() {
            return new UsuarioService();
        }

    }

    @MockBean
    UsuarioRepository usuarioRepository;

    @Autowired
    UsuarioService usuarioService;

    private UsuarioEntity usuario = new UsuarioEntity();

    @BeforeEach
    public void criarUsuarioMock() {
        this.usuario.setIdUsuarioPai(UUID.randomUUID());
        this.usuario.setSenha("123");
        this.usuario.setAtivo(true);
        this.usuario.setPerfis(null);
        this.usuario.setLogin("Teste");
        this.usuario.setDataCadastroPessoa(Date.from(LocalDate.now()
                .atStartOfDay(ZoneId.systemDefault()).toInstant()));
        this.usuario.setIdPessoa(UUID.randomUUID());
    }

    @Test
    public void chamarLoadUserByNameSucessoTest() {
        when(usuarioRepository.findByLogin(anyString()))
                .thenReturn(Optional.ofNullable(this.usuario));

        assertEquals(usuarioService.loadUserByUsername("Teste").getUsername(), "Teste");
    }

    @Test
    public void chamarLoadUserByNameComUsuarioVazioTest() {
        when(usuarioRepository.findByLogin(anyString()))
                .thenReturn(Optional.empty());

        assertThrows(UsernameNotFoundException.class, () -> {
            usuarioService.loadUserByUsername("Usuario Inexistente");
        }, "Usuario não encontrado!");
    }

}
