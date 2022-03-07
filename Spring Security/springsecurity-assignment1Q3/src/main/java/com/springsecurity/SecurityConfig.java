package com.springsecurity;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	DataSource datasource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	
		auth.jdbcAuthentication().dataSource(datasource)
		.usersByUsernameQuery("Select username,password,enabled "
		+"from users"
	    +" where username = ?")
		.authoritiesByUsernameQuery("Select username,authority "
				+"from authorities "
				+"where username = ?");
		
	}
	
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http
		    .authorizeRequests()
		    .antMatchers("/admin").hasRole("ADMIN")
		    .antMatchers("/user").hasAnyRole("ADMIN","USER")
		    .antMatchers("/").permitAll()
		    .and()
		    .formLogin().loginPage("/login")
		    .failureUrl("/login.jsp?error=1").loginProcessingUrl("/login")
		    .permitAll().and().logout();
	}


	@Bean
	public PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

	
	
	
}
