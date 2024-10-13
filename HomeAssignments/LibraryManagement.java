package week1.day2.HomeAssignments;

public class LibraryManagement {
	
	public static void main(String[] args) {
		
		Library objLibrary1 = new Library();
		String title = objLibrary1.addBook("Harry Potter");
		System.out.println("Book Title: "+title);
		objLibrary1.issueBook();
	}

}
