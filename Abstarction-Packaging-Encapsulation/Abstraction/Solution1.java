abstract class Compartment{
	public abstract String notice();
}
class FirstClass extends Compartment{
	public String notice(){
		return "FirstClass Compartment";
	}
}
class Ladies extends Compartment{
	public String notice(){
		return "Ladies Compartment";
	}
}
class General extends Compartment{
	public String notice(){
		return "General Compartment";
	}
}
class Luggage extends Compartment{
	public	String notice(){
		return "Luggage Compartment";
	}
}
class TestComapartment{
	public static void main(String[] args){
		Compartment[] c=new Compartment[10];
	for(int i=0;i<10;i++){
		int n=(int)(Math.random()*4)+1;
		switch(n){
			case 1: c[i]=new FirstClass();
					System.out.println(c[i].notice());
					break;
			case 2: c[i]=new Ladies();
					System.out.println(c[i].notice());
					break;
			case 3: c[i]=new General();
					System.out.println(c[i].notice());
					break;
			case 4: c[i]=new Luggage();
					System.out.println(c[i].notice());
					break;
			default:
		}
	}
	}
}
