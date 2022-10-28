package s169_upravljacke_strukture;

import alati.TextIO;

public class S194_DoWhile_IspisUspeha {

	public static void main(String[] args) {
		
		int ocena;
		
		System.out.println("Program za ispis uspeha na osnovu unete ocene!");
		System.out.print("Unesite ocenu: ");

		do {
			ocena = TextIO.getlnInt();
			System.out.println();
			if (ocena < 1 || ocena > 5) {
				System.out.println("Molim Vas da upišete ocenu od 1 - 5.");
				System.out.println();
			}
		} while (ocena < 1 || ocena > 5);
		
		switch (ocena) {
			case 1: System.out.println("Nedovoljan!"); break;
			case 2: System.out.println("Dovoljan!"); break;
			case 3: System.out.println("Dobar!"); break;
			case 4: System.out.println("Vrlo dobar!"); break;
			case 5: System.out.println("Odlican!");
		}
	}
}
