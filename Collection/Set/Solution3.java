import java.util.Iterator;
import java.util.TreeSet;
import java.util.NavigableSet;
public class Solution3 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("Arya Stark");
		set.add("Dr.Strange");
		set.add("Hermonie Granger");
		set.add("Chandler Bing");
		
		Iterator<String> it = set.iterator();
		System.out.println("Set Elements are:\n");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		NavigableSet<String> reverseSet=set.descendingSet();
		it=reverseSet.iterator();
		System.out.println("\nReversing set elemnets.");
		System.out.println("Set Elements are:\n");
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		it=set.iterator();
		System.out.println("\nSearching for Chandler Bing.");
		String query = "Chandler Bing";
		boolean result = false;
		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}
		if (result) System.out.println(query + " exists");
		else System.out.println(query + " doesn't exist");

	}

}