public class TestEmployee{
	public static void main(String[] args){
		Employee e=new Employee("Robert",20000.0,2021,"9861");
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getYearOfJoin());
		System.out.println(e.getNIN());
		e.setName("Kevin");
		e.setSalary(19999.9);
		e.setYearOfJoin(2020);
		e.setNIN("9862");
		System.out.println("After Changing Details ");
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		System.out.println(e.getYearOfJoin());
		System.out.println(e.getNIN());
	}
}
