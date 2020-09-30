package com.capgemini;

public class UserRegistration {
	
	public static final String FIRSTNAME_PATTERN="[A-Z][a-z]{2,}";
	public static final String LASTNAME_PATTERN="[A-Z][a-z]{2,}";
	public static final String PHONENUMBER_PATTERN="[0-9]{2}[\\s][0-9]{10}";
	public static final String PASSWORD_PATTERN="^(?=.*[!@#$%^&*|'<>.-^*{}%!])(?=.*[0-9])(?=.*[A-Z]).{8,}";
	public static final String EMAIL_PATTERN="^[a-z0-9A-Z]+(([\\.+-][a-z0-9]{1,})?)+@[a-z0-9A-Z]+\\.([a-z]{2,6})+((\\.[a-zA-Z]{2,6})?)$";
	
	
	public boolean validateFirstName(String firstName) throws InvalidInputException {
		   boolean ans= InputValidation.check(FIRSTNAME_PATTERN, firstName);
		   if(ans==false)
			   throw new InvalidInputException(InvalidInputException.InputType.INVALID_FIRSTNAME,"please enter first name in proper format");
		   else return true;
		   
	}
	public boolean validateLastName(String lastName) throws InvalidInputException {
		   boolean ans=InputValidation.check(LASTNAME_PATTERN, lastName);
		   if(ans==false)
			   throw new InvalidInputException(InvalidInputException.InputType.INVALID_LASTNAME,"please enter last name in proper format");
		   else return true;
		   
	}
	public boolean validatePhoneNumber(String phoneNumber) throws InvalidInputException{
		  boolean ans= InputValidation.check(PHONENUMBER_PATTERN, phoneNumber);
		  if(ans==false)
			   throw new InvalidInputException(InvalidInputException.InputType.INVALID_MOBILE,"please enter phone number in proper format");
		  else return true;
		  
	} 
    public boolean validatePassword(String password) throws InvalidInputException{
		  boolean ans= InputValidation.check(PASSWORD_PATTERN, password);
		  if(ans==false)
			   throw new InvalidInputException(InvalidInputException.InputType.INVALID_PASSWORD,"please enter password in proper format");
		  else return true;

    }
    public boolean validateEmail(String email) throws InvalidInputException {
		  boolean ans= InputValidation.check(EMAIL_PATTERN, email);
		  if(ans==false)
			   throw new InvalidInputException(InvalidInputException.InputType.INVALID_EMAIL,"please enter email in proper format");
		  else return true;
    }
}
