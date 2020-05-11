
public class Student { // Start Student Class
     private String firstName;
     private String lastName;
     
     public Student(String newFirstName, String newLastName) { //Start Student Constructor
    	 this.firstName = newFirstName;
    	 this.lastName = newLastName;
     } // End Student Constructor
     
     public String getFullName() {
    	 String fullName = lastName + "," + firstName;
    	 return fullName;
     }
} // End Student Class
