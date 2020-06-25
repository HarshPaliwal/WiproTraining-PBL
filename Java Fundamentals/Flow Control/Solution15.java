import java.util.*;
class Solution15{
	public static void main(String[] args){
		if(args.length==0){
			System.out.print("Please Enter an integer");
			System.exit(0);
		}
		int var=Integer.parseInt(args[0]);
		for(int rowItr=1;rowItr<=var;rowItr++){
			int colItr=1;
			while(colItr<=rowItr){
				System.out.print("* ");
				colItr++;
			}
			System.out.println();
		}
	}
}