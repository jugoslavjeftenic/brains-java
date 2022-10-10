package s209_staticke_strukture_podataka;

public class Sortiranje {

	public static void main(String[] args) {
		
		int[] niz = new int[] { 2, 3, 7, 1, 4 };
		
		int tmp;
		int i, j;
		
		System.out.println("Elementi niza pre sortiranja su:");
		System.out.println();
		
		System.out.print(" [ ");
		for (i = 0; i < niz.length; i++)
			System.out.print(niz[i] + " ");
		System.out.println("] ");
		
		for (i = 0; i < niz.length - 1; i++)
			for (j = i + 1; j < niz.length; j++)
				if (niz[j] < niz[i]) {
					tmp = niz[i];
					niz[i] = niz[j];
					niz[j] = tmp;
				}
		System.out.println();

		System.out.println("Elementi niza posle sortiranja su:");
		System.out.println();
		
		System.out.print(" [ ");
		for (i = 0; i < niz.length; i++)
			System.out.print(niz[i] + " ");
		System.out.println("] ");

	}

}
