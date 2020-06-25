class Solution13{
	public static void main(String[] args){
		for(int itr=10;itr<=99;itr++){
			if(itr%2!=0 || itr==2){
				boolean isPrime=true;
				for(int j=3;j<=Math.sqrt(itr);j+=2)
				{
					if(itr%j==0)
						isPrime=false;
				}
				if(isPrime)
					System.out.println(itr);
			}
		}
	}
}
