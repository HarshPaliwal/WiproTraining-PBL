public class Solution9{
	public static void main(String[] args){
		String a=args[0];
		String b=args[1];
		int lenA=a.length();
		int lenB=b.length();
		if(lenA<lenB){
			for(int itr=0;itr<lenA;itr++){
				System.out.print(a.charAt(itr));
				System.out.print(b.charAt(itr));
			}
			for(int itr=lenA;itr<lenB;itr++){
				System.out.println(b.charAt(itr));
			}
		}
		else if(lenA>lenB){
			for(int itr=0;itr<lenB;itr++){
				System.out.print(a.charAt(itr));
				System.out.print(b.charAt(itr));
			}
			for(int itr=lenB;itr<lenA;itr++){
				System.out.println(a.charAt(itr));
			}
		}
		else{
			for(int itr=0;itr<lenB;itr++){
				System.out.print(a.charAt(itr));
				System.out.print(b.charAt(itr));
			}
		}
	}
}