import java.util.Scanner;
class Solution7{
	public static void sort(int[] arr,int size){
		for(int i=1;i<size;++i){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
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
		sort(arr,size);
		System.out.print(arr[0]+" ");
		for(int itr=1;itr<size;itr++){
			if(arr[itr-1]!=arr[itr])
			System.out.print(arr[itr]+" ");
		}
	}
}