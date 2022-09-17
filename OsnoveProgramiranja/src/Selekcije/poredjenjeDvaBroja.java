package Selekcije;

public class poredjenjeDvaBroja {

	public static void main(String[] args) {
		
		int x, y;
		System.out.println("Unesite vrednost x: ");
		x = TextIO.getlnInt();
		System.out.println("Unesite vrednost y: ");
		y = TextIO.getlnInt();
		
		if (x>y) {
			System.out.println("x je vece od y");
		} else if (x<y) {
			System.out.println("x je manje od y");
		} else {
			System.out.println("x je jednako sa y");
		}
		
	}

}
