import java.util.Scanner;
class Solution11{
	public static boolean only14(int[] arr, int size){
		for(int itr=0;itr<size;itr++){
			if(arr[itr] !=1 && arr[itr]!=4){
				return false;
			}
		}
		return true;
	}
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
		System.out.print(only14(arr,size));
	}
}