package JavaQuestions;

import java.awt.FocusTraversalPolicy;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {11,9,5,7,3, 6,2};
		int swappedNumber = 0;
		for(int i=0; i<=a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					swappedNumber=a[i]; 
					a[i]= a[j];
					a[j]=swappedNumber;
			}
			
		
			}
		}
		System.out.println("Swapped Number");
		for(int i =0; i<a.length-1; i++) {
			System.out.println(a[i]);
		}
	}

}
