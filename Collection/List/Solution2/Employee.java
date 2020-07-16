public class Employee {
	private int empId; 
	private String empName;
	private String email; 
	private char gender;
	private float salary;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String empName, String email, char gender, float salary) {
		this();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.gender = gender;
		this.salary = salary;
	}

	public void GetEmployeeDetails() {
		String ID=Integer.toString(empId);
		String pay=Float.toString(salary);
		System.out.printf("%-5s|%-20s|%-30s|%-10s|%-10s\n",ID,empName,email,gender,pay);
	}

	public int getEmpId() {
		return this.empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return this.empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public float getSalary() {
		return this.salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	
}