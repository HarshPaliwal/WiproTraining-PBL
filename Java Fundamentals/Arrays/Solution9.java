import java.util.Scanner;
class Solution9{
	public static void withoutTen(int[] arr, int size){
		int[] ans=new int[size];
		for(int itr=0,i=0;itr<size;itr++){
			if(arr[itr]!=10){
				ans[i++]=arr[itr];
			}
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
		withoutTen(arr,size);
	}
}