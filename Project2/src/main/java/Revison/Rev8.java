package Revison;


class Book {
	private String title;
	private String author;
	private int id;
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String a) {
		this.author = a;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String t) {
		this.title=t;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int i) {
		this.id = i;
	}
}

public class Rev8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book obj = new Book();
		
		obj.setTitle("Wings");
		obj.setAuthor("Kalam");
		obj.setId(23);
		
	
		
		System.out.println(obj.getTitle());
		System.out.println(obj.getAuthor());
		System.out.println(obj.getId());
		
		
		

	}

}
