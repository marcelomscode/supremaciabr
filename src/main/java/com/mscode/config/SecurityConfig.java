package com.mscode.config;


import com.mscode.entity.User;
import com.mscode.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import java.util.HashSet;
import java.util.Set;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Autowired
    private UserRepository userRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;


//    @Autowired
//    private SecurityDatabaseService securityDatabaseService;


    @Bean
    public UserDetailsService userDetailsService() {
        return username -> {
            User user = userRepository.findByUsername(username);
            if (user == null) {
                throw new UsernameNotFoundException(username);
            }
            Set<GrantedAuthority> authorities = new HashSet<>();
            user.getRoles().forEach(role -> authorities.add(new SimpleGrantedAuthority("ROLE_" + role)));
            return new org.springframework.security.core.userdetails.User(user.getUsername(),
                    user.getPassword(), authorities);
        };
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/","/regimeinterno","/treinamento","/calendario","/recrutamento",
                                       "/email/**", "/resources/**", "/fonts/**", "/static/**", "/css/**", "/js/**", "/images/**")
                                .permitAll()
                                .requestMatchers("/adm/**").hasRole("MANAGERS")
                                .anyRequest()
                                .authenticated()

                )
                .formLogin((formLogin) ->
                        formLogin
                            .loginPage("/login")
                            .defaultSuccessUrl("/adm/console", true)
                            .failureUrl("/login-error")
                            .permitAll()
                ).logout( (logout) -> logout
                        .logoutSuccessUrl("/")
                        .deleteCookies("JSESSIONID")
                );
        return http.build();
    }
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}


