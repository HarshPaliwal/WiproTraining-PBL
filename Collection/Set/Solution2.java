import java.util.HashSet;
import java.util.Iterator;

public class Solution2 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<>();
		set.add("Arya Stark");
		set.add("Dr.Strange");
		set.add("Hermonie Granger");
		set.add("Chandler Bing");
		
		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());

	}
}