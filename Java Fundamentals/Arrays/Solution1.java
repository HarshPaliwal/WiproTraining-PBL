import java.util.Scanner;
class Solution1{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Size of array : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter integers : ");
		int sum=0;
		int avg=0;
		for(int itr=0;itr<size;itr++){
			arr[itr]=scan.nextInt();
			sum+=arr[itr];
		}
		scan.close();
		avg=sum/size;
		System.out.println("Sum of array is : "+sum+" and Average is : "+avg);
	}
}
