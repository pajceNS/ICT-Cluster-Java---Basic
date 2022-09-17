package NizoviMatrice;

public class OsmiZadatak {

	public static void main(String[] args) {
		// korisnik treba da zada gornji i donji opseg vrednosti
		// za te vrednosti pozicije treba pronaci i sacuvati u grugi niz
		// pozicije sve vrednosti koje se nalaze izmedju
		// donjeg i gornjeg opstega
		int[] niz = new int[] { 2, 3, 54, 100, 7, 1, 4 };
		int donjaVrednost, gornjaVrednost;
		int i = 0, kolikoVrednosti = 0;
		int[] pozicijeBrojeva = new int[7];

		System.out.println("Unesite donju vrednost: ");
		donjaVrednost = TextIO.getlnInt();
		System.out.println("Unesite gornju vrednost: ");
		gornjaVrednost = TextIO.getlnInt();
		// provera

		for (i = 0; i < niz.length; i++)
			if (donjaVrednost < niz[i] && gornjaVrednost > niz[i])
				pozicijeBrojeva[kolikoVrednosti++] = i;

		System.out.println("Elementi niza su: ");
		System.out.print(" [ ");
		for (i = 0; i < niz.length; i++)
			System.out.print(niz[i] + " ");
		System.out.println(" ] ");

		System.out.println(
				"U opsegu [ " + donjaVrednost + " , " + gornjaVrednost + " ] se nalazi " + kolikoVrednosti + " broja.");
		if (kolikoVrednosti > 0) {
			System.out.println("To su sledeci elementi");
			for (i = 0; i < kolikoVrednosti; i++)
				System.out.println("[ " + (pozicijeBrojeva[i] + 1) + " ] = " + niz[pozicijeBrojeva[i]]);
		}
	}
}
