package s169_upravljacke_strukture;

import alati.TextIO;

public class S178_IspisUspeha_If {

	public static void main(String[] args) {
		
		int ocena;
		
		System.out.println("Program za ispis uspeha na osnovu unete ocene!");
		System.out.print("Unesite ocenu: ");
		ocena = TextIO.getlnInt();
		System.out.println();
		
		if (ocena == 1) {
			System.out.println("Nedovoljan!");
		}
		else if (ocena == 2) {
			System.out.println("Dovoljan!");
		}
		else if (ocena == 3) {
			System.out.println("Dobar!");
		}
		else if (ocena == 4) {
			System.out.println("Vrlo dobar!");
		}
		else if (ocena == 5) {
			System.out.println("Odlican!");
		}
		else {
			System.out.println("Unpisani broj nije od 1 do 5!");
		}

	}

}
