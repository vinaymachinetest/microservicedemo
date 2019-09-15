package com.demo.productuserreview;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.demo.services.UserReviewServiceImpl;

@Component
public class JerseyConfiguration extends ResourceConfig{
	
	@Autowired
    public JerseyConfiguration() {	
		register(UserReviewServiceImpl.class);
	}
}
