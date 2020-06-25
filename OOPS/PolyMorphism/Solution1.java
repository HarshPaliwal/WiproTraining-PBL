public class Solution1{
	public static void main(String[] args){
		Apple a=new Apple();
		System.out.println(a.name);
		
	}
}
class Fruit{
	String name,taste,size;
	void eat(String name,String taste,String size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
} 
class Apple extends Fruit{
	Apple(){
		super.name="Apple";
	}
	void eat(String name,String taste,String size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
}
class Orange extends Fruit{
	Orange(){
		super.name="Orange";
	}
	void eat(String name,String taste,String size){
		this.name=name;
		this.taste=taste;
		this.size=size;
	}
}
