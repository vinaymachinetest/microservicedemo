package com.demo.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.glassfish.jersey.server.ResourceConfig;
import com.demo.services.ProductInfoServiceImpl;

@Component
public class JerseyConfiguration extends ResourceConfig{
	
	@Autowired
    public JerseyConfiguration() {	
		register(ProductInfoServiceImpl.class);
	}
}
