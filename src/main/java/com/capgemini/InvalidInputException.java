package com.capgemini;

public class InvalidInputException extends Exception{
	enum InputType{
		INVALID_FIRSTNAME,INVALID_LASTNAME,INVALID_EMAIL,INVALID_MOBILE,INVALID_PASSWORD
	}
	public InputType type;
	InvalidInputException(InputType type,String message){
		super(message);
		this.type=type;	
	}

}
