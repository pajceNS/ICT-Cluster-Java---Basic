package Potprogrami;

public class BazicneOperacijeNiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = new int[30];
		int brElNiz = 0;
		char izbor = '0';

		// inicijalizacija niza
		// provera ispravnosti ulaznih podatak
		brElNiz = unosVrednosti("Unesite broj elemenata niza (od 0 do 30)");
		vratiNiz(brElNiz, x);

		// operacije nad tim nizom
		do {
			ispisiMeni();

			izbor = TextIO.getlnChar();

			if (izbor != '0') {
				switch (izbor) {
				case '1':
					// sumiranje
					System.out.println("Suma elemenata niza iznosi " + sumaVrednostNiza(brElNiz, x));
					break;
				case '2':
					// srednja vrednost
					System.out.println("Srednja vrednost el. niza iznosi " + srVr(brElNiz, x));
					break;
				case '3':
					// maksimum
					System.out.println("Najveći el. niza ima vrednost " + maksimumNiza(brElNiz, x));
					break;
				case '4':
					// minimum
					System.out.println("Najmanji el. niza ima vrednost " + minimumNiza(brElNiz, x));
				}
			}
		}while (izbor != '0');
	}

	static int unosVrednosti(String poruka) {
		int operand = 0;
		System.out.println(poruka);
		operand = TextIO.getlnInt();
		return operand;
	}

	static void vratiNiz(int n, int[] niz) {
		for (int i = 0; i < n; i++) {
			System.out.print("[" + (i + 1) + "]=");
			niz[i] = TextIO.getlnInt();
		}
	}

	static void ispisiMeni() {
		System.out.println();
		System.out.println("  Izaberite jednu od opcija->");
		System.out.println("  0. izlazak iz programa");
		System.out.println("  1. sumiranje el. niza");
		System.out.println("  2. određivanje srednje vrednosti");
		System.out.println("  3. nalaženje maksimalne vrednosti");
		System.out.println("  4. nalaženje minimalne vrednosti");
	}

	static int sumaVrednostNiza(int n, int[] nizElem) {
		int suma = 0;
		int i = 0;
		for (i = 0; i < n; i++)
			suma += nizElem[i];
		return suma;
	}

	static double srVr(int n, int[] nizElem) {
		return sumaVrednostNiza(n, nizElem) / (double) n;
	}

	static int maksimumNiza(int n, int[] nizElem) {
		int maks = nizElem[0];
		int i;
		for (i = 1; i < n; i++)
			if (maks < nizElem[i])
				maks = nizElem[i];
		return maks;
	}

	static int minimumNiza(int n, int[] nizElem) {
		int min = nizElem[0];
		int i;
		for (i = 1; i > n; i++)
			if (min > nizElem[i])
				min = nizElem[i];
		return min;

	}
}
