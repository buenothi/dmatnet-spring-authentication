package br.com.dmatnet.authentication.infrastructure.config;

import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.abstractPerson.EmailEntity;
import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.user.ProfileEntity;
import br.com.dmatnet.authentication.infrastructure.persistence.JPA.entity.person.user.UserEntity;
import br.com.dmatnet.authentication.infrastructure.persistence.JPA.repository.ProfileJpaRepository;
import br.com.dmatnet.authentication.infrastructure.persistence.JPA.repository.UserJpaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

@Slf4j
@Configuration
public class CreateUserMasterRoot {

    private final PasswordEncoder passwordEncoder;

    public CreateUserMasterRoot(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Bean
    public UserEntity cadastrarUsuarioMaster (
            UserJpaRepository userRepository,
            ProfileJpaRepository profileRepository) {

        ProfileEntity perfilMaster = ProfileEntity.builder()
                .name("master")
                .build();

        try {
            profileRepository.save(perfilMaster);
        } catch (DataIntegrityViolationException e) {
            log.error(e.getMessage());
        }

        UserEntity usuarioMaster = UserEntity
                .builder()
                .name("Thiago Gonçalves Bueno")
                .birthDate(LocalDate.parse("1983-02-16"))
                .emails(Collections.singleton((new EmailEntity("bueno_thiago@outlook.com", true))))
                .login("thiago_bueno")
                .password(passwordEncoder.encode("Tgb#6878"))
                .activeUser(true)
                .profiles(new ArrayList<>(Collections.singleton(perfilMaster)))
                .build();

        try {
            return userRepository.save(usuarioMaster);
        } catch (DataIntegrityViolationException e) {
            log.error(e.getMessage());
            UserEntity usuarioMasterGravado = userRepository.findByLogin("thiago_bueno").orElse(null);
            assert usuarioMasterGravado != null;
            log.info("O usuário master já foi criado sob o id {}", usuarioMasterGravado.getIdPerson().toString());
        }

        return null;
    }
}
