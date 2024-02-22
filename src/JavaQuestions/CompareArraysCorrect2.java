import java.util.ArrayList;

//compare arrays and store matching indexes in an array
public class CompareArraysCorrect2 {
	public static void main(String[] args) {
		int[] a1 = { 1, 4, 5, 7 };
		int[] a2 = { 6, 4, 3, 7 };
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 0; i<a1.length; i++) {
			if(a1[i] == a2[i]) {
				al.add(a1[i]);
			}
		}
		Object[] c = al.toArray();
		for(Object matchedValues:c) {
			System.out.println(matchedValues);
		}
		
		
	}
}
