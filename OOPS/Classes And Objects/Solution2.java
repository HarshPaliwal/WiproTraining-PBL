public class Solution2{
	public static void main(String[] args){
		System.out.println("2 to the power 3 is "+Calculator.powerInt(2,3));
		System.out.println("2.5 to the power 3.1 is "+Calculator.powerDouble(2.5,3.1));
	}
}
class Calculator{
	public static int powerInt(int num1,int num2){
		return (int)Math.pow(num1,num2);
	}
	public static double powerDouble(double num1,double num2){
		return Math.pow(num1,num2);
	}
}