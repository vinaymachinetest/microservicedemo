package com.demo.productinventory;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.demo.services.ProductsImpl;

@Component
public class JerseyConfiguration extends ResourceConfig{
	
	@Autowired
    public JerseyConfiguration() {	
		register(ProductsImpl.class);
	}
}
