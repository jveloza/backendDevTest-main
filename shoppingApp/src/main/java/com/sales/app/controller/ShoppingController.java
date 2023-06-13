package com.sales.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sales.app.service.IShoppingService;

@RestController
@RequestMapping("/product")
public class ShoppingController {

	@Autowired
	private IShoppingService iShoppingService;
	
	@GetMapping("/{id}/similar")
	public ResponseEntity<?> read(@PathVariable(value = "id") Long userid){
		return ResponseEntity.ok(iShoppingService.getSimilarProducts(userid));
	}
}
