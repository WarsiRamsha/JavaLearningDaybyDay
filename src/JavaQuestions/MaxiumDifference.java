
public class MaxiumDifference {

	public static void main(String[] args) {
		// Maximum Difference Between Any Adjacent index in array
		int a[] = {1,4,8,15,17}; 
		int difference =0;
		for(int i= 0; i<a.length-1; i++) {
			
			if((a[i+1]-a[i]> difference) ) {
				difference = a[i+1]-a[i];
			}			
		}
		System.out.println(difference);

	}

}
