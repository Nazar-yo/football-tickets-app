package football.tickets.config;

import football.tickets.model.RoleName;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    private final UserDetailsService userDetailsService;
    private final PasswordEncoder passwordEncoder;

    public SecurityConfig(UserDetailsService userDetailsService, PasswordEncoder passwordEncoder) {
        this.userDetailsService = userDetailsService;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
    }

    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/register").permitAll()
                .antMatchers(HttpMethod.GET, "/stadiums", "/game-sessions/available",
                        "/game-sessions/{id}", "/games").authenticated()
                .antMatchers(HttpMethod.POST, "/stadiums", "/games")
                .hasRole(RoleName.ADMIN.name())
                .antMatchers(HttpMethod.PUT, "/game-sessions/{id}")
                .hasRole(RoleName.ADMIN.name())
                .antMatchers(HttpMethod.DELETE, "/game-sessions/{id}")
                .hasRole(RoleName.ADMIN.name())
                .antMatchers("/users/**")
                .hasRole(RoleName.ADMIN.name())
                .antMatchers("/orders", "/shopping-cart/**")
                .hasRole(RoleName.USER.name())
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .permitAll()
                .and()
                .httpBasic()
                .and()
                .csrf().disable();
    }
}
