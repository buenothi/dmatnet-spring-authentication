package br.com.dmatnet.authentication.config;

import br.com.dmatnet.authentication.filter.JWTAuthenticationFilter;
import br.com.dmatnet.authentication.filter.JWTAuthorizationFilter;
import br.com.dmatnet.authentication.repository.UsuarioRepository;
import br.com.dmatnet.authentication.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import static org.springframework.security.config.Customizer.withDefaults;

@EnableWebSecurity
@Configuration
public class SpringSecurityConfig {

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
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private UsuarioRepository repository;

    @Autowired
    private AuthenticationConfiguration authenticationConfiguration;

    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(usuarioService)
                .passwordEncoder(new BCryptPasswordEncoder());
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests((requests) -> requests
                        .requestMatchers(PUBLIC_MATCHERS_GET)
                        .permitAll()
                        .requestMatchers(PUBLIC_MATCHERS_POST)
                        .permitAll()
                        .anyRequest().authenticated()
                )
                .addFilter(new JWTAuthenticationFilter(authenticationManager(authenticationConfiguration)))
                .addFilter(new JWTAuthorizationFilter(authenticationManager(authenticationConfiguration)))
                .httpBasic(withDefaults())
                .csrf(csrf -> csrf.disable());

        return http.build();
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

}
