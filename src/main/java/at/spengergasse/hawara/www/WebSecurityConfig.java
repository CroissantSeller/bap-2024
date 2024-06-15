package at.spengergasse.hawara.www;

import org.springframework.context.annotation.*;
import org.springframework.security.config.*;
import org.springframework.security.config.annotation.web.builders.*;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests(authorizer -> authorizer
                        .requestMatchers("/login").permitAll()
                        .requestMatchers("/users/all", "/users/addUser").authenticated()
                        .anyRequest().authenticated())
                .csrf(csrf -> csrf.disable())
                .httpBasic(Customizer.withDefaults())
                .formLogin(formLogin -> formLogin.defaultSuccessUrl("/users/all", true))
                .logout((logout) -> logout
                .logoutSuccessUrl("/login?logout"));
        return http.build();
    }
}
