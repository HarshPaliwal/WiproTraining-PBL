import java.util.Scanner;
public class Solution1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		try{
			System.out.print("Enter the nummber in elements in a array : ");
			int n=Integer.parseInt(sc.nextLine());
			int[] a=new int[n];
			System.out.println("Enter the elements of array : ");
			for(int i=0;i<n;i++) a[i]=Integer.parseInt(sc.nextLine());
			System.out.print("Enter the index you want to access : ");
			int key=Integer.parseInt(sc.nextLine());
			System.out.println("The element at index "+key+" = "+a[key]);
			System.out.println("The array element successfully accessed.");
		}
		catch(NumberFormatException nfe){
			System.out.println(nfe);
		}
		catch(IndexOutOfBoundsException iobe){
			System.out.println(iobe.toString());
		}
		finally{
			sc.close();
		}
	}
}
