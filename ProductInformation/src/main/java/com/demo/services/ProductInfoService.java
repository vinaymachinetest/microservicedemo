package com.demo.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.demo.models.ProductInfo;
import io.swagger.annotations.Api;

@Path("/services")
@Api(value="ProductInformation Resource", produces="application/json")
public interface ProductInfoService {

	@GET
	@Path("/productinfo/{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	public ProductInfo getProductInfo(@PathParam("productId") String productId);
	
}
