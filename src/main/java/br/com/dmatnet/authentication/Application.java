package br.com.dmatnet.authentication;

import br.com.dmatnet.authentication.model.entities.pessoa.EmailEntity;
import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.PerfilEntity;
import br.com.dmatnet.authentication.model.entities.pessoa.pessoa_fisica.usuario.UsuarioEntity;
import br.com.dmatnet.authentication.repository.PerfilRepository;
import br.com.dmatnet.authentication.repository.UsuarioRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

    @Bean
    public UsuarioEntity cadastrarUsuarioMaster (
            UsuarioRepository usuarioRepository,
            PerfilRepository perfilRepository) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        PerfilEntity perfilMaster = new PerfilEntity(
                "master"
        );

        try {
            perfilRepository.save(perfilMaster);
        } catch (DataIntegrityViolationException e) {
            logger.error(e.getMessage());
        }

        UsuarioEntity usuarioMaster = new UsuarioEntity(
                "Thiago Gonçalves Bueno",
                LocalDate.parse("1983-02-16"),
                new HashSet<>(Collections.singleton(
                        new EmailEntity(
                                "bueno_thiago@outlook.com",
                                true)
                )),
                "thiago_bueno",
                passwordEncoder.encode("Tgb#6878"),
                true,
                new ArrayList<>(Collections.singleton(perfilMaster))
        );

        try {
            UsuarioEntity usuarioNovo = usuarioRepository.save(usuarioMaster);
            logger.info(usuarioNovo.getIdPessoa().toString());
            return usuarioNovo;
        } catch (DataIntegrityViolationException e) {
            logger.error(e.getMessage());
        }

        return null;
    }

}
