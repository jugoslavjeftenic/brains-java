package s169_upravljacke_strukture;

import alati.TextIO;

public class S179_IfSelekcija_VeciBroj {

	public static void main(String[] args) {
		
		/*
		 * Implementirati program koji ispisuje koji je od dva broja 
		 * veæi (odrediti tipove podataka, potrebnu proveru, ...) 
		 */
		
		int a, b;
		
		System.out.print("Unesite broj A: ");
		a = TextIO.getlnInt();
		System.out.print("Unesite broj B: ");
		b = TextIO.getlnInt();
		System.out.println();
		
		if (a > b) {
			System.out.println("A > B");
		}
		else if (a < b) {
			System.out.println("A < B");
		}
		else {
			System.out.println("A = B");
		}
	}
}
