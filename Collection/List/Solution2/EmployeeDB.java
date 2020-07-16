import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmployeeDB {
	List<Employee> empDB = new ArrayList<>();
	
	public boolean addEmployee(Employee e) {
		return empDB.add(e);
	}
	
	public boolean deleteEmployee(int empId) {
		boolean isRemoved = false;
		
		Iterator<Employee> it = empDB.iterator();
		
		while (it.hasNext()) {
			Employee emp = it.next();
			if (emp.getEmpId() == empId) {
				isRemoved = true;
				it.remove();
			}
		}
		
		return isRemoved;
	}
	
	public String showPaySlip(int empId) {
		String paySlip = "Invalid employee id";
		
		for (Employee e : empDB) {
			if (e.getEmpId() == empId) {
				paySlip = "Pay slip for employee id " + empId + " is " +
						e.getSalary();
			}
		}

		return paySlip;
	}
	
	public Employee[] listAll() {
		Employee[] empArray = new Employee[empDB.size()];
		for (int i = 0; i < empDB.size(); i++)
			empArray[i] = empDB.get(i);
		return empArray;
	}
	
}