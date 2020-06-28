import java.io.*;
import java.util.*;

public class Solution3 {

	public static void main(String[] args) throws IOException {
		String inputFile =args[0];
		String outputFile =args[1];
	
		File filein = new File(inputFile);
		File fileout = new File(outputFile);
		
		BufferedReader br = new BufferedReader(new FileReader(filein));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));
		
		Map<String, Integer> map = new TreeMap<>();
		
		String s;
		while ((s = br.readLine()) != null) {
			s = s.trim();
			String[] line = s.split(" ");
			
			for (String word : line) {
				if (!map.containsKey(word))
					map.put(word, 1);
				else
					map.put(word, map.get(word) + 1);
			}		
		};
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry me = (Map.Entry)itr.next();
			
			bw.write(me.getKey() + " : " + me.getValue());
			bw.newLine();
		}
		br.close();
		bw.close();
	}

}