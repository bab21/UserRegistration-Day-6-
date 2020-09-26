package UserRegistration;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before;

import com.capgemini.UserRegistration;

public class UserRegisterTest {
	  UserRegistration object;
	   @Before
	   public void before() {
		   object=new UserRegistration();
	   }
	

	   @Test
	   public void testFirstName() {
		
		   //happy test cases..
		assertTrue(object.validateFirstName("Babli"));
		assertTrue(object.validateFirstName("Babliygh"));
		  // sad test cases
		assertFalse(object.validateFirstName("babli"));
		assertFalse(object.validateFirstName("bi"));
//		assertEquals(true,object.validateFirstName("blli"));
		System.out.println("Testing first Name");
		
	   }
	   @Test
	   public void testLastName() {
		 //happy test cases..
		    assertTrue(object.validateLastName("Yadav"));
		    // sad test cases
			assertFalse(object.validateLastName("Ya"));
//			assertEquals(true,object.validateFirstName("blli"));
			System.out.println("Testing last Name  ");
		   
	   }
	   @Test
	   public void testEmail() {
		   //happy test cases..
		   assertTrue(object.validateEmail("abc@yahoo.com"));
		   assertTrue(object.validateEmail("abc-100@yahoo.com"));
		   assertTrue(object.validateEmail("abc-100@yahoo.com"));
		   assertTrue(object.validateEmail("abc.100@yahoo.com"));
		   assertTrue(object.validateEmail("abc111@abc.com"));
		   assertTrue(object.validateEmail("abc@1.com"));
		   assertTrue(object.validateEmail("abc@gmail.com"));
		   assertTrue(object.validateEmail("ab+100@yahoo.com"));
		   
		   //sad test cases.....
		   assertFalse(object.validateEmail("abc@.com"));
		   assertFalse(object.validateEmail("abc123@gmail.c"));
		   assertFalse(object.validateEmail(".abc123@abc.com"));
		   assertFalse(object.validateEmail("abc..2002@gmail.com"));
		   System.out.println("Testing Email number ");
		   
		   
		   
	   }
	   @Test
	   public void testPhoneNumber() {
		   //happy test cases
		   assertTrue(object.validatePhoneNumber("98 9876543210"));
		   assertTrue(object.validatePhoneNumber("79 9876543210"));
		   assertTrue(object.validatePhoneNumber("86 9876543210"));
		   
		   // sad test cases
		   assertFalse(object.validatePhoneNumber("9 9876543210"));
		   assertFalse(object.validatePhoneNumber("999876543210"));
		   assertFalse(object.validatePhoneNumber("9 987654321089"));
		   System.out.println("Testing phone number");
		   
		   
	   }
	   @Test
	   public void testPassword() {
		 //happy test cases
		   assertTrue(object.validatePassword("babjjj@123AB"));
		// sad test cases
		   assertFalse(object.validatePassword("babjjj@123aa"));
		   assertFalse(object.validatePassword("babjjj@asdf"));
		   
		   System.out.println("Testing Password number");
		   
	   }
	

}
