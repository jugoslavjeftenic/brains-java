package s169_upravljacke_strukture;

import alati.TextIO;

public class S207_Z4_ProsecnaOcena {

	public static void main(String[] args) {
		
		/*
		 * Napisati program koji odreðuje proseènu ocena studenta u toku jedne godine. 
		 * Korisnik unosi ocene studenta (5..10) sve dok ne unese vrednost 0. 
		 */

		
		// Deklarišemo globalne promenljive
		int predmet = 1, ocena, ocenaUkupno = 0;
		double ocenaProsek = 0;
		
		
		// Ceo program radi u beskonaènoj petlji a unutra ispitujemo da li æe biti kraj programa.
		do {
			
			
			// Od korisnika tražimo da upiše ocenu za aktuelni predmet.
			// U prvoj iteraciji se odnosi na predmet 1 koji smo inicijalizovali na poèetku.
			System.out.println
				("Upišite ocenu za predmet broj " + predmet + " (ocena 5 - 10, izlaz 0): ");
			ocena = TextIO.getlnInt();
			
			
			// Ispitujemo uslov za prekid rada programa.
			if (ocena == 0) {
				System.out.println("Izabrali ste KRAJ programa. Doviðenjce.");
				System.exit(0);
			}
			
			
			// Ispitujemo da li je ocena izmeðu 5 i 10.
			else if (ocena > 4 && ocena < 11) {
				ocenaUkupno += ocena;
				predmet++;
			}
			
			
			// Ako nije ništa od prethodnih uslova onda je korisnik zeznuo ocenu.
			else {
				System.out.println("\tGreška! Ocena mora da bude 5 - 10.");
				System.out.println("------------------------------------");  
			}
			
			
			// Raèunamo proseènu ocenu.
			ocenaProsek = (double) ocenaUkupno / (predmet - 1);
			
			
			// Ukoliko je korisnik upisao pogrešnu ocenu kod prve iteracije, ukupna ocena
			// æe biti 0 i prilikom deljenja æemo dobiti vrednost NaN što treba da ispravimo na 0.
			// (https://www.baeldung.com/java-not-a-number)
			if (ocenaProsek != ocenaProsek) {
				ocenaProsek = 0;
			}
			
			
			// Ispisujemo rezultat.
			System.out.println("      Ukupan broj predmeta: " + (predmet - 1));
			System.out.printf("Proseèna ocena po predmetu: %.2f\n\n", ocenaProsek);
			
			
		} while (true);

	}

}
