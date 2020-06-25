public class Solution3{
	public static void main(String[] args){
		String s=args[0];
		StringBuffer str=new StringBuffer();
		for(int i=0;i<s.length();i++){
			str.append(s.substring(0,2));
		}
		System.out.println(str);
	}
}