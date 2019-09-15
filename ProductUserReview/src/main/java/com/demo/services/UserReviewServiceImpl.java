package com.demo.services;

import java.util.Arrays;
import java.util.List;

import com.demo.models.UserReview;
import com.demo.models.UserReviewList;

public class UserReviewServiceImpl implements UserReviewService{
	
	public UserReviewList getUserReview(String productId) {
		
		List<UserReview> reviews=Arrays.asList(new UserReview("HRX shoes","1000"));
		UserReviewList userReviewList=new UserReviewList();
		userReviewList.setUserReview(reviews);
		return userReviewList;
	}
}
