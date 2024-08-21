package com.saikiran.rest.webservices.restful_web_services.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfiguration {

    @Bean
    //customizing spring security filter chain to our needs.
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        //All requests should be authenticated i.e every request should have credentials with it.
        httpSecurity.authorizeHttpRequests(
                auth -> auth.anyRequest().authenticated()
        );
        //If a request is not authenticated, a web page is shown to sign in
        httpSecurity.httpBasic(Customizer.withDefaults());
        //Disable CSRF for POST and PUT requests.
        httpSecurity.csrf().disable();
        return httpSecurity.build();
    }
}
