package NizoviMatrice;

public class PrebrojavanjeElNiza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] x = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 12, 7, 2, 12};
		int brElem = 0, kojiBroj, i, j = 0;
		int[] pozBroja = new int[12];
		System.out.println("Unesite broj koji se traži:\t"); // prihvati broj vrsta i kolona
		kojiBroj = TextIO.getlnInt();
		
		for (i=0; i < x.length; i++)
			if (x[i]==kojiBroj)
				brElem++;
		
		
		for (i=0; i < x.length; i++)
			if (x[i]==kojiBroj) {
				pozBroja[j] = i;
				j++;
			}

		System.out.println("Broj " + kojiBroj + " se nalazi na " + brElem + " mesta u nizu.");
	}

}
