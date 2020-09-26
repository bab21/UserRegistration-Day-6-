package com.capgemini;
import java.util.regex.*;

public class UserRegistration {
	
	public boolean validateFirstName(String firstName) {
		
		   String pattern_first_name="[A-Z][a-z]{2,}";
		   Pattern p = Pattern.compile(pattern_first_name); 
		   Matcher m=p.matcher(firstName);
		   return m.matches();
	}
	public boolean validateLastName(String lastName) {
		
		   String pattern_last_name="[A-Z][a-z]{2,}";
		   Pattern p = Pattern.compile(pattern_last_name); 
		   Matcher m=p.matcher(lastName);
		   return m.matches();
	}
	public boolean validatePhoneNumber(String phoneNumber) {
		  String pattern_phonenumber="[0-9]{2}[\\s][0-9]{10}";
		  Pattern p = Pattern.compile(pattern_phonenumber); 
		  Matcher m=p.matcher(phoneNumber);
		  return m.matches();
	} 
    public boolean validatePassword(String password) {
    	  String pattern_password="^(?=.*[!@#$%^&*|'<>.-^*{}%!])(?=.*[0-9])(?=.*[A-Z]).{8,}";
		  Pattern p = Pattern.compile(pattern_password); 
		  Matcher m=p.matcher(password);
		  return m.matches();
    }
    public boolean validateEmail(String email) {
    	  String pattern_email="^[a-z0-9A-Z]+(([\\.+-][a-z0-9]{1,})?)+@[a-z0-9A-Z]+\\.([a-z]{2,6})+((\\.[a-zA-Z]{2,6})?)$";
		  Pattern p = Pattern.compile(pattern_email); 
		  Matcher m=p.matcher(email);
		  return m.matches();
    }
}
