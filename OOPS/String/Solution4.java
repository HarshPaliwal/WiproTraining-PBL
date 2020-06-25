public class Solution4{
	public static void main(String[] args){
		String s=args[0];
		if(s.length()%2==0){
			System.out.println(s.substring(0,s.length()/2));
		}
		else
			System.out.println("null");
	}
}