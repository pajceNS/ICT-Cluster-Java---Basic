package NizoviMatrice;

public class MatriceOperacije {
	public static void main(String[] args) {
		int brVr = 4, brKol = 3;
		int[][] matr = new int[][] {{1, 2, 3}, {4, 5, 6}, {8, 8, 9}, {1, 1, 1}};
		int[] sumaKol = new int[brKol];
		int maks; 
		int maks_i, maks_j;
		int i, j;
		
		// ispisivanje sadržaja matrice
		for (i = 0; i < brVr; i++) {
			for (j = 0; j < brKol; j++)
				System.out.print(matr[i][j] + " ");
			System.out.println();
		}
		
		// koji je najveći broj druge vrste?
		maks = matr[1][0];
				
		for (j = 0; j < brKol; j++)
			if (maks < matr[1][j])
				maks = matr[1][j];
			
		// pozicija maksimuma cele matrice
		maks_i = 0; maks_j = 0;
		for (i = 0; i < brVr; i++) 
			for (j = 0; j < brKol; j++)
				if (matr[maks_i][maks_j] < matr[i][j]) {
					maks_i = i; 
					maks_j = j;
				}
		System.out.println("Maksimum matrice:");
		System.out.println("[ " + (maks_i+1) + " ] [ " + (maks_j+1) + " ] = " + matr[maks_i][maks_j]);
		
		// suma po koloni
		for (j = 0; j < brKol; j++)
			for (i = 0; i < brVr; i++)
				sumaKol[j]+=matr[i][j];
			// j = 0, sumaKol[0] = matr[0][0]+matr[1][0]+matr[2][0]+matr[3][0]
			// j = 1, sumaKol[1] = matr[0][1]+matr[1][1]+matr[2][1]+matr[3][1]
		
		
	}
}
