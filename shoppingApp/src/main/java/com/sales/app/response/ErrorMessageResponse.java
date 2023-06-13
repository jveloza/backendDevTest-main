package com.sales.app.response;

public class ErrorMessageResponse {

	private final String message;
	private final Integer error;

	public ErrorMessageResponse(String message, Integer error) {
		super();
		this.message = message;
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public Integer getError() {
		return error;
	}
}