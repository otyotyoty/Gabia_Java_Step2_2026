package chapter12.clone;

class Book implements Cloneable {
	
	String title;

	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
	
}


public class MyBook_03 {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book book1 = new Book("자바");
		System.out.println(book1);
		Book book2 = (Book)book1.clone();
		System.out.println(book2);
		
		book2.setTitle("오라클");
		System.out.println(book2);

	}

}
