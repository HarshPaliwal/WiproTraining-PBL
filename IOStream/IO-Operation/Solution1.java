import java.io.*;
import java.util.Scanner;

public class Solution1 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String fileName = sc.nextLine();
		System.out.println("Enter the character to be counted");
		char ch = sc.nextLine().charAt(0);
	
		File f = new File(fileName);
		int chCount = 0;
		
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		int c;
		do {
			c = br.read();
			if(Character.toLowerCase(c)==Character.toLowerCase(ch))
				chCount++;
		} while (c != -1);
				
		System.out.println("File '" + fileName + "' has " +
				chCount + " instances of letter '" + ch + "'.");
		
		br.close();
		sc.close();
	}

}