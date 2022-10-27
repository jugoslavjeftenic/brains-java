package s169_upravljacke_strukture;

import alati.TextIO;

public class S184_IspisUspeha_Switch {

	public static void main(String[] args) {
		
		int ocena;
		
		System.out.println("Program za ispis uspeha na osnovu unete ocene!");
		System.out.print("Unesite ocenu: ");
		ocena = TextIO.getlnInt();
		System.out.println();
		
		switch (ocena) {
			case 1: System.out.println("Nedovoljan!");
			break;
			case 2: System.out.println("Dovoljan!");
			break;
			case 3: System.out.println("Dobar!");
			break;
			case 4: System.out.println("Vrlo dobar!");
			break;
			case 5: System.out.println("Odlican!");
			break;
			default: System.out.println("Unesite ocenu od 1 do 5!");
		}

		switch (ocena) {
			case 1: {
				System.out.println("Nedovoljan!");
				break;
			}
			case 2: {
				System.out.println("Dovoljan!");
				break;
			}
			case 3: {
				System.out.println("Dobar!");
				break;
			}
			case 4: {
				System.out.println("Vrlo dobar!");
				break;
			}
			case 5: {
				System.out.println("Odlican!");
				break;
			}
			default: {
				System.out.println("Unesite ocenu od 1 do 5!");
			}
		}

	}

}
