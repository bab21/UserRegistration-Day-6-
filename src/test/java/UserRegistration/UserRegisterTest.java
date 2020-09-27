package UserRegistration;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import com.capgemini.UserRegistration;


@RunWith(Parameterized.class)
public class UserRegisterTest {
	  private String email;
	  private boolean validate_email_result;
	  private UserRegistration object;
	  
	  @Before
	   public void before() {
		   object=new UserRegistration();
	   }
	   
	 public UserRegisterTest(String email,boolean validate_email_result){
		  
		  this.email=email;
		  this.validate_email_result=validate_email_result;
	  }
	  
	  
	   @Parameterized.Parameters
	   public static Collection input() {
		   return Arrays.asList(new Object[][]{
			   { "abc@yahoo.com",true},
			   {"abc@.com",false},
			   {"abc.100@yahoo.com",true},
			   {"ab+100@yahoo.com",true},
			   {"abc@.com",false},
			   {"abc..2002@gmail.com",false},
			   {".abc123@abc.com",false},
			   {"ab+100@yahoo.com",true},
			   {"abc+100@gmail.com",true},
			   {"abc-100@abc.net",true},
			   {"abc@gmail.com.com",true},
			   {"abc@gmail.a",false},
			   {"abc()*@gmail.com",false},
			   {"abc@1.com",true},
			   {"abc.100@abc.com.au", true},
			   {"abc..2002@gmail.com",false},
			   {"abc.@gmail.com",false},
			   {"abc@gmail.com.1a",false},
			   {"abc@%*.com",false},
			   {"abc()*@gmail.com",false},
			   {"abcd..2002@gmail.com",false}
			   
			   });
		   
	   }
	


	   @Test
	   public void testEmail() {
		   
		   System.out.println("validating email");
		   assertEquals(validate_email_result,object.validateEmail(email));
	   }
//	   
	

}
