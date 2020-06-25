public class Employee extends Person{
	private double salary;
	private int yearOfJoin;
	private String NIN;	// National Insurance Number
	Employee(String name,double salary,int year,String number){
		super(name);
		this.salary=salary;
		this.yearOfJoin=year;
		this.NIN=number;
	}
	public void setName(String name){
		super.setName(name);
	}
	public void setSalary(double salary){
		this.salary=salary;
	}
	public void setYearOfJoin(int year){
		this.yearOfJoin=year;
	}
	public void setNIN(String number){
		this.NIN=number;
	}
	public String getName(){
		return super.getName();
	}
	public double getSalary(){
		return salary;
	}
	public int getYearOfJoin(){
		return yearOfJoin;
	}
	public String getNIN(){
		return NIN;
	}
}