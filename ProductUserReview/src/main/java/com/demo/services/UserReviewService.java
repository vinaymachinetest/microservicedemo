package com.demo.services;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.demo.models.UserReviewList;

@Path("reviewservice")
@Produces({ MediaType.APPLICATION_JSON })
public interface UserReviewService {
	
	@GET
	@Path("/{userId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public UserReviewList getUserReview(@PathParam("userId") String productId);
}
