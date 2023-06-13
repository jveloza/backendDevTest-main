package com.sales.app.service;

import java.util.List;

import com.sales.app.dto.SimilarProductDto;

import feign.FeignException;

public interface IShoppingService {

	List<SimilarProductDto> getSimilarProducts(Long userid) throws FeignException;
	
}
