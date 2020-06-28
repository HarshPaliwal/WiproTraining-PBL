import java.io.*;
import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input file name");
		String inputFile = sc.nextLine();
		System.out.println("Enter the output file name");
		String outputFile = sc.nextLine();
	
		File filein = new File(inputFile);
		File fileout = new File(outputFile);
		
		BufferedReader br = new BufferedReader(new FileReader(filein));
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileout));
		
		int ch;
		while ((ch = br.read()) != -1) {
			bw.write(ch);
		};
		System.out.println("File is copied.");
		br.close();
		bw.close();
		sc.close();
	}
}