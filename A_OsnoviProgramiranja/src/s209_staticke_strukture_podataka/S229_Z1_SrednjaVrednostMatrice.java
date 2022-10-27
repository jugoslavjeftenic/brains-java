package s209_staticke_strukture_podataka;

import alati.TextIO;

public class S229_Z1_SrednjaVrednostMatrice {

	public static void main(String[] args) {
		
		/*
		 * Implementirati program za raèunanje srednje vrednosti elemenata matrice
		 * prirodnih brojeva koji sadrži maksimum 10 vrsta i 20 kolona.
		 * Program prihvata od korisnika broj vrsta i kolona i vrednost svakog 
		 * pojedinaènog elementa. 
		 */
		
		int[][] matrica;
		int v, k, suma = 0;
		boolean generisi = false;
		
		do {
			
			System.out.println("Unesite broj vrsta (1 - 10):");
			v = TextIO.getlnInt();
			
			if (!(v < 11 && v > 0)) {
				System.out.println("Broj vrsta mora biti izmedju 1 i 10");
			}

		} while (!(v < 11 && v > 0));

		do {
			
			System.out.println("Unesite broj kolona (1 - 20):");
			k = TextIO.getlnInt();
			
			if (!(k < 21 && k > 0)) {
				System.out.println("Broj kolona mora biti izmedju 1 i 20");
			}
			
		} while (!(k < 21 && k > 0));
		
		matrica = new int[v][k];
		
		System.out.println("Da li želite da program generiše vrednosti elemenata (y/n)?");
		System.out.println("(generisani brojevi æe biti u rasponu od 1 - 100)");
		generisi = TextIO.getlnBoolean();

		for (int i = 0; i < matrica.length; i++) {
			
			for (int j = 0; j < matrica[i].length; j++) {
				
				System.out.println
					("Upisite vrednost elemenata vrste " + (i + 1) + " i kolone " + (j + 1) + ": ");
				if (generisi) {
					matrica[i][j] = ai(1, 100);
					System.out.println("Generisana vrednost je: " + matrica[i][j]);
				}
				else {
					matrica[i][j] = TextIO.getlnInt();
				}
				
			}
			
		}
		
		for (int i = 0; i < matrica.length; i++) {
			
			for (int j = 0; j < matrica[i].length; j++) {
				
				suma += matrica[i][j];
				
			}
			
		}
		
		System.out.println("----------------------------------------");
		System.out.println(" Ukupna vrednost svih elemenata matrice: " + suma);
		System.out.printf
			("           Matrica ima ukupno elemenata: %d\n",
			matrica.length * matrica[0].length);
		System.out.printf
			("Srednja vrednost svih elemenata matrice: %.2f\n",
			(1.0 * suma / (matrica.length * matrica[0].length)));
		System.out.println("----------------------------------------");
		System.out.println("KRAJ");
		
	}
	
	static int ai(int a, int b) {
		return (int) ((Math.random() * (b - a)) + a);
	}

}
