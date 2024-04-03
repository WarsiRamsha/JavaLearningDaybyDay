package JavaQuestions;

import org.checkerframework.checker.index.qual.EnsuresLTLengthOfIf;

public class GivenNumberIsEvenOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int givenNumber = 6;
		if(givenNumber%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		}
	}

}
