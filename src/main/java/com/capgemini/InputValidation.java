package com.capgemini;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


@FunctionalInterface
interface InputValidate{
	public boolean validateInput(String pattern,String value);
}

public class InputValidation {
	
	  public static boolean check(String pattern,String value){
		  
	   InputValidate ans1= (pat,val)->{
	   Pattern p = Pattern.compile(pat); 
	   Matcher m=p.matcher(val);
	   return m.matches();
	   };
	   
	   boolean ans=ans1.validateInput(pattern,value);
	   return ans;
	   
	}
}