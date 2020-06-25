public class Solution6{
	public static void main(String[] args){
		String a=args[0];
		String b=args[1];
		if(a.length()<b.length()){
			System.out.println(a+b+a);
		}
		else{
			System.out.println(b+a+b);
		}
	}
}