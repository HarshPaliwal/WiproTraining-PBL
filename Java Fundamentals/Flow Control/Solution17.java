class Solution17{
	public static void main(String[] args){
		int var=Integer.parseInt(args[0]);
		int temp=var;
		int sum=0;
		while(temp>0){
			sum*=10;
			sum+=temp%10;
			temp/=10;
		}
		if(sum==var)
			System.out.println(var+" is a Palindrome.");
		else
			System.out.println(var+" is not a Palindrome.");
	}
}