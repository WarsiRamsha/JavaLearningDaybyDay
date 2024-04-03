package Recursion;

public class ToPrintNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				int n = 1;
				toPrint1to5(n);

			}

			private static void toPrint1to5(int n) {
				// TODO Auto-generated method stub
				if(n>10) {
					return;
				}
				
				System.out.println(n);
				toPrint1to5(n+1);
				
			}


	}

