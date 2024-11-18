package com.vamshi.springrestapp.exception;

public class UserNotFoundException extends RuntimeException{

    private String resourceName;
    private String fieldName;
    private Long fieldValue;

    public UserNotFoundException(String resourceName, String fieldName, Long fieldValue)
    {
        super(resourceName+"is Not Found with "+fieldName+" :" +
                fieldValue);
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }

}
