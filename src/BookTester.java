 /*Name: Lovika Gosain
 Due Date: 10/7/2017
 ITI Object Oriented Programming
 Individual Assignment 1
 Description: Create a book class with the methods getTitle, isBorrowed, rented, and returned*/


public class BookTester {

	
	public static void main(String[] args) {
	
		Book text = new Book("The Da Vinci Code");
		System.out.println("Title (should be The Da Vinci Code): " + text.getTitle());
		System.out.println("Borrowed? (should be false): " + text.isBorrowed());
		text.rented();
		System.out.println("Borrowed? (should be true): " + text.isBorrowed());
		text.returned();
		System.out.println("Borrowed? (should be false): " + text.isBorrowed());
		
		
		//additional testing call
		text.rented();
		System.out.println("Borrowed? (should be true): " + text.isBorrowed());
	}

}

