package s209_staticke_strukture_podataka;

import alati.TextIO;

public class S220_Z2_SumaElemenataNizaSaPozicijom {

	/*
	 * Implementirati program za računanje sume vrednosti
	 * elemenata niza prirodnih brojeva koji sadrži maksimum 50
	 * elemenata. Program prihvata od korisnika broj elemenata
	 * (0 < N ≤ 50) i vrednost svakog pojedinačnog elementa.
	 */
	
	/*
	 * Proširiti prethodni zadatak tako da računa poziciju
	 * maksimalne vrednosti niza. Korisniku se prikazuje na
	 * kojoj poziciji u nizu se nalazi maksimalna vrednost, kao i 
	 * sama vrednost.
	 * 
	 * Šta ako ima više istih vrednosti koje su maksimalne?
	 */
	
	public static void main(String[] args) {
		
		int[] niz;
		int n, suma = 0, maks = 0;
		String maksIndeksi = "";
		
		do {
			System.out.println("Unesite broj elemenata:");
			n = TextIO.getlnInt();
			
			if (!(n < 51 && n > 0)) {
				System.out.println("Broj elemenata mora biti izmedju 1 i 50");
			}
		} while (!(n < 51 && n > 0));
		
		niz = new int [n];
		
		for (int i = 0; i < niz.length; i++) {
			do {
				System.out.println("Upisite vrednost elementa " + (i + 1) + ": ");
				niz[i] = TextIO.getlnInt();
				
				if (!(niz[i] > 0)) {
					System.out.println("Vrednost mora da bude veća od 0!");
				}
			} while (!(niz[i] > 0));
			suma += niz[i];
		}

		System.out.println("Suma svih elemenata niza je: " + suma);

		for (int i = 0; i < niz.length; i++) {
			if (maks < niz[i]) {
				maks = niz[i];
			}
		}
		
		System.out.println("Najveca vrednost u nizu je: " + maks);

		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == maks && maksIndeksi == "") {
				maksIndeksi += (i + 1);
			}
			else if (niz[i] == maks) {
				maksIndeksi += ", " + (i + 1);
			}
		}

		System.out.println("Pozicije najvecih vrednosti su: " + maksIndeksi);
		System.out.println("-----");
		System.out.println("KRAJ.");
	}
}
