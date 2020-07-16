import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees ");
		int empCount = sc.nextInt();
		sc.nextLine();
		
		List<Employee> empList = new ArrayList<>();
		
		for (int i = 0; i < empCount; i++) {
			System.out.println("Enter employee "+(i + 1)+" Details:" );
			System.out.print("Enter the First name: ");
			String firstName = sc.nextLine();
			System.out.print("Enter the Last name: ");
			String lastName = sc.nextLine();
			System.out.print("Enter the Mobile number: ");
			long mobileNumber = sc.nextLong();
			sc.nextLine();
			System.out.print("Enter the Email: ");
			String emailId = sc.nextLine();
			System.out.print("Enter the Address: ");
			String address = sc.nextLine();
			
			empList.add(new Employee(firstName, lastName, mobileNumber, emailId, address));
		}
		
		Collections.sort(empList);
		
		System.out.println("\nEmployee List:\n");
		System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
		System.out.println();
		
		Iterator<Employee> itr = empList.iterator();
		while (itr.hasNext()) {
			Employee emp = itr.next();
			System.out.format("%-15s %-15s %-15s %-30s %-15s\n", 
					emp.getFirstName(), emp.getLastName(), emp.getMobileNumber(), 
					emp.getEmailId(), emp.getAddress());
		}
		sc.close();
	}

}