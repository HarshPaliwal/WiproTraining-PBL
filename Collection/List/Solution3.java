import java.util.*;
public class Solution3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		for(int i=1;i<=10;i++){
			list.add("String "+Integer.toString(i));
		}
		printAll(list);
	}

	public static void printAll(List<String> list) {
		Iterator<String> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}
}