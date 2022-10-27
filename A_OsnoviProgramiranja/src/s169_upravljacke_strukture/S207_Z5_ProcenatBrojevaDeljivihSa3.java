package s169_upravljacke_strukture;

import alati.TextIO;

public class S207_Z5_ProcenatBrojevaDeljivihSa3 {

	public static void main(String[] args) {
		
		/*
		 * Napisati program koji odreðuje procenat brojeva deljivih sa 3 
		 * od N brojeva. Korisnik unosi N, a zatim same brojeve (15-62). 
		 */

		/*
		 * NAPOMENA. Rešenje treæeg zadatak nisam dobro osmislio. Ipak može bez niza. 
		 */
		
		
		// Deklarišemo globalne promenljive.
		int n, broj, brojac = 0;
		boolean siguran = true;

		
		// Od korisnika tražimo da upiše dužinu sekvence.
		do {

			System.out.println("Upišite dužinu sekvence (preporuèena dužina do 10 brojeva): ");
			n = TextIO.getlnInt();
			
			// Ukoliko je korisnik upisao sekvencu dužu od 10 brojeva pitamo ga da li
			// je siguran da želi da se pati sa unosom. Ako nije siguran (false)
			// do while petlja ga vraæa na ponovni unos dužine sekvence.
			if (n > 10) {
				System.out.println
					("Da li ste sigurni da želite da upisujete više od 10 brojeva (y/n)?");
				siguran = TextIO.getlnBoolean();
			}
			
		} while (!siguran);


		// Pošto su korisnici uglavnom lenji, pitamo ga da li želi da program generiše
		// vrednosti umesto njega. Za odgovor recikliramo promenljivu "siguran".
		System.out.println("Da li želite da vrednosti generišem umesto Vas (y/n)?");
		siguran = TextIO.getlnBoolean();

		
		// Ako korisnik nije lenj ispisujemo mu poruku šta dalje da radi.
		if (!siguran) {
			System.out.println("Upišite vrednost u rasponu 15-62");
		}

		
		// Pošto je dužina sekvence poznata, koristimo for petlju za unos vrednosti.
		// Indeks "i" živi samo u for petlji pa ga deklarišemo unutar petlje.
		for (int i = 1; i <= n; i++) {
			
			
			// Ako se korisnik odluèio za generisanje brojeva koristimo Math.random() metodu.
			// (https://www.baeldung.com/java-generating-random-numbers-in-range)
			if (siguran) {
				broj = (int) ((Math.random() * (62 - 15)) + 15);
				System.out.println("sekvenca " + i + " od " + n + ": " + broj);
			}
			
			
			// U drugom sluèaju vrednosti unosi ruèno.
			else {
				
				
				// Nije poznato koliko puta æe korisnik zeznuti vrednost pa
				// koristimo do while petlju
				do {
					
					System.out.println("sekvenca " + i + " od " + n + ": ");
					broj = TextIO.getlnInt();
					
					if (broj < 15 || broj > 62) {
						System.out.println("\tGREŠKA! Upisali ste pogrešnu vrednost (15-62)");
					}
					
				} while (broj < 15 || broj > 62);
				
			}
				
			
			
			// Ispitujemo da li je deljivo sa 3 i uveæavamo brojaè za 1 ako jeste.
			if (broj % 3 == 0) {
				brojac++;
			}
			
		}

		
		// Ispis rezultata
		System.out.println
			("Od ukupno " + n + " upisanih brojeva, sa 3 je deljivo " + brojac + ".");
		
		
		// Zezamo (L)user-a ako nije ništa pogodio.
		if (brojac == 0) {
			System.out.println("Nažalost, NISTE pogodili ni jedan broj deljiv sa 3.");
		}
		
		System.out.println("KRAJ programa.");

	}

}
