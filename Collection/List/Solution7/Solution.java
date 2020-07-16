import java.util.Vector;
import java.util.Enumeration;
public class Solution{

	public static void main(String[] args) {
		Vector<Employee> empDb=new Vector<>();
		Enumeration en=empDb.elements();
		Employee emp1 = new Employee(1, "Arya Stark", "arya.stark@got.com", 'F', 500000);
		Employee emp2 = new Employee(2, "Robert Downey Jr.", "robert.downey@marvel.com", 'M', 300000);
		Employee emp3 = new Employee(3, "Emma Watson", "emma.watson@pottermore.com", 'F', 900000);
		Employee emp4 = new Employee(4, "Harsh ", "harsh@self.com", 'M', 5000000);
		
		empDb.add(emp1);
		empDb.add(emp2);
		empDb.add(emp3);
		empDb.add(emp4);
		System.out.println("All Employees are: ");
		System.out.printf("%-5s|%-20s|%-30s|%-10s|%-10s\n","EmpID","EmpName","EmpEmail","EmpGender","EmpSalary");
		while(en.hasMoreElements()){
			Employee emp=(Employee)en.nextElement();
			emp.GetEmployeeDetails();
		}
	}
}