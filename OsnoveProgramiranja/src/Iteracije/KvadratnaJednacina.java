package Iteracije;

public class KvadratnaJednacina {

	public static void main(String[] args) {

		/*
		 * Implementirati program za racunanje resenje (korena) kvadratne jednacine.
		 * Obezbediti sve obavezne provere ulaznih vrednosti. Izracunati sva moguca
		 * resenja u zavisnosti od ulaznih vrednosti koeficijenata a, b i c. Nakon sto
		 * se izracuna i prikaze resenje kvadratne jednacine, korisnika treba pitati da
		 * li zeli da unese novu kvadratnu jednacinu.
		 */

		System.out.println("Formula za kvadratnu jednacinu je:");
		System.out.println("ax^2+bx+c=0");

		boolean kraj = false;

		double a, b, c;
		double d;
		double x1, x2;
		double y1, y2;

		do {
			do {
				System.out.println("Upisati vrednost a: ");
				a = TextIO.getlnDouble();
			} while (a == 0);

			System.out.println("Upisati vrednost b:");
			b = TextIO.getlnDouble();
			System.out.println("Upisari vrednost c:");
			c = TextIO.getlnDouble();
			System.out.println();
			d = (b * b) - (4 * a * c);

			if (d > 0) {
				x1 = (-b + Math.sqrt(d)) / (2 * a);
				x2 = (-b - Math.sqrt(d)) / (2 * a);
				System.out.printf("Diskriminanta je veca od 0. Jednacina ima 2 kompleksna korena");
			}
			else if (d == 0) {
				x1 = -(b / (2 * a));
				System.out.printf("Diskriminanta je jednaka 0");

			}
			else {
				x1 = -b / (2 * a);
				d = Math.abs(d);
				y1 = (Math.sqrt(d)) / (2 * a);
				y2 = (-(Math.sqrt(d)) / (2 * a));

				System.out.printf("Diskriminanta je manja od 0");

			}
			System.out.println("Zelite li da se zavrsi program?");
			kraj = TextIO.getlnBoolean();

		}while (!kraj);
	}

}
