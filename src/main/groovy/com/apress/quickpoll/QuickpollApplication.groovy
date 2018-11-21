package com.apress.quickpoll

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.servlet.config.annotation.EnableWebMvc
import org.thymeleaf.spring4.SpringTemplateEngine
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver

@SpringBootApplication
@EnableWebMvc
class QuickpollApplication {

	static void main(String[] args) {
		SpringApplication.run QuickpollApplication, args
	}

}
