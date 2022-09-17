package Iteracije;

public class Zadatak2 {

	public static void main(String[] args) {
		/*
		 * Napisati program koji određuje ukupan broj brojeva deljivih sa 7. Korisnik
		 * unosi brojeve sve dok ne unese vrednost -1. Uneti broj mora biti u intervalu
		 * od 6..142.
		 */

		int unetiBroj, ukupnoDeljivih = 0, ukupnoUnetih = 0;

		System.out.println("Da vidimo koliko je od unetih celih brojeva deljivo sa 7?");
		System.out.println("Broj mora biti u opsegu od 6 do 142.");
		System.out.println("Za kraj unosa uneti -1.");
		System.out.println();

		do {
			System.out.print("Unesite ceo broj: ");
			unetiBroj = TextIO.getlnInt();
			if (unetiBroj < 6 || unetiBroj > 142) {
				System.out.println("Broj mora biti u opsegu od 6 do 142.");
			} else {
				ukupnoUnetih++;
				if (unetiBroj % 7 == 0) {
					ukupnoDeljivih++;
				}
			}
		} while (unetiBroj != -1);

		System.out.printf("Od unetih %d brojeva, njih %d je deljivo sa 7.", ukupnoUnetih, ukupnoDeljivih);
	}

}
