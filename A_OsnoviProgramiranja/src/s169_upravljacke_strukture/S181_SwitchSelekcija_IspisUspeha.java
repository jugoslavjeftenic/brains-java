package s169_upravljacke_strukture;

import alati.TextIO;

public class S181_SwitchSelekcija_IspisUspeha {

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
		case 2:
			System.out.println("Dovoljan!");
		case 3:
			System.out.println("Dobar!");
		case 4:
			System.out.println("Vrlo dobar!");
		case 5:
			System.out.println("Odlican!");
		}
	}
}
