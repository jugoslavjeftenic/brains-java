package s209_staticke_strukture_podataka;

import alati.TextIO;

public class S232_Z3_BrojPojavljivanja {

	public static void main(String[] args) {
		
		/*
		 * Dat je niz A od maksimalno 20 celobrojnih elemenata. Uèitati n elemenata,
		 * zatim uèitati ceo broj br. Na izlazu ispisati ceo niz i broj pojavljivanja
		 * broja br u nizu.
		 */
		
		int a[] = new int[20];
		for(int i = 0; i < a.length; i++)
			a[i] = (int) ((Math.random() * (10 - 1)) + 1);
		
		System.out.println("Upisite trazeni broj:");
		int broj = TextIO.getlnInt();
		int brojac = 0;
		
		System.out.println("Sadrzaj niza je:");
		for (int i =0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			if (broj == a[i])
				brojac++;
		}
		System.out.println();
		System.out.printf("Trazeni broj se u nizu pojavio %d puta.", brojac);
	}
}
