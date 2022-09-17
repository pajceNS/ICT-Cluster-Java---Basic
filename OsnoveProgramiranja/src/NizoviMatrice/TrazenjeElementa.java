package NizoviMatrice;

public class TrazenjeElementa {

	public static void main(String[] args) {
		int[] x = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 12, 7, 2, 12};
		int kojiBroj, i;
		boolean imaGa = false;
		System.out.println("Unesite broj koji se traži:\t"); // prihvati broj vrsta i kolona
		kojiBroj = TextIO.getlnInt();
		
		for (i=0; i < x.length; i++)
			if (x[i]==kojiBroj)
				imaGa = true;
		
		
		if (imaGa)
			System.out.println("Broj " + kojiBroj + " se nalazi u nizu.");
		else
			System.out.println("Broj " + kojiBroj + " se ne nalazi u nizu.");
	}

}
