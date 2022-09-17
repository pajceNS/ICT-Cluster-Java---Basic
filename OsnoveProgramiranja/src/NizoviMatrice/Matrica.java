package NizoviMatrice;

public class Matrica {

	public static void main(String[] args) {
		int maxVrsta = 10;
		int maxKolona = 20;
		int i, j, brojVrsta, brojKolona;
		int[][] MatricaN = new int[maxVrsta][maxKolona];
		
		System.out.println("Unesite broj vrsta: ");
		brojVrsta = TextIO.getlnInt();
		System.out.println("Unesite broj kolona: ");
		brojKolona = TextIO.getlnInt();
		
		for (i = 0; i < brojVrsta; i++)
			for (j = 0; j < brojKolona; j++) {
				System.out.println("");
				MatricaN[i][j] = TextIO.getlnInt();
			}
		for (i=0; i<brojVrsta; i ++)
			for (j=0; j<brojKolona; j++) {
				
			}
	}

}
