import java.util.Scanner;
class Solution10{
	public static void evenOdd(int[] arr, int size){
		int[] ans=new int[size];
		int ans_itr=0;
		for(int itr=0;itr<size;itr++){
			if(arr[itr]%2==0)
				ans[ans_itr++]=arr[itr];
		}
		for(int itr=0;itr<size;itr++){
			if(arr[itr]%2!=0)
				ans[ans_itr++]=arr[itr];
		}
		for(int itr=0;itr<size;itr++){
			System.out.print(ans[itr]+" ");
		}
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
		evenOdd(arr,size);
	}
}