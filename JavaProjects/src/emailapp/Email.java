package emailapp;

public class Email {
	 String firstName;
	 String lastName;
	 String passWord;
	 String department; 
	 int mailboxCapacity;
	 String alternateEmail;
	 
	 public Email(String firstName, String lastName) {
		 this.firstName = firstName;
		 this.lastName = lastName;
		 System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		 
	 }
	

}
