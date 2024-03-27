package JavaQuestions;

import java.lang.reflect.Array;

import org.checkerframework.checker.index.qual.EnsuresLTLengthOfIf;


public class CompareIndexsOfTwoDifferentArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1, 2, 3, 4, 5};
		int b[] = new int[5];
		b[0] = 1;
		b[1] = 7;
		b[2] = 8;
		b[3] = 9;
		b[4] = 10;
		int difference = 0;
		for(int i = 0; i<=a.length-1; i++) {
			for(int j=0; j<b.length-1; j++) {
				if(a[i] == b[j]) {
					 difference = a[i];
				}
			}
	
		}
		System.out.println(difference);
		
		
		

	}

}