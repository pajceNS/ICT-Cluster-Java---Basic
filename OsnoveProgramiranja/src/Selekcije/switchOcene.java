package Selekcije;

public class switchOcene {

	public static void main(String[] args) {

		int ocena;

		System.out.println("Program za ispis uspeha na osnovu unete ocene!");
		System.out.print("Unesite ocenu: ");
		ocena = TextIO.getlnInt();

		switch (ocena) {
		case 1:
			System.out.println("Nezadovoljan");
			break;
		case 2:
			System.out.println("Dovoljan");
			break;
		case 3:
			System.out.println("Dobar");
			break;
		case 4:
			System.out.println("Vrlo dobar");
			break;
		case 5:
			System.out.println("Odlican");
		default:
			System.out.println("Ocena mora biti izmedju 1 i 5");
		}

	}

}
