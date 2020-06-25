import java.util.Scanner;
public class Solution3{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		try{
			int[][] marks=new int[2][3];
			int[] sum=new int[2];
			int[] avg=new int[2];
			for(int i=0;i<2;i++){
				System.out.println("Enter Marks for Student "+(i+1)+" :");
				for(int j=0;j<3;j++){
					System.out.print("Enter Marks for Subject "+(j+1)+" : ");
					marks[i][j]=Integer.parseInt(scan.nextLine());
					if(marks[i][j]<0) throw new NegativeValuesException();
					if(marks[i][j]>100) throw new ValuesOutOfRangeException();
					sum[i]+=marks[i][j];
				}
				avg[i]=sum[i]/3;
			}
			for(int i=0;i<2;i++)
				System.out.println("The sum and average of marks for Student "+(i+1)+" is : "
						+sum[i]+","+avg[i]);
		}
		catch(NumberFormatException nfe){
			System.out.println(nfe);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			scan.close();
		}
	}
}
class NegativeValuesException extends Exception{
	NegativeValuesException(){
		super("Negative marks entered.");
	}
}
class ValuesOutOfRangeException extends Exception{
	ValuesOutOfRangeException(){
		super("Enter number between 0-100.");
	}
}