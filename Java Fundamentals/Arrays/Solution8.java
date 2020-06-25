import java.util.Scanner;
class Solution8{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter Size of array : ");
		int size=scan.nextInt();
		int[] arr=new int[size];
		int sum=0;
		int posSix=-1;
		int posSeven=-1;
		System.out.print("Enter integers : ");
		for(int itr=0;itr<size;itr++){
			arr[itr]=scan.nextInt();
			sum+=arr[itr];
			if(arr[itr]==6) posSix=itr;
			if(arr[itr]==7) posSeven=itr;
		}
		scan.close();
		if(posSix!=-1)
		for(int i=posSix;i<=posSeven;i++){
			sum-=arr[i];	
		}
		System.out.println("Sum is : "+sum);
	}
}