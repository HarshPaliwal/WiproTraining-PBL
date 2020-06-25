class MathOperation{
	public static void main(String[] args){
		int[] a=new int[5];
		try{
			for(int i=0;i<5;i++)
				a[i]=Integer.parseInt(args[i]);
			int sum=0;
			int avg=0;
			for(int i=0;i<5;i++)
				sum+=a[i];
			avg=sum/5;
			System.out.println("The sum of array elements is : "+sum);
			System.out.println("The average of array elements is : "+avg);
		}
		catch(NumberFormatException nfe){
			System.out.println(nfe.toString());
		}
		catch(ArithmeticException ae){
			System.out.println(ae.toString());
		}
		catch(IndexOutOfBoundsException iobe){
			System.out.println(iobe.toString());
		}
		catch(Exception e){
			System.out.println(e.toString());
		}
	}
}