package NizoviMatrice;

public class Sortiranje {

	public static void main(String[] args) {
		int[] niz = new int[] { 2, 4, 3, 7, 1};
		// { 2, 4, 3, 7, 1}
		// i=1, j=2
		// { 1, 4, 3, 7, 2}
		// i=2, j=3
		// { 1, 3, 4, 7, 2}
		// { 1, 2, 4, 7, 3}
		// i=3, j=4
		// { 1, 2, 3, 7, 4}
		// i=4, j=5
		// { 1, 2, 3, 4, 7}
		int tmp;
		int i, j;
		

		System.out.println(" Elemenati niza pre sortiranja su:");
		System.out.print(" [ ");
		for (i = 0; i < niz.length; i++)
			System.out.print(niz[i] +" ");
		System.out.println(" ] ");
		
		for (i = 0; i < niz.length - 1; i++) // spoljna petlja koja uzima elemenat koji se poredi, ide od prvog do pretposlednjeg
			for (j = i + 1; j < niz.length; j++) // unutrašnja petlja koja uzima elemente sa kojima se poredi, ide od prvog sledećeg do poslednjeg
				if (niz[j] < niz[i]) {
					tmp = niz[i];
					niz[i] = niz[j];
					niz[j] = tmp; 
				}		
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println(" Elemenati niza posle sortiranja su:");
		System.out.print(" [ ");
		for (i = 0; i < niz.length; i++)
			System.out.print(niz[i] +" ");
		System.out.println("] ");
	}

}
