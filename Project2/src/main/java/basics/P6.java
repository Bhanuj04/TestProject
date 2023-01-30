package basics;
class Author{
	private String FirstName;
	private String LastName;
	private Book bookk;
	
	Author(String FirstName,String LastName,Book b) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.bookk =b;
	}

	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	

	public Book getB() {
		return bookk;
	}

	public void setB(Book b) {
		this.bookk = b;
	}

	@Override
	public String toString() {
		return "Author [FirstName=" + FirstName + ", LastName=" + LastName + ", b=" + bookk + "]";
	}

	
	
	
}

class Book{
	private String Author;
	private String title;
	private double Number;
	
	Book(String Author,String title,double Number){
		this.Author=Author;
		this.title=title;
		this.Number=Number;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getNumber() {
		return Number;
	}

	public void setNumber(double number) {
		Number = number;
	}

	@Override
	public String toString() {
		return "Book [Author=" + Author + ", title=" + title + ", Number=" + Number + "]";
	}
	
	
	
}

public class P6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book("jk rowling","Harry Potter", 500);
		book.getNumber();
		
		
		
		Author auth =new Author("Jay","Sharma",book);
     	
		System.out.println(auth.getB().getNumber());
		System.out.println(book);
		P6.getDetails(auth);
		
	}
	
	static void getDetails(Author auth) {
		System.out.println(auth.getB().getNumber());
		
	}

}
