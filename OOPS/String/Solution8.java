public class Solution8{
	public static void main(String[] args){
		String s=args[0];
		for(int i=0;i<s.length();i++){
			if((i<s.length()-1)&&(s.charAt(i+1)=='*')){
				i+=2;
			}
			else{
				System.out.print(s.charAt(i));
			}
		}
	}
}