package com.demo.services;

import org.springframework.stereotype.Component;

import com.demo.models.ProductInfo;

@Component
public class ProductInfoServiceImpl implements ProductInfoService {
	
	public ProductInfo getProductInfo( String productId) {
		return new ProductInfo(productId, "HRX by Hrithik Roshan Grey Synthetic Regular Running");
	}	
}
