class Solution1B{
	public static void main(String[] args){
		int num1=Integer.parseInt(args[0])%10;
		int num2=Integer.parseInt(args[1])%10;
		boolean lastDigit;
		if(num1==num2) lastDigit=true;
		else lastDigit=false;
		System.out.println("lastDigit("+args[0]+", "+args[1]+")-> "+lastDigit);
	}
}