package JavaQuestions;


public class ANumberInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5};
		int b = 7;
		boolean flag = false;
		for(int i = 0; i<=a.length-1; i++) {
			if(a[i]==b) {
				flag = true;
				System.out.println("Number is found at index " + i);	
			
			}
		}
		if(flag == false) {
		System.out.println("Number is not found in array");	
		}
		
	}

}