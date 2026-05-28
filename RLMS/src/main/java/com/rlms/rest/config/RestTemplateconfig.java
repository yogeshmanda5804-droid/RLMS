package com.rlms.rest.config;

import java.beans.BeanProperty;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateconfig {

	@Bean
	   public RestTemplate restTemplate() {

	        return new RestTemplate();
	    }
}
