import java.util.*;
import java.util.Map.Entry;
public class Solution2 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		
		map.put("India", "Delhi");
		map.put("Japan", "Tokyo");
		map.put("Bangladesh", "Dhaka");
		
		Set<String> key = map.keySet();
		Iterator<String> itr = key.iterator();
		
		while (itr.hasNext()) {
			if (itr.next().equals("Japan")) {
				System.out.println("Key Japan exists");
				break;
			}
		}
		Set<Entry<String, String>> set = map.entrySet();
		Iterator<Entry<String, String>> it = set.iterator();
		
		set = map.entrySet();
		it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			
			if (me.getValue().equals("Delhi")) {
				System.out.println("Value Delhi exists");
				break;
			}
		}
		
		set = map.entrySet();
		it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry<String, String> me = it.next();
			System.out.println(me);
		}
	}

}
