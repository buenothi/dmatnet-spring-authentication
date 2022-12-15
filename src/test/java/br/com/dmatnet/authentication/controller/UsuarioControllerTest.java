package br.com.dmatnet.authentication.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@SpringBootTest
@AutoConfigureMockMvc
public class UsuarioControllerTest {

    @Autowired
    MockMvc mockMvc;

/*    @Test
    public void shouldBe_SaveNewUser_Success() {

        mockMvc.perform(MockMvcRequestBuilders
                .post("/autenticacao")
                .contentType(MediaType.APPLICATION_JSON)
                .content()

    }*/

}
