import java.util.*;
public class Solution6{
	static Vector<String> months=new Vector<>();
	public static void main(String[] args){
		months.add("Januaray");
		months.add("Feburary");
		months.add("March");
		months.add("April");
		months.add("May");
		months.add("June");
		months.add("July");
		months.add("August");
		months.add("September");
		months.add("October");
		months.add("November");
		months.add("December");
		printAllMonths();
	}
	public static void	printAllMonths(){
		Iterator<String> itr=months.iterator();
		System.out.println("The months in a year are: ");
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}