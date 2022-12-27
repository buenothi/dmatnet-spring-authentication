package br.com.dmatnet.authentication.controller;

import br.com.dmatnet.authentication.model.builders.UsuarioBuilder;
import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import br.com.dmatnet.authentication.service.UsuarioService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Optional;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
public class UsuarioControllerTest {

    @MockBean
    UsuarioService usuarioService;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    UsuarioController usuarioController;

    @Autowired
    UsuarioBuilder usuarioBuilder;

    UsuarioEntity usuarioEntityMock = new UsuarioEntity();

    @BeforeEach
    public void generateUsuarioEntity() {
        this.usuarioEntityMock = this.usuarioBuilder.gerarUsuarioEntityTeste();
    }

    @Test
    public void sholdBe_getUser_success() throws Exception {

        String id = UUID.randomUUID().toString();

        when(usuarioService.findUsuarioById(any()))
                .thenReturn(Optional.ofNullable(usuarioEntityMock));

        mockMvc.perform(get("/autenticacao")
                        .accept(MediaType.ALL)
                        .param("id", id))
                .andDo(print())
                .andExpect(status().isOk());

    }

    @Test
    public void sholdBe_getUser_NotFoundUser() throws Exception {

        String id = UUID.randomUUID().toString();

        Optional<UsuarioEntity> usuarioEntityEmpty = Optional.empty();

        when(usuarioService.findUsuarioById(any()))
                .thenReturn(usuarioEntityEmpty);

        mockMvc.perform(get("/autenticacao")
                        .accept(MediaType.ALL)
                        .param("id", id))
                .andDo(print())
                .andExpect(status().isNotFound());

    }


}
