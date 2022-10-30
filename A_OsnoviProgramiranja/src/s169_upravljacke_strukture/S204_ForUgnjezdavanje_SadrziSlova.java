package s169_upravljacke_strukture;

import alati.TextIO;

public class S204_ForUgnjezdavanje_SadrziSlova {

	/*
	 * Primer programa koji preuzima jednu liniju teksta od korisnika i 
	 * ispisuje koja se sve slova nalaze u tom tekstu i koliko ima ukupno razlièitih slova.
	 */
	
	public static void main(String[] args) {

		String tekst;
		int ukupnoSlova = 0;
		
		System.out.println("Upišite tekst");
		tekst = TextIO.getlnString();
		tekst = tekst.toUpperCase();
		
		System.out.print("Upisani tekst sadrži sledeæa slova: ");
		
		for (char a = 'A'; a <= 'Z'; a++) {
			for (int i = 0; i < tekst.length(); i++) {
				if (a == tekst.charAt(i)) {
					System.out.print(a);
					System.out.print(' ');
					ukupnoSlova++;
					break;
				}
			}
		}

		System.out.println();
		System.out.println("Vaš tekst sadrži ukupno " + ukupnoSlova + " razlièitih slova.");
	}
}
