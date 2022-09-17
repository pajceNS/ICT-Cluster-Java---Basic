package Potprogrami;

public class Zadatak1 {
	static final int KATEGORIJE = 5;
	static final int DANI = 30;

	public static void main(String[] args) {

		double[][] EvidOsig = new double[DANI][KATEGORIJE];
		// inicializuju sve elemente na 0
		char izbor = '0';

		do {

			prikaziMatricu(EvidOsig, "DANI", "KATEGORIJE");

			// prikazMenija();

			izbor = preuzmiChar('0', '7', "", "Morate odabrati vrednost u opsegu od 0-7");
			// dve funkcije
			// pokupim izbor

			switch (izbor) {
			case '1': // unos
				break;
			case '2': // izmena
				break;
			case '3': // rezultati sortirani po danima
				break;
			case '4': // rezultati sortirani po kategorijama
				break;
			case '5': // dan kada je ostvaren najmanji prihod
				break;
			case '6': // mesecni prihod svake kategorije
				break;
			case '7': // prosecan mesecni prihod
			}

		} while (izbor != '0');
	}

	static void prikazMenija() {
		System.out.println("Dobrodosli u program za vodjenje evidencije rada agenta osiguranja!");
		System.out.println("Molimo Vas izaberite jednu od ponudjenih opcija: ");
		System.out.println("\t 1: Unos ostvarenog prihoda za zeljenu kategoriju i zeljeni dan.");
		System.out.println("\t 2: Izmena ostvarenog prihoda za zeljenu kategoriju i zeljeni dan.");
		System.out.println("\t 3: ");
		System.out.println("\t 4: ");
		System.out.println("\t 5: ");
		System.out.println("\t 6: ");
		System.out.println("\t 7: ");
		System.out.println("\t 0: Izlazak iz programa.");
	}

	static char preuzmiChar(char donja, char gornja, String poruka, String porukaGreska) {
		char vrednost = '0';
		// char donja = '0';
		// char gornja = '7';

		do {
			System.out.println(poruka);
			vrednost = TextIO.getlnChar();
			if (vrednost < donja || vrednost > gornja)
				System.out.println(porukaGreska);
		} while (vrednost < donja || vrednost > gornja);

		return vrednost;
	}

	static int preuzmiInt(int donja, int gornja, String poruka, String porukaGreska) {
		int vrednost = '0';
		// char donja = '0';
		// char gornja = '7';

		do {
			System.out.println(poruka);
			vrednost = TextIO.getlnInt();
			if (vrednost < donja || vrednost > gornja)
				System.out.println(porukaGreska);
		} while (vrednost < donja || vrednost > gornja);

		return vrednost;
	}

	static void unesiPrihod(double[][] eo) {
		
	}

	static void izmenaPrihoda(double[][] eo) {

	}

	static void prikazKategorijaZaDane(double[][] eo) {

	}

	static void prikazDanaZaKategoriju(double[][] eo) {

	}

	static void danSaNajmanjimPrihodom(double[][] eo) {

	}

	static void prihodiKategorija(double[][] eo) {

	}

	static void mesecniPrihod(double[][] eo) {

	}

	static void prikaziMatricu(double[][] eo, String imeVr, String imeKol) {
		int i = 0;
		int j = 0;
		int brVr = eo.length;
		int brKol = eo[0].length;
		int brKaratkteraVrsta = imeVr.length();

		for (i = 0; i <= imeVr.length(); i++)
			System.out.println(" ");
		System.out.println(" " + imeKol);
		System.out.println(imeVr);

		for (i = 0; i < brVr; i++) {
			for (j = 0; j < brVr; j++)
				System.out.println(" " + eo[i][j]);
			System.out.println();
		}
	}
	
	static void ispisiPraznaMesta(int vel) {
		for (int k = 0; k <= vel; k++)
			System.out.println(" ");
	}
}