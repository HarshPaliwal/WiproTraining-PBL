class Solution14{
	public static void main(String[] args){
		if(args.length!=9){
			System.out.print("Please Enter 9 integers.");
			System.exit(0);
		}
		int row=3;
		int col=3;
		int[][] arr=new int[row][col];
		int max=Integer.MIN_VALUE;
		for(int row_itr=0,itr=0;row_itr<row;row_itr++){
			for(int col_itr=0;col_itr<col;col_itr++){
				arr[row_itr][col_itr]=Integer.parseInt(args[itr++]);
			}
		}
		for(int row_itr=0,itr=0;row_itr<row;row_itr++){
			for(int col_itr=0;col_itr<col;col_itr++){
				System.out.print(arr[row_itr][col_itr]+" ");
				max=Math.max(arr[row_itr][col_itr],max);
			}
			System.out.println();
		}
		System.out.println("The biggest number in the given array is : "+max);
	}
}