package s169_upravljacke_strukture;

import alati.TextIO;

public class S175_IfSelekcija_DoleGore {

	public static void main(String[] args) {
		
		int x;
		System.out.print("Unesite x:");
		x = TextIO.getlnInt();
		System.out.println();

		if (x > 3) {
			System.out.println("gore");
		}
		else {
			if (x < 0) {
				System.out.println("dole");
			}
			else {
				System.out.println("Rezultat je izmedju 0 i 3");
			}
		}

		if (x >= 0) {
			if (x <= 3) {
				System.out.println("Rezultat je izmedju 0 i 3");
			}
			else {
				System.out.println("gore");
			}
		}
		else {
			System.out.println("dole");
		}
	}
}
