package Iteracije;

public class MainClass {

	public static void main(String[] args) {
		double a, b, c;
		int d;
		double x1, x2, imag1, imag2;
		byte kraj = 0;

		do {
			System.out.println("uneti kofecijent a: ");
			a = TextIO.getlnDouble();
			System.out.println("uneti kofecijent b: ");
			b = TextIO.getlnDouble();
			System.out.println("uneti kofecijent c: ");
			c = TextIO.getlnDouble();

			if (a == 0) {
				System.out.println("uneti ponovo koeficijent a: ");
				a = TextIO.getlnDouble();
			}

			d = (int) (b * b - 4 * a * c);

			if (d > 0) {
				x1 = (-b + Math.sqrt(b * b - 4.0 * a * c)) / (2 * a);
				System.out.println("resenje x1= ");
				System.out.println(x1);

				x2 = (-b - Math.sqrt(b * b - 4.0 * a * c)) / (2 * a);
				System.out.println("resenje x2= ");
				System.out.println(x2);
			}
			if (d < 0) {
				x1 = -b / (2 * a);
				imag1 = Math.sqrt(Math.abs(4 * a * c - b * b)) / (2 * a);
				System.out.println("resenje x1= ");
				System.out.println(x1 + "+" + imag1 + "*i");

				x2 = -b / (2 * a);
				imag2 = Math.sqrt(Math.abs(4 * a * c - b * b)) / (2 * a);
				System.out.println("resenje x2= ");
				System.out.println(x2 + "-" + imag2 + "*i");
			}

			else if (d == 0) {
				x1 = x2 = -b / (2 * a);
				System.out.println("jednacina ima jedno moguce resenje x= ");
				System.out.println(x1);
			}

			System.out.println("unesite bilo kroj broj ako zelite da racunate novu jednacinu: ");
			kraj = TextIO.getlnByte();
		} while (kraj > 0);

	}

}
