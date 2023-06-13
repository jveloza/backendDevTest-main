package com.sales.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sales.app.dto.SimilarProductDto;
import com.sales.app.service.IMockFeignClient;
import com.sales.app.service.IShoppingService;

import feign.FeignException;

@Service
public class ShoppingService implements IShoppingService{

	@Autowired
	private IMockFeignClient iMockFeignClient;
	
	public List<SimilarProductDto> getSimilarProducts(Long userid) throws FeignException
	{
		var similarproducts = iMockFeignClient.getSimilarProducts(userid);
		var similarproductsdetail = new ArrayList<SimilarProductDto>();
		similarproducts.forEach(s -> similarproductsdetail.add(iMockFeignClient.getProduct(s)));
		return similarproductsdetail;
	}
}
