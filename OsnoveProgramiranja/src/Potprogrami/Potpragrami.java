package Potprogrami;

public class Potpragrami {

	public static void main(String[] args) {
		/*
		 * Implementirati program koji računa sumu, razliku, proizvod i količnik dva
		 * broja. Brojeve zadaje korisnik preko tastature. Implementirati unos,
		 * sabiranje, oduzimanje, množenje, deljenje i prikaz rezultata kao zasebne
		 * potprograme.
		 */
		double a = 0, b = 0;
		double zbir = 0, razlika = 0, proizvod = 0, kolicnik = 0;
		System.out.println("Unesite prvi broj: ");
		a = TextIO.getlnDouble();
		System.out.println("Unesite drugi broj: ");
		b = TextIO.getlnDouble();
		zbir = sabiranje(a, b);
		razlika = oduzimanje(a, b);
		proizvod = mnozenje(a, b);
		kolicnik = deljenje(a, b);
		ispis(a, b, zbir, razlika, proizvod, kolicnik);

	}

	static double sabiranje(double x, double y) {
		return x + y;
	}

	static double oduzimanje(double x, double y) {
		return x - y;
	}

	static double mnozenje(double x, double y) {
		return x * y;
	}

	static double deljenje(double x, double y) {
		return x / y;
	}

	static void ispis(double x, double y, double zbir, double razlika, double proizvod, double kolicnik) {
		System.out.printf("Zbir je: " + "%3.2f + %3.2f = %3.2f\n", x, y, zbir);
		System.out.printf("Razlika je: " + "%3.2f - %3.2f = %3.2f\n", x, y, razlika);
		System.out.printf("Proizvod je: " + "%3.2f * %3.2f = %3.2f\n", x, y, proizvod);
		System.out.printf("Kolicnik je: " + "%3.2f / %3.2f = %3.2f\n\n", x, y, kolicnik);
	}

}
