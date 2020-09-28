package com.capgemini;
import java.util.regex.*;

public class UserRegistration {
	
	public boolean validateFirstName(String firstName) throws InvalidInputException {
		
		   String pattern_first_name="[A-Z][a-z]{2,}";
		   Pattern p = Pattern.compile(pattern_first_name); 
		   Matcher m=p.matcher(firstName);
		   boolean ans= m.matches();
		   if(ans==false)
			   throw new InvalidInputException(InvalidInputException.InputType.INVALID_FIRSTNAME,"please enter first name in proper format");
		   else return true;
		   
	}
	public boolean validateLastName(String lastName) throws InvalidInputException {
		
		   String pattern_last_name="[A-Z][a-z]{2,}";
		   Pattern p = Pattern.compile(pattern_last_name); 
		   Matcher m=p.matcher(lastName);
		   boolean ans= m.matches();
		   if(ans==false)
			   throw new InvalidInputException(InvalidInputException.InputType.INVALID_LASTNAME,"please enter last name in proper format");
		   else return true;
		   
	}
	public boolean validatePhoneNumber(String phoneNumber) throws InvalidInputException{
		  String pattern_phonenumber="[0-9]{2}[\\s][0-9]{10}";
		  Pattern p = Pattern.compile(pattern_phonenumber); 
		  Matcher m=p.matcher(phoneNumber);
		  boolean ans= m.matches();
		  if(ans==false)
			   throw new InvalidInputException(InvalidInputException.InputType.INVALID_MOBILE,"please enter phone number in proper format");
		  else return true;
		  
	} 
    public boolean validatePassword(String password) throws InvalidInputException{
    	  String pattern_password="^(?=.*[!@#$%^&*|'<>.-^*{}%!])(?=.*[0-9])(?=.*[A-Z]).{8,}";
		  Pattern p = Pattern.compile(pattern_password); 
		  Matcher m=p.matcher(password);
		  boolean ans= m.matches();
		  if(ans==false)
			   throw new InvalidInputException(InvalidInputException.InputType.INVALID_PASSWORD,"please enter password in proper format");
		  else return true;

    }
    public boolean validateEmail(String email) throws InvalidInputException {
    	  String pattern_email="^[a-z0-9A-Z]+(([\\.+-][a-z0-9]{1,})?)+@[a-z0-9A-Z]+\\.([a-z]{2,6})+((\\.[a-zA-Z]{2,6})?)$";
		  Pattern p = Pattern.compile(pattern_email); 
		  Matcher m=p.matcher(email);
		  boolean ans= m.matches();
		  if(ans==false)
			   throw new InvalidInputException(InvalidInputException.InputType.INVALID_EMAIL,"please enter email in proper format");
		  else return true;
    }
}
