package br.com.dmatnet.authentication.config;

import br.com.dmatnet.authentication.repository.UsuarioRepository;
import br.com.dmatnet.authentication.service.TokenService;
import br.com.dmatnet.authentication.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@Configuration
public class SpringSecurityConfig {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private TokenService tokenService;

    @Autowired
    private UsuarioRepository repository;

    private static final String[] PUBLIC_MATCHERS_GET = {
            "/actuator/**",
            "/v3/api-docs",
            "/configuration/**",
            "/swagger*/**",
            "/webjars/**"
    };

    private static final String[] PUBLIC_MATCHERS_POST = {
            "/autenticacao/auth"
    };



    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(usuarioService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
