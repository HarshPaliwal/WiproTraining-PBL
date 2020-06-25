public class Solution1{
	public static void main(String[] args){
		Book B=new Book("Robert Sedgewick","robert@xyz.com",'M',
							"Algorithms",999.9,50);
		Author A=B.getBookAuthor();
		System.out.println("Book Name : "+B.getBookName());
		System.out.println("Book Author : "+A.authorName);
		System.out.println("Book Price : "+B.getBookPrice());
		System.out.println("Numbers of Book in Stock : "+B.getBookQty());
		System.out.println("Author Email : "+A.authorEmail);
		if(A.gender=='M')
			System.out.println("Author is Male");
		else
			System.out.println("Author is Female");
	}
}
class Author{
	private String authorName,authorEmail;
	private char gender;
	Author(String authorName,String authorEmail,char gender){
		this.authorName=authorName;
		this.authorEmail=authorEmail;
		this.gender=gender;
	}
}
class Book{
	private String bookName;
	private Author A;
	private double price;
	private int qtyInStock;
	Book(String authorName,String authorEmail, char gender,
				String bookName,double price,int qtyInStock){
					
		A=new Author(authorName,authorEmail,gender);
		this.bookName=bookName;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	public String getBookName(){
		return bookName;
	}
	public double getBookPrice(){
		return price;
	}
	public int getBookQty(){
		return qtyInStock;
	}
	public Author getBookAuthor(){
		return A;
	}
	public void setBookName(String bookName){
		this.bookName=bookName;
	}
	public void setBookPrice(double price){
		this.price=price;
	}
	public void setBookQty(int qtyInStock){
		this.qtyInStock=qtyInStock;
	}
	public void setBookAuthor(Author A){
		this.A=A;
	}
}
