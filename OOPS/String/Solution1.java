public class Solution1{
	public static void main(String[] args){
		String s=args[0];
		boolean isPalindrome=true;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome){
			System.out.println(s+" is palindrome");
		}
		else{
			System.out.println(s+" isn't palindrome");
		}
	}
}
