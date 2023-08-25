package com.app.service;

import java.util.List;

import com.app.request.RatingRequest;
import com.app.exception.ProductException;
import com.app.entities.Rating;
import com.app.entities.User;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
