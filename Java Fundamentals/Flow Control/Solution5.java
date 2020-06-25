class Solution5{
	public static void main(String[] args){
		char var='@';
		if((var>=65 && var<=90)||(var>=97 && var<=122))
			System.out.print("Alphabet");
		else if(var>=48 && var<=58)
			System.out.print("Digit");
		else
			System.out.print("Special Character");
	}	
}