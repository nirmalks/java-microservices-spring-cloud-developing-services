package de.ksbrwsk;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

@Configuration
public class SecurityConfiguration extends GlobalAuthenticationConfigurerAdapter {

    @Override
    public void init(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("agoldberg")
                    .password("pass1")
                    .roles("USER")
                .and()
                .withUser("bgoldberg")
                    .password("pass2")
                    .roles("USER", "OPERATOR");
    }
}
