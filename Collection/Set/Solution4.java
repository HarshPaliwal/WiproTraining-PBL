import java.util.Iterator;
import java.util.TreeSet;

class Country {
	TreeSet<String> H1 = new TreeSet<>();
	
	public TreeSet<String> saveCountryNames(String CountryName) {
		H1.add(CountryName);
		return H1;
	}
	
	public String getCountry(String CountryName) {
		Iterator<String> it = H1.iterator();
		
		while (it.hasNext()) {
			if (it.next().equals(CountryName))
				return CountryName;
		}
		
		return null;
	}
}
public class Solution4 {

	public static void main(String[] args) {
		Country countries = new Country();
		countries.saveCountryNames("India");
		countries.saveCountryNames("USA");
		countries.saveCountryNames("Russia");
		countries.saveCountryNames("Isarel");
		countries.saveCountryNames("France");

		System.out.println("France: " + countries.getCountry("France"));
		System.out.println("Iran: " + countries.getCountry("iran"));		
	}

}