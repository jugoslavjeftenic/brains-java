package s169_upravljacke_strukture;

import alati.TextIO;

public class S182_SwitchSelekcija_IspisUspeha_Break {

	public static void main(String[] args) {

		/* Definicija promenljive */
		int ocena;

		/* Unos podatka */
		System.out.println("Program za ispis uspeha na osnovu unete ocene!");
		System.out.print("Unesite ocenu: ");
		ocena = TextIO.getlnInt();

		/* Odredjivanje uspeha i ispis */
		switch (ocena) {
		case 1:
			System.out.println("Nedovoljan!");
			break;
		case 2:
			System.out.println("Dovoljan!");
			break;
		case 3:
			System.out.println("Dobar!");
			break;
		case 4:
			System.out.println("Vrlo dobar!");
			break;
		case 5:
			System.out.println("Odlican!");
		}
	}
}
