 /*Name: Lovika Gosain
 Due Date: 10/7/2017
 ITI Object Oriented Programming
 Individual Assignment 1
 Description: Create a book class with the methods getTitle, isBorrowed, rented, and returned*/

public class BookTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Book example = new Book("The Da Vinci Code");
		System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
		System.out.println("Borrowed? (should be false): " + example.isBorrowed());
		example.rented();
		System.out.println("Borrowed? (should be true): " + example.isBorrowed());
		example.returned();
		System.out.println("Borrowed? (should be false): " + example.isBorrowed());
	
	}

}
