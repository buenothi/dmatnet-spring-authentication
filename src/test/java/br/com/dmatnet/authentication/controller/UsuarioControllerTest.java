package br.com.dmatnet.authentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc(addFilters = false)
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
