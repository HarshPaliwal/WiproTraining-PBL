import java.util.Scanner;
class Solution3{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Size of array : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		System.out.print("Enter integers : ");
		for(int itr=0;itr<size;itr++){
			arr[itr]=scan.nextInt();
		}
		System.out.print("Enter element to be searched : ");
		int val=scan.nextInt();
		scan.close();
		int key=-1;
		for(int itr=0;itr<size;itr++){
			if(arr[itr]==val){
				key=itr+1;
				break;
			}
		}
		System.out.print(key);
	}
}