package com.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.demo.models.ProductDetails;
import com.demo.models.ProductInfo;
import com.demo.models.UserReviewList;

@Component
public class ProductsImpl implements Products{

	@Autowired
	private RestTemplate restTemplate;
	
	public List<ProductDetails> getProductDetails( String userId) {
		
	   UserReviewList reviews = restTemplate.getForObject("http://PRODUCT-USER-REVIEW/reviewservice/" + userId, UserReviewList.class);
	   return reviews.getUserReview().stream().map(review -> {
				ProductInfo productInfo= restTemplate.getForObject("http://PRODUCT-INFORMATION/services/productinfo/" + review.getProductName(), ProductInfo.class);
				return new ProductDetails(productInfo.getProductId(),productInfo.getProductName(),review.getPrice());
			 }).collect(Collectors.toList());	
		//return null;
 }
}
