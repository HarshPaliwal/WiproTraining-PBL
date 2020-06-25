class Solution16{
	public static void main(String[] args){
		int var=Integer.parseInt(args[0]);
		while(var>0){
			System.out.print(var%10);
			var/=10;
		}
	}
}