 
public class Book {

	
	
	private String title;
	private boolean borrow;
	
	
	//constructor of book class
	public Book() {
		title= "";
	}
	
	//sets title of book
	public Book(String name) {
		title = name;
		
	}
	
	//gets title of book
	public String getTitle() {
		return title;
		
	}
	//returns boolean borrow value
	public boolean isBorrowed() {
		return borrow;
		
	}
	
	//sets borrow value to true if rented method is called
	public void rented() {
		borrow = true;
	}
	
	//sets borrow value to false if returned method is called
	public void returned() {
		borrow= false;
		
	}
	

}
