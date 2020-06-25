public class Solution2{
	public static void main(String[] args){
		String a=args[0].toLowerCase();
		String b=args[1].toLowerCase();
		if(a.charAt(a.length()-1)==b.charAt(0)){
			System.out.println(a.substring(0,a.length()-1)+b);
		}
		else{
			System.out.println(a+" "+b);
		}
	}
}