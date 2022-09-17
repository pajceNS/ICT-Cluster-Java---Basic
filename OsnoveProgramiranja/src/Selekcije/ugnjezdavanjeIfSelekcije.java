package Selekcije;

public class ugnjezdavanjeIfSelekcije {

	public static void main(String[] args) {

		int x;
		System.out.println("Unesite vrednost za x: ");
		x = TextIO.getlnInt();

		if (x > 3) {
			System.out.print("gore");
		} else if (x < 0) {
			System.out.print("dole");
		}else {
			System.out.println("nije u opsegu");
		}

	}

}
