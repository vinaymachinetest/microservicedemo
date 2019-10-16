package com.demo.productinformation;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.demo.services.ProductInfoServiceImpl;
import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;

@Component
public class JerseyConfiguration extends ResourceConfig{
	
	@Autowired
    public JerseyConfiguration() {	
		register(ProductInfoServiceImpl.class);
		this.configureSwagger();
		property(ServletProperties.FILTER_FORWARD_ON_404, true);
	}
	private void configureSwagger() {
		     
	    this.register(ApiListingResource.class);
		this.register(SwaggerSerializers.class);
		BeanConfig config = new BeanConfig();
		config.setConfigId("ProductInformation");
		config.setTitle("ProductInformation Microservices");
		config.setVersion("v1");        
		config.setBasePath("/");
		config.setResourcePackage("com.demo.services");
		config.setPrettyPrint(true);
		config.setScan(true);
		//config.setContact("vinay");
		// config.setSchemes(new String[] { "http", "https" });
	}
}
