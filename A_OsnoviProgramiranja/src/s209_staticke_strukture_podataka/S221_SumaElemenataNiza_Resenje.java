package s209_staticke_strukture_podataka;

import alati.TextIO;

public class S221_SumaElemenataNiza_Resenje {

	public static void main(String[] args) {

		/*
		 * Dodati proveru korektnosti unetih vrednosti.
		 * Da li se može koristiti manji broj for iteracija? 
		 */
		
		final int MAXELNIZA = 50;
		int N = 1, i, suma = 0;
		int NizPrirordnihBrojeva[] = new int[MAXELNIZA];
		
		System.out.println("Program za racunanje sume elemenata niza N prirodnih brojeva.");
		
		do {
			System.out.println("Unesite broj elemenata:");
			N = TextIO.getlnInt();
			if (!(N < 51 && N > 0)) {
				System.out.println("Broj elemenata mora biti izmedju 1 i 50");
			}
		} while (!(N < 51 && N > 0));

//		System.out.print("Unesite N:\t");
//		N = TextIO.getlnInt();
		
		for (i = 0; i < N; i++) {
			do {
				System.out.println("Unesite " + (i+1) + ". element niza:\t");
				NizPrirordnihBrojeva[i] = TextIO.getlnInt();
				
				if (!(NizPrirordnihBrojeva[i] > 0)) {
					System.out.println("Vrednost mora da bude veæa od 0!");
				}
			} while (!(NizPrirordnihBrojeva[i] > 0));
			suma += NizPrirordnihBrojeva[i];
		}
		
//		for (i = 0; i < N; i++)
//			suma += NizPrirordnihBrojeva[i];
		
		System.out.println("Suma elemenata niza izosi " + suma + ".");
	}
}
