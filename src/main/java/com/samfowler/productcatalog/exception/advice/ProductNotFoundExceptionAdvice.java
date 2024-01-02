package com.samfowler.productcatalog.exception.advice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.samfowler.productcatalog.exception.ProductNotFoundException;


@ControllerAdvice
public class ProductNotFoundExceptionAdvice {
	@ResponseBody
	@ExceptionHandler(ProductNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String locationNotFoundHandler(ProductNotFoundException ex) {
		return ex.getMessage();
	}

}


