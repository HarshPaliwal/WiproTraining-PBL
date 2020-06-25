class Solution14{
	public static void main(String[] args){
		int num=Integer.parseInt(args[0]);
		int sumOfDigits=0;
		for(;num>0;num/=10){
			sumOfDigits+=num%10;
		}
		System.out.println(sumOfDigits);
	}
}