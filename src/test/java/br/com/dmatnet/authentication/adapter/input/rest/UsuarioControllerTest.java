package br.com.dmatnet.authentication.adapter.input.rest;

import br.com.dmatnet.authentication.adapter.dto.usuario.UsuarioRequestDTO;
import br.com.dmatnet.authentication.model.builders.UsuarioBuilder;
import br.com.dmatnet.authentication.adapter.converter.UsuarioConverter;
import br.com.dmatnet.authentication.adapter.output.JPA.entity.pessoa_fisica.usuario.UsuarioEntity;
import br.com.dmatnet.authentication.adapter.security.UsuarioAuthService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.text.SimpleDateFormat;
import java.util.Optional;
import java.util.UUID;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
public class UsuarioControllerTest {

    @MockBean
    UsuarioAuthService usuarioAuthService;

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    UsuarioBuilder usuarioBuilder;

    @Autowired
    UsuarioConverter usuarioConverter;

    UsuarioEntity usuarioEntityMock = new UsuarioEntity();

    @BeforeEach
    public void preTest() {
        objectMapper.setDateFormat(new SimpleDateFormat("yyyy-MM-dd"));
        this.usuarioEntityMock = this.usuarioBuilder.gerarUsuarioEntityTeste();

    }

    @Test
    public void sholdBe_getUser_success() throws Exception {

        String id = UUID.randomUUID().toString();

        when(usuarioAuthService.findUsuarioById(any())).thenReturn(Optional.ofNullable(usuarioEntityMock));

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

        when(usuarioAuthService.findUsuarioById(any())).thenReturn(usuarioEntityEmpty);

        mockMvc.perform(get("/autenticacao")
                        .accept(MediaType.ALL)
                        .param("id", id))
                .andDo(print())
                .andExpect(status().isNotFound());

    }

    @Test
    public void sholdBe_saveNewUser_Success() throws Exception {

        when(usuarioAuthService.save(any())).thenReturn(usuarioEntityMock);

        UsuarioRequestDTO usuarioRequestDTO = usuarioConverter.toUsuarioRequestDTO(usuarioEntityMock);

        mockMvc.perform(post("/autenticacao")
                        .accept(MediaType.APPLICATION_JSON)
                        .contentType(MediaType.APPLICATION_JSON)
                        .characterEncoding("UTF-8")
                        .content(objectMapper.writeValueAsString(usuarioRequestDTO)))
                .andDo(print())
                .andExpect(status().isCreated());

    }

    @Test
    public void sholdBe_deleteUser_Success() throws Exception {

        String id = UUID.randomUUID().toString();

        when(usuarioAuthService.findUsuarioById(any()))
                .thenReturn(Optional.ofNullable(usuarioEntityMock));

        doNothing().when(usuarioAuthService).delete(any());

        mockMvc.perform(delete("/autenticacao")
                        .accept(MediaType.ALL)
                        .param("id", id))
                .andDo(print())
                .andExpect(status().isOk());

    }

    @Test
    public void sholdBe_deleteUser_NotFoundUser() throws Exception {

        String id = UUID.randomUUID().toString();

        Optional<UsuarioEntity> usuarioEntityEmpty = Optional.empty();

        when(usuarioAuthService.findUsuarioById(any()))
                .thenReturn(usuarioEntityEmpty);

        mockMvc.perform(delete("/autenticacao")
                        .accept(MediaType.ALL)
                        .param("id", id))
                .andDo(print())
                .andExpect(status().isNotFound());

    }

}
