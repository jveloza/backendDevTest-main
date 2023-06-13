package com.sales.app.handler;

import feign.FeignException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.sales.app.response.ErrorMessageResponse;

import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class FeignExceptionHandler {

    @ExceptionHandler(FeignException.NotFound.class)  
    public ErrorMessageResponse handleFeignStatusException(FeignException e, HttpServletResponse response) {
        response.setStatus(e.status());
        return new ErrorMessageResponse("Product not found",response.getStatus()); 
    }

    @ExceptionHandler(FeignException.InternalServerError.class)  
    public ErrorMessageResponse handleFeignStatusExceptionISE(FeignException e, HttpServletResponse response) {
    	response.setStatus(e.status());
    	return new ErrorMessageResponse("Internal Server Error",response.getStatus()); 
    }
}