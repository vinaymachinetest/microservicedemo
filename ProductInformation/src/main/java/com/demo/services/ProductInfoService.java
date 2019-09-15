package com.demo.services;



import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demo.models.ProductInfo;

@Path("productinfoservice")
@Produces({ MediaType.APPLICATION_JSON })
public interface ProductInfoService {

	@GET
	@Path("/{productId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public ProductInfo getProductInfo(@PathParam("productId") String productId);
	
}
