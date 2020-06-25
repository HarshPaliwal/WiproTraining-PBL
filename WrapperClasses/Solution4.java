class Employee implements Cloneable {
	private String name;
	public Employee(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("CLONING CAN NOT BE DONE");
			return this;
		}		
	}
}

public class Solution4 {
	public static void main(String[] args) {
		Employee emp = new Employee("Eratosthenes");
		Employee empClone = emp.clone();
		empClone.setName("Queen Elizabeth I");
		System.out.println(empClone.getName());
		System.out.println(emp.getName());
	}
}