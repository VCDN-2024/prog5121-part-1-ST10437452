//Amarah Abdool
//ST10437452
//PROG Assignment 1 -Part 1

//Refference List
//GeeksforGeeks. (2023). Java JOptionPane. [online] Available at: https://www.geeksforgeeks.org/java-joptionpane/?ref=header_search [Accessed 5 Apr. 2024].
// www.w3schools.com. (n.d.). Java Strings. [online] Available at: https://www.w3schools.com/java/java_strings.asp [Accessed 8 Apr. 2024].
//GeeksforGeeks. (2017). Classes and Objects in Java. [online] Available at: https://www.geeksforgeeks.org/classes-objects-java/?ref=lbp [Accessed 8 Apr. 2024].
//w3schools. “Java Encapsulation and Getters and Setters.” W3schools.com, 2019, https://www.w3schools.com/java/java_encapsulation.asp. [Accessed 7 Apr. 2024].
//“PROG5121 POE Unit Testing Task 1.” Www.youtube.com, VC Lecture Series, 11 May 2022, https://youtu.be/sFTbCVnUbLo. [Accessed 10 Apr. 2024.]
//The Independent Institute of Education. (2023). PROG5121. The Independent Institute of Education., pp.6 to 9.[Accessed 15 Apr. 2024.]
// Loom Video Link: VC learn!


package registrationapp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginTest {
  //this class contains unit tests for the Login class
    
    //Constructor
 public LoginTest()
    {}
 //creating a new instance of login for each test 
 Login login=new Login();
    
    //Test to check if the username follows the correct format
    @Test
    public void testCheckUserNameWithCorrectFormat() {
       login.setUsername("kyl_1");
        boolean result = login.checkUserName();
        assertTrue(result);
    }

  //Test to check if the username follows the incorrect format
   @Test
    public void testCheckUserNameWithIncorrectFormat() {
      login.setUsername("kyle!!!!!!!");
        boolean result = login.checkUserName();
        assertFalse(result);
  
    }
    
    
    // Test to check if the password complexity is valid
    @Test
    public void testCheckPasswordComplexityWithValidPassword() 
    { login.setPassword("Ch&&sec@ke99!");
        boolean result = login.checkPasswordComplexity();
        assertTrue(result);
    }

    // Test to check if the password complexity is invalid
@Test
    public void testCheckPasswordComplexityWithInvalidPassword() 
    { login.setPassword("password");
       boolean result = login.checkPasswordComplexity();
        assertFalse(result);
    }
    
    //test to register a user with valid credentials
     @Test
    public void testRegisterUserWithValidCredentials() {
        String result = login.registerUser("kyl_1", "Ch&&sec@ke99!", "Amarah", "Abdool");
       assertEquals("Registration successful!", result);
    }

    // test to register a user with invalid credentials
    @Test
    public void testRegisterUserWithInvalidUsername() {
        String result = login.registerUser("kyle!!!!!!!", "Ch&&sec@ke99!", "Amarah", "Abdool");
        assertEquals("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.", result);
    }

     // test to register a user with an invalid password
    @Test
    public void testRegisterUserWithInvalidPassword() {
        String result = login.registerUser("kyl_1", "password", "Amarah", "Abdool");
        assertEquals("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.", result);
    }

     // test to register a user with correct credentials
    @Test
    public void testLoginUserWithCorrectCredentials() {
       login.registerUser("kyl_1", "Ch&&sec@ke99!", "John", "Doe");
        String result = login.loginUser("kyl_1", "Ch&&sec@ke99!");
        assertEquals("Welcome,Amarah Abdool, it is great to see you again.", result);
    }

    // test to register a user with incorrect credentials
    @Test
    public void testLoginUserWithIncorrectCredentials() {
        login.registerUser("kyl_1", "Ch&&sec@ke99!", "Amarah", "Abdool");
       String result = login.loginUser("kyl_1", "wrong_password");
        assertEquals("Username or password incorrect, please try again.", result);
    }
    
}
    

   