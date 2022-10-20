package sorting;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getBooks(){
	
	      List<Book> books = new	ArrayList<Book>();
		
	      books.add(new Book(101,"Core Java", 400));
	      books.add(new Book(530,"Hibernate", 180));
	      books.add(new Book(385,"Spring", 200));
	      books.add(new Book(893,"Web Service", 300));
	      
	      
	      
	      return books;
		
	}
	
}
