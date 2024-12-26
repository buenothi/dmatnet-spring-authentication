package br.com.dmatnet.authentication;

import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.EmailEntity;
import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.naturalPerson.user.ProfileEntity;
import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.naturalPerson.user.UserEntity;
import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.repository.ProfileRepository;
import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.repository.UserRepository;
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
            UserRepository userRepository,
            ProfileRepository profileRepository) {

        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        ProfileEntity perfilMaster = new ProfileEntity(
                "master"
        );

        try {
            profileRepository.save(perfilMaster);
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
            return userRepository.save(usuarioMaster);
        } catch (DataIntegrityViolationException e) {
            logger.error(e.getMessage());
            UserEntity usuarioMasterGravado = userRepository.findByLogin("thiago_bueno").get();
            logger.info(usuarioMasterGravado.getIdPessoa().toString());
        }

        return null;
    }

}
