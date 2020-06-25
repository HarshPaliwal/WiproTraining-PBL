public class Solution1{
	public static void main(String[] args){
		int width=Integer.parseInt(args[0]);
		int height=Integer.parseInt(args[1]);
		int depth=Integer.parseInt(args[2]);
		Box b=new Box(width,height,depth);
		System.out.println(b.volume());
	}
}
class Box{
	int width;
	int height;
	int depth;
	Box(int width,int height,int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	int volume(){
		return width*height*depth;
	}
}
