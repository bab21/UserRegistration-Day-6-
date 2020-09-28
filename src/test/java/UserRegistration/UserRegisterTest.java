package UserRegistration;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;

import com.capgemini.InvalidInputException;
import com.capgemini.UserRegistration;

public class UserRegisterTest {
	UserRegistration object;
	   @Before
	   public void before() {
		   object=new UserRegistration();
	   }
	

	   @Test
	   public void testFirstName1() {
		   try {
		      assertTrue(object.validateFirstName("Babli"));		      
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   }
	   }
	   
	   @Test
	   public void testFirstName2() {
		   try {
		      assertTrue(object.validateFirstName("babliiii"));
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   }
	   }
	   
	   @Test
	   public void testFirstName3() {
		   try {
		      assertTrue(object.validateFirstName("ba"));
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   }
	   }
	   
	   
	   @Test
	   public void testLastName1() {
		    
		   try {
			//happy test cases..
		    assertTrue(object.validateLastName("Yahdshdsdhh"));
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   } 
	   }
	   @Test
	   public void testLastName2() {
		    
		   try {
		    // sad test cases
			assertFalse(object.validateLastName("Ya"));
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   } 
	   }
	   
	   @Test
	   public void testEmail1() {
		   try {
		   //happy test cases..
		   assertTrue(object.validateEmail("abc@yahoo.com"));  
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   }
		   
		   
		   
	   }
	   @Test
	   public void testEmail2() {
		   try {
		   //happy test cases..
		   assertTrue(object.validateEmail("abc-100@yahoo.com"));
		   
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   }   
	   }
	   @Test
	   public void testEmail3() {
		   try {
		   
		   
		   //sad test cases.....
		   assertFalse(object.validateEmail("abc@.com"));
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   }   
	   }
	   @Test
	   public void testEmail4() {
		   try {
		   assertFalse(object.validateEmail("abc123@gmail.c"));
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   }
	   }
	   @Test
	   public void testEmail5() {
		   try {
		   assertFalse(object.validateEmail("abc..2002@gmail.com"));
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   }  
	   }
	   @Test
	   public void testPhoneNumber1() {
		   try {
		   //happy test cases
		   assertTrue(object.validatePhoneNumber("98 9876543210"));
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   }
	   }
	   @Test
	   public void testPhoneNumber2() {
		   try {
		   assertFalse(object.validatePhoneNumber("9 9876543210"));
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   }  
	   }
	   @Test
	   public void testPhoneNumber3() {
		   try {
		   assertFalse(object.validatePhoneNumber("999876543210"));
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   }
	   }
	   @Test
	   public void testPassword1() {
		 
		   try {
		   assertTrue(object.validatePassword("babjjj@123AB"));
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   } 
	   }
	   @Test
	   public void testPassword2() {
		 
		   try {
		   assertFalse(object.validatePassword("babjjj@123aa"));
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   }
	   }
	   @Test
	   public void testPassword3() {
		 
		   try {
		   
		   assertFalse(object.validatePassword("babjjj@asdf"));
		   }
		   catch(InvalidInputException e) {
			   System.out.println("Type of invalid input : "+e.type);
			   System.out.println(e.getMessage());
		   }  
	   }
}
