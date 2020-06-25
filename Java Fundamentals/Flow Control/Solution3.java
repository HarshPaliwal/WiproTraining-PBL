class Solution3{
	public static void main(String[] args){
		if(args.length==0)
			System.out.println("No Values");
		else{
			for(int itr=0;itr<args.length;itr++){
				System.out.print(args[itr]);
				if(itr!=(args.length-1))
					System.out.print(", ");
			}
		}
	}
}