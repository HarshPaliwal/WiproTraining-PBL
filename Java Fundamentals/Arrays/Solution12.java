import java.util.Scanner;
class Solution11{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int[] a=new int[3];
		int[] b=new int[3];
		System.out.print("Enter integers of array 1: ");
		for(int itr=0;itr<3;itr++){
			a[itr]=scan.nextInt();
		}
		System.out.print("Enter integers of array 2: ");
		for(int itr=0;itr<3;itr++){
			b[itr]=scan.nextInt();
		}
		scan.close();
		System.out.print(a[1]+" "+b[1]);
	}
}