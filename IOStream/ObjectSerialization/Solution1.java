import java.io.*;
import java.util.*;

public class Solution1 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner scan = new Scanner(System.in);
		Employee emp = new Employee();
		
		System.out.print("Enter name: ");
		emp.setName(scan.nextLine());
		System.out.print("Enter D.O.B.: ");
		emp.setDob(scan.nextLine());
		System.out.print("Enter department: ");
		emp.setDepartment(scan.nextLine());
		System.out.print("Enter designation: ");
		emp.setDesignation(scan.nextLine());
		System.out.print("Enter salary: ");
		emp.setSalary(scan.nextDouble());
		scan.nextLine();
		
		FileOutputStream fileOutput = new FileOutputStream("Output.txt");
		ObjectOutputStream objectOutput = new ObjectOutputStream(fileOutput);
		objectOutput.writeObject(emp);
		
		FileInputStream inputFile = new FileInputStream("Output.txt");
		ObjectInputStream  objectInput= new ObjectInputStream(inputFile);
		Employee emp2 = (Employee) objectInput.readObject();
		
		System.out.println("Name: " + emp2.getName());
		System.out.println("D.O.B.: " + emp2.getDob());
		System.out.println("Department: " + emp2.getDepartment());
		System.out.println("Designation: " + emp2.getDesignation());
		System.out.println("Salary: " + emp2.getSalary());
		
		fileOutput.close();
		objectOutput.close();
		inputFile.close();
		objectInput.close();
		scan.close();
	}
	

}