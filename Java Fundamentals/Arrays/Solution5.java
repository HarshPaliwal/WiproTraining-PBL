import java.util.Scanner;
class Solution5{
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
	public static int[] find(int[] arr,int size){
		sort(arr,size);
		return new int[]{arr[0],arr[1],arr[size-2],arr[size-1]};
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
		int[] ans=new int[4];
		ans=find(arr,size);
		System.out.println("The largest 2 numbers are : "+arr[size-2]+" "+arr[size-1]);
		System.out.println("The smallest 2 numbers are : "+arr[0]+" "+arr[1]);
	}
}