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
public class Login {
    
    // member variables for storing user information
    
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    
     // getters and setters for accessing and modifying member variables
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    // helper methods for internal logic
    // mthod to check if the username meets the specified format
     public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }
    
     // Method to check if the password meets the specified complexity requirements
    public boolean checkPasswordComplexity() {
        return password.length() >= 8 && password.matches(".*[A-Z].*") &&
                password.matches(".*\\d.*") && password.matches(".*[!@#$%^&*()].*");
    }
    
     // Methods for registration and login functionality
    
    // Method to register a new user
    
    public String registerUser(String username, String password, String firstName, String lastName) {
        setUsername(username);
        setPassword(password);
        setFirstName(firstName);
        setLastName(lastName);
        
         // Check username format
        if (!checkUserName()) {
            return "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.";
        }
        
         // Check password complexity
        if (!checkPasswordComplexity()) {
            return "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.";
        }
        
        return "Registration successful!";
        
    }
     // Method to login an existing user
    
    public String loginUser(String username, String password) {
        if (getUsername().equals(username) && getPassword().equals(password)) {
          return "Welcome, " + getFirstName() + " " + getLastName() + ", it is great to see you again.";
          
        }
        
        return "Username or password incorrect, please try again.";
    }
}