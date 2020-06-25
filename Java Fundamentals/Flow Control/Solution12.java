class Solution12{
	public static void main(String[] args){
		int itr=Integer.parseInt(args[0]);
		if(itr==1){
			System.out.println("1 is neither Prime nor not Prime");
			System.exit(0);
		}
		if(itr%2!=0 || itr==2){
				boolean isPrime=true;
				for(int j=3;j<=Math.sqrt(itr);j+=2)
				{
					if(itr%j==0)
						isPrime=false;
				}
				if(isPrime){
					System.out.println(args[0]+" is Prime.");
					System.exit(0);
				}
		}
		System.out.println(args[0]+" isn't Prime.");
	}
}