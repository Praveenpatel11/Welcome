package com.app.service;

import java.util.List;

import com.app.request.ReviewRequest;
import com.app.exception.ProductException;
import com.app.entities.Review;
import com.app.entities.User;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
