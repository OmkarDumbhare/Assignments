package com.springsecurity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.springsecurity.models.User;
import com.springsecurity.repository.UserRepository;

@SpringBootApplication
@EnableWebMvc
public class SpringSecurityLearnApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityLearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		User user = new User();
		user.setEmail("josh@gmial.com");
		user.setUsername("josh");
		user.setPassword(this.bCryptPasswordEncoder.encode("josh"));
		user.setRole("ROLE_NORMAL");
		this.userRepository.save(user);
		
		User user1 = new User();
		user1.setEmail("james@gmial.com");
		user1.setUsername("james");
		user1.setPassword(this.bCryptPasswordEncoder.encode("james"));
		user1.setRole("ROLE_ADMIN");
		this.userRepository.save(user1);
	}

}
