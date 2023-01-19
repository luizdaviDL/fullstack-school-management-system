package com.escolar.sistema.configuration;



import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperC {
	@Bean
	  ModelMapper mapper() {
		return new ModelMapper();
	}
}
