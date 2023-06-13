package com.sales.app.dto;

public final class SimilarProductDto {
	
	private final Long id;
    private final String name;
    private final Double price;
    private final Boolean availability;
	
    public SimilarProductDto(Long id, String name, Double price, Boolean availability) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.availability = availability;
	}

	public Long getId() {
		return id;
	}
	
    public String getName() {
		return name;
	}
	
    public Double getPrice() {
		return price;
	}
	
    public Boolean getAvailability() {
		return availability;
	}
}
