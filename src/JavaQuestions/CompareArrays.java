
public class CompareArrays {
	//Compare indexes of two array and print the same indexes in an array

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a1= {1,2,3,4};
		int [] a2= {2,3,4,5,6};
		int difference = 0;
		
		for(int i=0; i<a1.length; i++) {
			
			for(int j=0; j<a2.length; j++) {
				if (a1[i] == a2[j]) {
					difference = a1[i];
				}
			}
		System.out.println(difference);
		}

	}

}
