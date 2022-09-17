package Iteracije;

public class Domaci {

	public static void main(String[] args) {

		// Implementirati program za računanje kvadratne jednačine.
		// Obezbediti sve obavezne provere ulaznih vrednosti.
		// Izračunati sva moguća rešenja u zavisnosti od mogućih ulaznih vrednosti
		// promenljivih a, b i c.
		// Nakon što se izračuna rešenje kvadratne jednačine, korisnika treba pitati da
		// li želi da unese novu kvadratnu jednačinu.

		boolean kraj = false;
		double a, b, c, d, x1, x2;
		double y1, y2;
		do {
			do {
				System.out.println("Upisite A: ");
				a = TextIO.getlnDouble();
			} while (a == 0);
			System.out.println("Upisite B: ");
			b = TextIO.getlnDouble();
			System.out.println("Upisite C: ");
			c = TextIO.getlnDouble();
			System.out.println();

			d = (b * b) - (4 * a * c); // diskriminanta

			if (d > 0) {
				x1 = (-b + Math.sqrt(d)) / (2 * a);
				x2 = (-b - Math.sqrt(d)) / (2 * a);
				System.out.printf("Diskriminanta je veca od 0. Rezultat x1 = %.2f, x2 = %2f %n", x1, x2);
			} else if (d == 0) {
				x1 = -(b / (2 * a));
				System.out.printf("Diskriminanta je jednaka 0. Rezultat x1 = %.2f %n", x1);
			} else {
				x1 = -b / (2 * a);
				Math.abs(d);
				y1 = (Math.sqrt(d)) / (2 * a);
				y2 = (-(Math.sqrt(d)) / (2 * a));
				System.out.printf("Diskriminanta je manja od 0. Rezultat x1 = %.2f, y2 = %2f %n", x1, y1, y2);
			}
			System.out.println("Da li zelite da se zavrsi program?");
			kraj = TextIO.getlnBoolean();
		} while (!(kraj));
	}

}
