package NizoviMatrice;

public class Niz {

	public static void main(String[] args) {
		
		int max_br_elem = 50;
		int i;
		int n = 1;
		int max_br = 1;
		int maxAt = 1;
		int suma = 0;
		int[] nizInt = new int[max_br_elem];
		
		System.out.println("Unesite broj elemenata niza (max 50): ");
		do {
			n = TextIO.getlnInt();
			if (n > 50 || n < 0)
				System.out.println("Unesite broj od 1 do 50.");
		} while (n > 50 || n < 0);
		for (i = 0; i < n; i++) {
			System.out.println("Unesite element niza" + " " + (i + 1));
			nizInt[i] = TextIO.getlnInt();
			suma += nizInt[i];
		}
		for (i = 0; i < n; i++) {
			if (nizInt[i] > max_br) {
				max_br = nizInt[i];
			}
		}
		for (i = 0; i < n; i++) {
			if (max_br == nizInt[i]) {
				maxAt = i;
			}
		}

		System.out.println("Suma elemenata niza iznosi: " + suma);
		System.out.println("Vrednost elementa u nizu sa najvecom vrednoscu iznosi: " + max_br);
		System.out.println("Pozicija maksimalnog broja je: " + maxAt);
	}
}
