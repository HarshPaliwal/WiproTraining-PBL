import java.io.*;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) 
			throws IOException, FileNotFoundException, ClassNotFoundException {
		
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		String filename = "EmployeeDB.dat";
		
		FileOutputStream fileOutput = new FileOutputStream(filename);
		ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
		
		FileInputStream fileInput = new FileInputStream(filename);
		ObjectInputStream objectInput = new ObjectInputStream(fileInput);
		
		do {
			System.out.println("Main Menu");
			System.out.println("1. Add an Employee");
			System.out.println("2. Display All");
			System.out.println("3. Exit");
			choice = scan.nextInt();
			
			switch (choice) {
			case 1:
				Employee emp = new Employee();
				System.out.print("Enter Employee ID: ");
				emp.setId(scan.nextInt());
				scan.nextLine();
				System.out.print("Enter Employee Name: ");
				emp.setName(scan.nextLine());
				System.out.print("Enter Employee Age: ");
				emp.setAge(scan.nextInt());
				System.out.print("Enter Employee Salary: ");
				emp.setSalary(scan.nextDouble());
				objectOutput.writeObject(emp);
				break;
			case 2:
				System.out.println("----Report-----");
				emp = null;
				while (fileInput.available() > 0) {
					emp = (Employee) objectInput.readObject();
					System.out.println(emp);
				}
				System.out.println("----End of Report-----");
				break;
			case 3:
				System.out.println("Exiting the System");
			}
		} while (choice != 3);
		
		fileOutput.close();
		objectOutput.close();
		fileInput.close();
		objectInput.close();
		scan.close();
		
	}

}