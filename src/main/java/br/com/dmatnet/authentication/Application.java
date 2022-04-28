package br.com.dmatnet.authentication;

import br.com.dmatnet.authentication.model.entities.pessoa.EmailEntity;
import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.Perfil;
import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

@SpringBootApplication
public class Application {

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    private Perfil perfil = new Perfil(
            "master"
    );

    private UsuarioEntity usuarioMaster = new UsuarioEntity(
            "Thiago Gonçalves Bueno",
            Date.from(LocalDate.of(1983, 2, 16).atStartOfDay(ZoneId.systemDefault()).toInstant()),
            new HashSet<EmailEntity>(Collections.singleton(
                    new EmailEntity(
                            "bueno_thiago@outlook.com",
                            true)
            )),
            "thiago_bueno",
            passwordEncoder.encode("Tgb#6878"),
            true,
            new ArrayList<Perfil>(Collections.singleton(perfil))
    );

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

}
