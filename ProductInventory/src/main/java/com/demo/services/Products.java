package com.demo.services;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.demo.models.ProductDetails;

@Path("productservice")
@Produces({ MediaType.APPLICATION_JSON })
public interface Products {
	
	@GET
	@Path("/{userId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public List<ProductDetails> getProductDetails(@PathParam("userId") String userId);
}
