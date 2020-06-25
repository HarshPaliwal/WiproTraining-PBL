import java.util.Scanner;
class Solution2{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Size of array : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter integers : ");
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int itr=0;itr<size;itr++){
			arr[itr]=scan.nextInt();
			min=Math.min(arr[itr],min);
			max=Math.max(arr[itr],max);
		}
		scan.close();
		System.out.println("The min and max integers are : "+min+" "+max);
	}
}