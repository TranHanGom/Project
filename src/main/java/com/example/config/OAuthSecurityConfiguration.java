package com.example.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration

public class OAuthSecurityConfiguration extends WebSecurityConfigurerAdapter {
    
//    @Override
//	public void configure(HttpSecurity http) throws Exception {
//        http.antMatcher("/**")
//          .authorizeRequests()
//          .antMatchers("/")
//          .permitAll()
//          .anyRequest()
//          .authenticated()
//          .and()
//          .oauth2Login();
//    }
// 

}
