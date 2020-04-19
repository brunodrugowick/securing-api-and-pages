package dev.drugowick.securingapiandpages.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("BASIC", "API_BASIC").and()
                .withUser("admin").password("{noop}password").roles("ADMIN", "API_ADMIN");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .requestMatchers(PathRequest.toStaticResources().atCommonLocations()).permitAll()
                .antMatchers("/api/roles/**").hasRole("API_ADMIN")
                .antMatchers("/api/users/**").hasAnyRole("API_BASIC", "API_ADMIN")
                .antMatchers("/roles/**").hasRole("ADMIN")
                .antMatchers("/users/**").hasAnyRole("ADMIN", "BASIC")
                .antMatchers("/").permitAll()
                .and().formLogin();
    }
}
