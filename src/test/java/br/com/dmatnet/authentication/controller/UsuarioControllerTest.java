package br.com.dmatnet.authentication.controller;

import br.com.dmatnet.authentication.model.converter.UsuarioConverter;
import br.com.dmatnet.authentication.service.UsuarioService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@WebMvcTest
public class UsuarioControllerTest {

    @MockBean
    UsuarioService usuarioService;

    @MockBean
    UsuarioConverter usuarioConverter;

    @MockBean
    BCryptPasswordEncoder encoder;

    @Test
    public void deveSalvarUsuarioTest() {

    }
}
