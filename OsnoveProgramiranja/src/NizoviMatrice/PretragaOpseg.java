package NizoviMatrice;

public class PretragaOpseg {

	public static void main(String[] args) {
		int[] niz = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int donjaGranica, gornjaGranica;
		int i, koliko = 0;
		int[] pozicijeBrojeva = new int[10];

		System.out.println("Unesite gornju vrednost broja koji se traži u nizu:\t");
		gornjaGranica = TextIO.getlnInt();
		
		System.out.println("Unesite donju vrednost broja koji se traži u nizu:\t");
		donjaGranica = TextIO.getlnInt();
		
		// provera da li je donja granica manja od gornje
		
		for (i = 0; i < niz.length; i++)
			if (donjaGranica < niz[i] && gornjaGranica > niz[i])
				pozicijeBrojeva[koliko++] = i; // pozicija broja
		
		System.out.println(" Elemenati niza su:");
		System.out.print(" [ ");
		for (i = 0; i < niz.length; i++)
			System.out.print(niz[i] +" ");
		System.out.println(" ] ");
		
		System.out.println("U opsegu [ " + donjaGranica + " , " + gornjaGranica + " ] se nalazi " + koliko + " broja.");
		
		if (koliko > 0) {
			System.out.println("To su sledeći elementi niza:");
			for (i = 0; i < koliko; i++)
				System.out.println("[ " + (pozicijeBrojeva[i]+1) + " ] = " + niz[pozicijeBrojeva[i]]);
			
		}
		
		
	}

}
