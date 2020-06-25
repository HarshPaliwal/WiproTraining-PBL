class Solution13{
	public static void reverseRows(int[][] arr,int row,int col){
		for(int i=0;i<row;i++){
			int start=0;
			int end=col-1;
			while(start<end){
				int temp=arr[i][start];
				arr[i][start]=arr[i][end];
				arr[i][end]=temp;
				start++;
				end--;
			}
		}
	}
	public static void reverseCols(int[][] arr,int row,int col){
		for(int i=0;i<col;i++){
			int start=0;
			int end=row-1;
			while(start<end){
				int temp=arr[start][i];
				arr[start][i]=arr[end][i];
				arr[end][i]=temp;
				start++;
				end--;
			}
		}
	}
	public static void main(String[] args){
		if(args.length!=4){
			System.out.print("Please Enter 4 integers.");
			System.exit(0);
		}
		int row=2;
		int col=2;
		int[][] arr=new int[row][col];
		for(int row_itr=0,itr=0;row_itr<row;row_itr++){
			for(int col_itr=0;col_itr<col;col_itr++)
				arr[row_itr][col_itr]=Integer.parseInt(args[itr++]);
		}
		reverseRows(arr,row,col);
		reverseCols(arr,row,col);
		for(int row_itr=0,itr=0;row_itr<row;row_itr++){
			for(int col_itr=0;col_itr<col;col_itr++)
				System.out.print(arr[row_itr][col_itr]+" ");
			System.out.println();
		}
	}
}