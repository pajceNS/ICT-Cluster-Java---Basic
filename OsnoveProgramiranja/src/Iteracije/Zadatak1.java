package Iteracije;

public class Zadatak1 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji određuje prosečan broj studenata na godini. Korisnik
		 * unosi student po smerovima sve dok ne unese vrednost 0. Broj studenata na
		 * smeru je u intervalu 1..160.
		 */

		int unetiBroj, ukupnoUnetih = 0, prosecanBrojStudenata=0;
		System.out.println("Racunamo prosecan broj studenata na godini.");
		do {
			System.out.println("Uneseti broj studenata na godini: ");
			unetiBroj = TextIO.getlnInt();
			if (unetiBroj < 1 || unetiBroj > 160) {
				System.out.println("Unesite broj izmedju 1 i 160");
			} else {
				ukupnoUnetih++;
			}
		} while (unetiBroj != 0);
	}

}
