class Ragged {
	public static void main (String[] args){
		int riders[][]  = new int [7][];
		for ( int i = 0; i < 5; i++)
			riders[i] = new int [10];
		for ( int i = 5; i < 7; i++)
			riders[i] = new int [2];
		
		//int m, n;
		
		for ( int m = 0; m < 5; m++)
		for ( int n = 0; n < 10; n++)
			riders[m][n] = m + n + 10;
		for ( int m = 5; m < 7; m++)
		for ( int n = 0; n < 2; n++)
			riders[m][n] = m + n + 10;
		
		for ( int m = 0; m < 5; m++){
		for ( int n = 0; n < 10; n++){
			System.out.print(riders[m][n] + " ");
		}
		System.out.print("\n");
		}
	}
}