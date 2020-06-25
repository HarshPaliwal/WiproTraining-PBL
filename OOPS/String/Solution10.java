public class Solution10{
	public static void main(String[] args){
		String s=args[0];
		int n=Integer.parseInt(args[1]);
		for(int i=0;i<n;i++){
			System.out.print(s.substring(n-1,s.length()));
		}
	}
}