package s169_upravljacke_strukture;

import alati.TextIO;

public class S196_While_FaktorijalUnetogBroja {

	public static void main(String[] args) {
		
		int broj = 1, i = 1, fakt = 1;
		
		System.out.println("Program za racunanje faktorijala unetog broja.");
		System.out.println("Unesite broj: ");
		
		do {
			broj = TextIO.getlnInt();
			if (broj < 0) {
				System.out.println("Broj mora biti veci ili jednak 0. Unesite ponovo broj: ");
			}
		} while (broj < 0);
		
		while (i <= broj){
			fakt *= i;
			System.out.print(fakt + " ");
			i++;
		}
		
		System.out.println();
		System.out.printf("Faktorijal broja %d je: %d.", broj, fakt);
	}
}
