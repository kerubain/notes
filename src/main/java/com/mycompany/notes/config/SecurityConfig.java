package com.mycompany.notes.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
@ComponentScan
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    private DataSource dataSource;

    @Override protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/unsecured").permitAll() //todo
                .anyRequest().authenticated()
                .and()
                .csrf().disable() //basic security
                .httpBasic();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(this.dataSource)
                .rolePrefix("ROLE_") //my db does not have roles
                .authoritiesByUsernameQuery("select username, 'ROLE_USER' from users where username=?")
                .usersByUsernameQuery("select username, password, true as enabled from users where username=?")
                .passwordEncoder(new BCryptPasswordEncoder());
    }
}
