package com.springsecurity.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http
		.csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
		.and()
		.authorizeRequests()
		.antMatchers("/signin").permitAll()
		.antMatchers("/public/**").hasAnyRole("USER","ADMIN")
		.antMatchers("/users/**").hasRole("ADMIN")
		.anyRequest()
		.authenticated().and()
		.formLogin().defaultSuccessUrl("/hello", true)
		.and().logout();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		auth.inMemoryAuthentication().withUser("justin").password("just123").roles("ADMIN");

		auth.inMemoryAuthentication().withUser("kang").password("kang123").roles("USER");
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
