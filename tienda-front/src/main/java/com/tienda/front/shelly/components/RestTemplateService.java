package com.tienda.front.shelly.components;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateService {

	public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }	
	
}
