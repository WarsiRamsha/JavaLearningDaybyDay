package Arrays;

public class TwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] TwoDim;
		TwoDim = new int [3][3] ;			//pressed Tab three times declaring array
	
		int a = 15;
		
		for (int i = 0; i <  3; i++ ){
			for (int j = 0; j < 3; j++) {
				TwoDim[i][j] = a;
				a += 5;
			}
		}		
		for (int i = 0; i <  3; i++ ){
			for (int j = 0; j < 3; j++) {
				System.out.println(TwoDim[i][j]);
			}
		}		
		
	}
}
	/*for (int i = 0; i <  3; i++ )
	{
		for (int j = 0; j < 3; j++);
	}
	{
		System.out.println(TwoDim[2][2]);
	}
		*/
