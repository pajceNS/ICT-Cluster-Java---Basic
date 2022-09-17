package Algoritmi;
public class Ciklicno_pomeranje_ulevo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0;
		int b = 2;
		int c = 4;
		System.out.println("Promenljive: " + a + b + c);
		int r;
		r = a;
		System.out.println("Vrednost r je: " + r);
		a = b;
		b = c;
		c = r;
		System.out.print("Pomereno ulevo: " + a + b + c);
	}

}
