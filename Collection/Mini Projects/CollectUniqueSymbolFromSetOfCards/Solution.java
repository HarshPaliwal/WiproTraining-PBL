import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Card> set = new HashSet<>();
		
		for (int i = 0; i < 8; i++) {
			System.out.println("Enter a card:");
			char symbol=sc.nextLine().charAt(0);
			int value=Integer.parseInt(sc.nextLine());
			Card card = new Card(symbol,value);
			set.add(card);
		}
		System.out.println("Four symbols gathered in 8 cards.");
		System.out.println("Cards in Set are:");
		
		
		for (Card card : set) 
			System.out.println(card.toString());		
		
		sc.close();
	}

}