/*
package br.com.dmatnet.authentication.infrastructure.config;

import br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.entity.EmailEntity;
import br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.entity.naturalPerson.user.ProfileEntity;
import br.com.dmatnet.authentication.infrastructure.persistence.R2DBC.entity.naturalPerson.user.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.dao.DataIntegrityViolationException;
import reactor.core.publisher.Mono;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

@Slf4j
//@Configuration
public class CreateUserMasterRoot {

    private Logger logger;

    @Bean
    public Mono<UserEntity> cadastrarUsuarioMaster (
            UserR2DBCRepository userR2DBCRepository,
            ProfileR2DBCRepository profileR2DBCRepository) {

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
                "Tgb#6878",
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
*/
