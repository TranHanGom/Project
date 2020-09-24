package com.example.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;


import com.example.service.UserService;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserService userDetailsService;
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http

				.authorizeRequests().antMatchers("/").permitAll().anyRequest().authenticated();

	}

	
//
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests().antMatchers("/login").permitAll().anyRequest().authenticated().and().formLogin() 
//				.loginPage("/login").defaultSuccessUrl("/formLoginSuccess").and().logout() 
//				.and().oauth2Login() 
//				.loginPage("/login").defaultSuccessUrl("/oauth2LoginSuccess").and().csrf().disable(); 
//	}

	
}