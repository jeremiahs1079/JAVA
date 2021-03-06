// CS 272 - lab assignment #1
// Book.java
// Jeremiah Smith
// January 16, 2015

public class Book
{
	//instance variables
	private String title;
	private int numOfAuthors;
	private String[] authors;
	private String isbn;
	
	//default constructor
	public Book()
	{
		title = null;
		isbn = null;
		numOfAuthors = 3;
		authors = new String[numOfAuthors];
	}
	
	//constructor String parameter
	public Book(String _title)
	{
		title = _title;
		isbn = null;
		numOfAuthors = 3;
		authors = new String[numOfAuthors];
	}
	
	//copy constructor
	public Book(Object obj)
	{
		if(obj != null)
			if(obj instanceof Book)
			{
				Book _book = (Book)obj;
				this.title = new String(_book.getTitle());
				this.numOfAuthors = _book.getAuthorNumber();
				this.isbn = new String(_book.getISBN());
				this.authors = new String[_book.getAuthorNumber()];
				for(int i = 0; i < this.authors.length; i++)
					this.authors[i] = _book.authors[i];
			}
			else
				System.out.println("obj is not an instance of Book");
		else
			System.out.println("obj is null");			
	}
	
	//accessor methods
	public String getTitle()
	{
		return title;
	}
	
	public String getISBN()
	{	
		return isbn;
	}
	
	public int getAuthorNumber()
	{
		return numOfAuthors;
	}
	
	public String[] getAuthors()
	{
		return authors;
	}
	
	//modification methods
	public void setTitle(String _title)
	{
		title = new String(_title);
	}
	
	public void setISBN(String _isbn)
	{
		isbn = new String(_isbn);
	}
	
	public void setNumOfAuthors(int _numOfAuthors)
	{
		numOfAuthors = _numOfAuthors;
		authors = new String[_numOfAuthors];
	}
	
	//class methods
	//addAuthor adds an author to the existing author list if there is room
	public boolean addAuthor(String _author)
	{
		
		//checking to see if there is an empty space in authors array
		for(int i = 0; i < authors.length; i++)
			if(authors[i] == null)
			{
				authors[i] = _author;
				return true;
			}
		
		//if number of authors is less then three copy authors
		//then resize
		//then add new author
		if(numOfAuthors < 3)
		{
			//create a temp array for the current authors
			String[] currentAuthors = new String[this.getAuthorNumber()];
			
			//copy current authors
			for(int i = 0; i < authors.length; i++)
				currentAuthors[i] = new String(authors[i]);
			
			//increment numOfAuthors and resize authors array
			numOfAuthors++;
			authors = new String[numOfAuthors];
			
			//copy current authors back into authors array
			for(int i = 0; i < currentAuthors.length; i++)
				authors[i] = new String(currentAuthors[i]);
			
			for(int i = 0; i < authors.length; i++ )
				if(authors[i] == null)
				{
					authors[i] = _author;
					return true;
				}
		}
						
		return false;
	}
	
	//equals method to test for equality where equality is the same ISMN number
	public boolean equals(Object obj)
	{
		if(obj != null)
			if(obj instanceof Book)
			{
				Book _book = (Book)obj;
				if(this.isbn.equals(_book.getISBN()))
					return true;
			}
		return false;
					
	}
	
	//toString Method
	public String toString()
	{
		String returnString = null;
		
		returnString = "Title: " + title + "\n";
		returnString += "ISBN: " + isbn + "\n";
		returnString += "Number of Authors: " + numOfAuthors + "\n";
		
		for(int i = 0; i < authors.length; i++)
			returnString += "Author: " + (i + 1) + " " + authors[i] + "\n";
			
		return returnString;
	}
	
	public static String[] getAllAuthors(Book b1, Book b2)
	{
		String[] returnArray = new String[b1.getAuthorNumber()];
		String[] tempArray;
		boolean inArray;
		
		//assign b1 authors to returnArray
		for(int i = 0; i < returnArray.length; i++)
			returnArray[i] = new String(b1.authors[i]);
		
		for(int i = 0; i < b2.authors.length; i++)
		{
			inArray = false;
			int lastPosition = 0;
			
			//see if b2.author[i] equals returnArray[j]
			for(int j = 0; j < returnArray.length; j++)
				if(returnArray[j].equals(b2.authors[i]))
				{
					inArray = true;
					break;
				}
			if(!inArray)
			{
				//copy retrunArray to tempArray
				tempArray = new String[returnArray.length];
				for(int k = 0; k < returnArray.length; k++)
					tempArray[k] = new String(returnArray[k]);
				
				//resize returnArray
				returnArray = new String[tempArray.length + 1];
				
				//copy tempArray back to returnArray
				for(int k = 0; k< tempArray.length; k++)
				{
					returnArray[k] = new String(tempArray[k]);
					lastPosition = k;
				}
				returnArray[lastPosition + 1] = new String(b2.authors[i]);
					
			}
		}
			
		return returnArray;			
				
	}
	
}
