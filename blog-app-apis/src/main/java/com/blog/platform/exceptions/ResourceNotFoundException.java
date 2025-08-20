package com.blog.platform.exceptions;

public class ResourceNotFoundException extends RuntimeException{
	
	private String resourceName;
	private String fieldName;
	private String fieldValue;
	
	public <T>ResourceNotFoundException(String resourceName,String fieldName, T fieldValue){
		super(String.format("%s not found with %s: %s",resourceName,fieldName,fieldValue ));
		this.resourceName=resourceName;
		this.fieldName=fieldName;
		this.fieldValue=fieldValue.toString();
	}
	
}