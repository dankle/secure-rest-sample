package com.jayway.template.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;

@Configuration
@ComponentScan("com.jayway.template")
@ImportResource("classpath:applicationContext-security.xml")
@PropertySource("web-default.properties")
public class WebConfig {
	
	@Bean(name="passwordEncoder")
	@Autowired
	public PasswordEncoder passwordEncoder(Environment env) {
		return new StandardPasswordEncoder(env.getProperty("security.secret"));
	}
}
