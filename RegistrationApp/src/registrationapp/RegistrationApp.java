//Amarah Abdool
//ST10437452
//PROG Assignment 1 -Part 1

//Refference List
//GeeksforGeeks. (2023). Java JOptionPane. [online] Available at: https://www.geeksforgeeks.org/java-joptionpane/?ref=header_search [Accessed 5 Apr. 2024].
// www.w3schools.com. (n.d.). Java Strings. [online] Available at: https://www.w3schools.com/java/java_strings.asp [Accessed 8 Apr. 2024].
//GeeksforGeeks. (2017). Classes and Objects in Java. [online] Available at: https://www.geeksforgeeks.org/classes-objects-java/?ref=lbp [Accessed 8 Apr. 2024].
//w3schools. “Java Encapsulation and Getters and Setters.” W3schools.com, 2019, https://www.w3schools.com/java/java_encapsulation.asp. [Accessed 7 Apr. 2024].
//“PROG5121 POE Unit Testing Task 1.” Www.youtube.com, VC Lecture Series, 11 May 2022, https://youtu.be/sFTbCVnUbLo. Accessed 10 Apr. 2024.
//Institute of Education. (2023). PROG5121. The Independent Institute of Education., pp.6 to 9.[Accessed 15 Apr. 2024.]

// Loom Video Link: VC learn!
package registrationapp;

import javax.swing.JOptionPane;

public class RegistrationApp {
    
    public static void main(String[] args) {
        
        // create an instance of the Login class
        Login login = new Login();
        
        // register a new user
        String username =JOptionPane.showInputDialog("Enter username:"); // promt the user for input
        String password =  JOptionPane.showInputDialog("Enter password:");// prompt the use for password input
        String firstName = JOptionPane.showInputDialog("Enter first name:");// prompt the user for first name input
        String lastName = JOptionPane.showInputDialog("Enter last name:");// prompt the user for last name input
        
        String registrationStatus = login.registerUser(username, password, firstName, lastName); // call the registerUser method
        JOptionPane.showMessageDialog(null, registrationStatus);// show registration status
        
        
        // Login with existing user credentials
        
        username = JOptionPane.showInputDialog("Enter username:"); // Prompt for username input for login
        password = JOptionPane.showInputDialog("Enter password:"); // Prompt for password input for login
        
        
        String loginStatus = login.loginUser(username, password); // Call the loginUser method
        
        JOptionPane.showMessageDialog(null, loginStatus);// Show login status
    }
}



