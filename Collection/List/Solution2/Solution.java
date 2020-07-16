public class Solution{

	public static void main(String[] args) {
		EmployeeDB empDb = new EmployeeDB();
		
		Employee emp1 = new Employee(1, "Arya Stark", "arya.stark@got.com", 'F', 500000);
		Employee emp2 = new Employee(2, "Robert Downey Jr.", "robert.downey@marvel.com", 'M', 300000);
		Employee emp3 = new Employee(3, "Emma Watson", "emma.watson@pottermore.com", 'F', 900000);
		Employee emp4 = new Employee(4, "Harsh ", "harsh@self.com", 'M', 5000000);
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		empDb.addEmployee(emp4);
		System.out.println("All Employees are: ");
		System.out.printf("%-5s|%-20s|%-30s|%-10s|%-10s\n","EmpID","EmpName","EmpEmail","EmpGender","EmpSalary");
		for (Employee emp : empDb.listAll())
			emp.GetEmployeeDetails();
		
		System.out.println();
		empDb.deleteEmployee(2);
		System.out.println("After deleting employee 2\n");
		System.out.println("All Employees are: ");
		System.out.printf("%-5s|%-20s|%-30s|%-10s|%-10s\n","EmpID","EmpName","EmpEmail","EmpGender","EmpSalary");
		for (Employee emp : empDb.listAll())
			emp.GetEmployeeDetails();
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(3));
	}

}