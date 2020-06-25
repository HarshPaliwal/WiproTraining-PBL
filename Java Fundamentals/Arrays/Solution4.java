import java.util.Scanner;
class Solution4{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Size of array : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter integers : ");
		for(int itr=0;itr<size;itr++){
			arr[itr]=scan.nextInt();
		}
		scan.close();
		for(int itr=0;itr<size;itr++){
			System.out.print(((char)arr[itr])+" ");
		}
	}
}