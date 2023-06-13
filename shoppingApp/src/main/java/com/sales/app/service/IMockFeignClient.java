package com.sales.app.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sales.app.dto.SimilarProductDto;

import feign.FeignException;

@FeignClient(name = "MockApi", url="http://host.docker.internal:3001/product")
public interface IMockFeignClient {

	@GetMapping(("/{id}/similarids"))
	List<Long> getSimilarProducts(@PathVariable(value = "id") Long userid) throws FeignException;
	
	@GetMapping(("/{id}"))
	SimilarProductDto getProduct(@PathVariable(value = "id") Long userid) throws FeignException;
}
