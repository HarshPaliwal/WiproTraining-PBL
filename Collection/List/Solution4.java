import java.util.*;
class MyArrayList<E> extends ArrayList<E> {
	@Override
	public boolean add(E e) {
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			System.out.println("Number "+e+" is successfully added.");
			return true;
		} else {
			System.out.println("Cannot Store '"+e+"' of type "+e.getClass().getSimpleName());
			System.out.println("Only Integer, Float, and Double are supported.");
		}
		return false;
	}
}

public class Solution4 {

	public static void main(String[] args) {
		List<Object> list = new MyArrayList<>();
			list.add(1);
			list.add(1e3F);
			list.add(3.141_5D);
			list.add("Game of Thrones");
		System.out.println(list);
	}
}