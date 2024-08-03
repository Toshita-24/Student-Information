package com.example.StuInfo.Security;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;


@Configuration
@EnableWebSecurity
public class SecurityConfig{
	   @SuppressWarnings("unused")
	@Autowired
	    private UserDetailsService userDetailsService;
	   
	   @SuppressWarnings({ "removal", "deprecation" })
	protected void configure(HttpSecurity http) throws Exception {
	        http.csrf().disable()
	            .authorizeRequests()
	            .requestMatchers("/api/students/**").hasRole("STUDENT")
	            .requestMatchers("/api/subjects/**").hasRole("ADMIN")
	            .anyRequest().authenticated()
	            .and()
	            .oauth2Login();
	    }
	   protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	    }
	private PasswordEncoder passwordEncoder() {
		// TODO Auto-generated method stub
		return null;
	}
}