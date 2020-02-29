class TwoD {
	public static void main (String args[]) {
		int a, b;
		
		int[][] table = new int[3][4];
		
		for (a = 0; a < 3; a++){
			for (b = 0; b < 4; b++){
				table[a][b] = a*6 + b*2;
			}
		}
		for (a = 0; a < 3; a++){
			for (b = 0; b < 4; b++){
				System.out.println(table[a][b]);
			}
		}
	}
}
