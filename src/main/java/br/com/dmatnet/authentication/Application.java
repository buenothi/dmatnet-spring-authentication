package br.com.dmatnet.authentication;

import br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.entity.EmailEntity;
import br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.entity.naturalPerson.user.ProfileEntity;
import br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.entity.naturalPerson.user.UserEntity;
import br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.repository.ProfileR2DBCRepository;
import br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.repository.UserR2DBCRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

@SpringBootApplication
public class Application {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

    }

    @Bean
    public Mono<UserEntity> cadastrarUsuarioMaster (
            UserR2DBCRepository userR2DBCRepository,
            ProfileR2DBCRepository profileR2DBCRepository) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        ProfileEntity perfilMaster = new ProfileEntity(
                "master"
        );

        try {
            profileR2DBCRepository.save(perfilMaster);
        } catch (DataIntegrityViolationException e) {
            logger.error(e.getMessage());
        }

        UserEntity usuarioMaster = new UserEntity(
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
            return userR2DBCRepository.save(usuarioMaster);
        } catch (DataIntegrityViolationException e) {
            logger.error(e.getMessage());
            UserEntity usuarioMasterGravado = userR2DBCRepository.findByLogin("thiago_bueno").get();
            logger.info(usuarioMasterGravado.getIdPessoa().toString());
        }

        return null;
    }

}
