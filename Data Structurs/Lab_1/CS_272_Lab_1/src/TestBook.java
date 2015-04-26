// CS 272 - lab assignment #1
// TestBook.java
// Test Book.java
// Jeremiah Smith
// January 16, 2015

public class TestBook
{
	public static void main(String args[])
	{
		//test different constructors
		//default constructor
		Book book1 = new Book();
		Book book2 = new Book();
		
		//String parameter constructor
		Book book3 =  new Book("The Lord of the Rings");
		Book book4 =  new Book("Programming PHP");
		
		//testing modification methods
		//testing setNumOfAuthors
		book1.setNumOfAuthors(1);
		book2.setNumOfAuthors(3);
		
		book3.setNumOfAuthors(1);
		book4.setNumOfAuthors(2);
		
		//testing setTitle
		book1.setTitle("CSS Cookbook");
		book2.setTitle("PHP and MySql");
		
		//testing toString Method
		System.out.println("Book 1 toString method");
		System.out.println(book1.toString());
		
		System.out.println("Book 2 toString method");
		System.out.println(book2.toString());
		
		System.out.println("Book 3 toString method");
		System.out.println(book3.toString());
		
		System.out.println("Book 4 toString method");
		System.out.println(book4.toString());
		
		//testing addAuthor
		System.out.println("Attempting to add 2 authors to book1");
		if(book1.addAuthor("John Doe"))
			System.out.println("Author added to book1: " + book1.getTitle());
		else
			System.out.println("No room for author book1: " + book1.getTitle() + ", author not added");
		
		if(book1.addAuthor("Jack Doe"))
			System.out.println("Author added to book1: " + book1.getTitle());
		else
			System.out.println("No room for author in book1: " + book1.getTitle() + ", author not added");
		
		System.out.println();
		System.out.println("Attempting to add 4 authors to book2");
		
		if(book2.addAuthor("Jane Doe"))
			System.out.println("Author added to book2: " + book2.getTitle());
		else
			System.out.println("No room for author book2: " + book2.getTitle() + ", author not added");
		
		if(book2.addAuthor("Jenny Doe"))
			System.out.println("Author added to book2: " + book2.getTitle());
		else
			System.out.println("No room for author book2: " + book2.getTitle() + ", author not added");
		
		if(book2.addAuthor("Jane Smith"))
			System.out.println("Author added to book2: " + book2.getTitle());
		else
			System.out.println("No room for author book2: " + book2.getTitle() + ", author not added");
		
		if(book2.addAuthor("Ginny Scharf"))
			System.out.println("Author added to book2: " + book2.getTitle());
		else
			System.out.println("No room for author book2: " + book2.getTitle() + ", author not added");
		
		System.out.println();
		System.out.println("Attempting to add 1 authors to book3");
		
		if(book3.addAuthor("J.R.R. Tolken"))
			System.out.println("Author added to book3: " + book2.getTitle());
		else
			System.out.println("No room for author book3: " + book2.getTitle() + ", author not added");
		
		System.out.println();
		System.out.println("Attempting to add 2 authors to book4");
		
		if(book4.addAuthor("Jack Smith"))
			System.out.println("Author added to book4: " + book4.getTitle());
		else
			System.out.println("No room for author book4: " + book4.getTitle() + ", author not added");
		
		if(book4.addAuthor("Ron Scharf"))
			System.out.println("Author added to book4: " + book4.getTitle());
		else
			System.out.println("No room for author book4: " + book4.getTitle() + ", author not added");
		
		System.out.println();
			
		//testing toString Method
		System.out.println("Book 1 toString method");
		System.out.println(book1.toString());
		
		System.out.println("Book 2 toString method");
		System.out.println(book2.toString());
		
		System.out.println("Book 3 toString method");
		System.out.println(book3.toString());
		
		System.out.println("Book 4 toString method");
		System.out.println(book4.toString());
		
		//testing setISBN and getISBN methods
		System.out.println("Setting ISBN of book1: " + book1.getTitle() + " with a current ISBN of: " + book1.getISBN() + " to \"book1 12345 ISBN1\"");
		book1.setISBN("book1 12345 ISBN1");
		System.out.println();
		System.out.println("Setting ISBN of book2: " + book2.getTitle() + " with a current ISBN of: " + book2.getISBN() + " to \"book2 12345 ISBN2\"");
		book2.setISBN("book2 12345 ISBN2");
		System.out.println();
		System.out.println("Setting ISBN of book3: " + book3.getTitle() + " with a current ISBN of: " + book3.getISBN() + " to \"book3 12345 ISBN3\"");
		book3.setISBN("book3 12345 ISBN3");
		System.out.println();
		System.out.println("Setting ISBN of book4: " + book4.getTitle() + " with a current ISBN of: " + book4.getISBN() + " to \"book4 12345 ISBN4\"");
		book4.setISBN("book4 12345 ISBN4");
		System.out.println();
		
		//testing toString Method
		System.out.println("Book 1 toString method");
		System.out.println(book1.toString());
		
		System.out.println("Book 2 toString method");
		System.out.println(book2.toString());
		
		System.out.println("Book 3 toString method");
		System.out.println(book3.toString());
		
		System.out.println("Book 4 toString method");
		System.out.println(book4.toString());
		
		//testing copy constructor
		System.out.println("Testing Copy constructor");
		System.out.println();
		Book book5 = new Book(book1);
		Book book6 = new Book(book2);
		Book book7 = new Book(book3);
		Book book8 = new Book(book4);
		
		//testing toString Method
		System.out.println("Book 5 toString method");
		System.out.println(book5.toString());
		
		System.out.println("Book 6 toString method");
		System.out.println(book6.toString());
		
		System.out.println("Book 7 toString method");
		System.out.println(book7.toString());
		
		System.out.println("Book 8 toString method");
		System.out.println(book8.toString());
		
		//Testing equals method
		System.out.println("Testing equals method");
		if(book1.equals(book5))
			System.out.println("book1 is the same as book5");
		else
			System.out.println("book1 is not same as book 5");
		
		if(book2.equals(book6))
			System.out.println("book2 is the same as book6");
		else
			System.out.println("book2 is not same as book 6");
		
		if(book3.equals(book8))
			System.out.println("book3 is the same as book8");
		else
			System.out.println("book3 is not same as book 8");
		
		if(book4.equals(book7))
			System.out.println("book4 is the same as book7");
		else
			System.out.println("book4 is not same as book7");
		
		System.out.println();
		
		//testing getAuthors
		System.out.println("Testing getAuthors");
		String[] book1Authors = new String[book1.getAuthorNumber()];
		book1Authors = book1.getAuthors();
		
		System.out.print("The Authors of book1 are:");
		for(int i = 0; i < book1Authors.length; i++)
			System.out.print(" " + book1Authors[i] + ", ");
		
		System.out.println();	
		
		//testing static getAllAuthors
		System.out.println("Testing getAllAuthors with the following books:");
		System.out.println(book7.toString());
		System.out.println(book8.toString());
		
		String[] allAuthors = Book.getAllAuthors(book7, book8);
		
		for(int i = 0; i < allAuthors.length; i++)
			System.out.println(allAuthors[i]);
		
		System.out.println();
		
		System.out.println("Testing getAllAuthors with the following books:");
		System.out.println(book6.toString());
		String[] allAuthors2 = Book.getAllAuthors(book6, book6);
		
		for(int i = 0; i < allAuthors.length; i++)
			System.out.println(allAuthors2[i]);
	}
}
