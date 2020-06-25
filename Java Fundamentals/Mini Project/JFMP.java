class JFMP{
	public static void main(String[] args){
		//String empData[][]=new String[7][8];
		String empData[][]={
		//	 EmpNo. EmpName	 JoinDate	Designation Department			Basic	HRA	IT
		//					 Code
			{"1001","Ashish","01/04/2009","e",		"R&D"			,"20000","8000"	,"3000"	},
			{"1002","Sushma","23/08/2012","c",		"PM"			,"30000","12000","9000"	},
			{"1003","Rahul" ,"12/11/2008","k",		"Acct"			,"10000","8000"	,"1000"	},
			{"1004","Chahat","29/01/2013","r",		"Front Desk"	,"12000","6000"	,"2000"	},
			{"1005","Ranjan","16/07/2005","m",		"Engg"			,"50000","20000","20000"},
			{"1006","Suman" ,"01/01/2000","e",		"Manufacturing"	,"23000","9000"	,"4400"	},
			{"1007","Tanmay","12/06/2006","c",		"PM"			,"29000","12000","10000"}
			};
		int empNo=7; 
		for(int itr=0;itr<7;itr++){
			if(args[0].equals(empData[itr][0])){
				empNo=itr;
				break;
			}
		}
		if(empNo==7){
			System.out.println("There is no employee with empid : "+args[0]);
		}
		else{
			int Basic=Integer.parseInt(empData[empNo][5]);
			int HRA=Integer.parseInt(empData[empNo][6]);
			int IT=Integer.parseInt(empData[empNo][7]);
			int DA;
			String Designation=null;
			switch(empData[empNo][3]){
				case "e":	Designation="Engineer";
							DA=20000;
							break;
				case "c":	Designation="Consultant";
							DA=32000;
							break;
				case "k":	Designation="Clerk";
							DA=12000;
							break;
				case "r":	Designation="Receptionist";
							DA=15000;
							break;
				case "m":	Designation="Manager";
							DA=40000;
							break;
				default : 	DA=0;
			}
			int Salary=Basic+HRA+DA-IT;
			System.out.println("Emp No.	Emp Name Department Designation Salary");
			System.out.printf("%-7s %-8s %-10s %-11s %d",args[0],empData[empNo][1],empData[empNo][4],Designation,Salary);
		}
	} 
}
