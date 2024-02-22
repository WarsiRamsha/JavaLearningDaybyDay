import java.util.ArrayList;
import java.util.Collections;

public class ReversewithArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int b : a) {
			al.add(b);
		}
		Collections.reverse(al);
		Object[] d = al.toArray();
		for (Object e : d) {
			System.out.println(e);
		}

	}

}
