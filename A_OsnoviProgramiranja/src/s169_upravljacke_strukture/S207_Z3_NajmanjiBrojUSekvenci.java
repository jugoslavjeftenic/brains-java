package s169_upravljacke_strukture;

import alati.TextIO;

public class S207_Z3_NajmanjiBrojUSekvenci {

	public static void main(String[] args) {
		
		/*
		 * Napisati program koji odreðuje koji je broj najmanji u sekvenci 
		 * od N brojeva. Korisnik unosi N, a zatim brojeve (-10..100). 
		 */
		
		/*
		 * NAPOMENA. Pošto je ovaj zadatak postavljen pre lekcije o nizovima
		 * ili nisam shvatio zadatak ili ne znam da gi rešim bez niza.
		 */
		

		// Od korisnika tražimo koliko brojeva ide u sekvencu.
		System.out.println("Upišite dužinu sekvence (preporuèena dužina do 10 brojeva): ");
		int n = TextIO.getlnInt();
		
		
		// Upisanu vrednost koristimo za dimenzionisanje niza.
		// Ako je korisnik upisao 10 onda je niz dužine 10 "new int[10]".
		int[] sekvenca = new int[n];
		
		
		// Deklarišemo promenljivu za èuvanje najmanjeg broja i inicijalizujemo je.
		// U ovom sluèaju nije bitno sa kojim brojem je inicijalizujemo, bitno je da
		// dodelimo bilo koju int vrednost, inaèe nam kompajler prijavljuje grešku:
		// "The local variable min may not have been initialized".
		int min = 0;

		
		// Pošto unapred znamo koliko puta æe se vrteti petlja,
		// najjednostavnije je uraditi sa for petljom (ali može i sa "while" i "do").
		// Pošto promenljivu "i" koristimo samo na nivou petlje a ne celog programa,
		// možemo je deklarisati u samoj for petlji i taj "i" se neæe moæi koristiti van petlje.
		System.out.println("Upišite željene vrednosti sekvence u rasponu od -10 do 100");
		for (int i = 0; i < sekvenca.length; i++) {

			
			// Unutar for pravimo "do" petlju gde tražimo unos i ispitujemo
			// da li je uneti broj u okviru predefinisanih vrednosti.
			do {
				
				
				// Prilikom ispisa na "i" dodajemo 1 pošto nam indeks polazi od nule.
				System.out.print((i + 1) + ": ");
				sekvenca[i] = TextIO.getlnInt();
				
				
				// Sjebemo korisnika za pogrešnu vrednost.
				if (sekvenca[i] < -10 || sekvenca[i] > 100)
					System.out.println("\tPažnja! Vrednost mora da bude -10 do 100.");
				
			} while (sekvenca[i] < -10 || sekvenca[i] > 100);
			
			
			// Pošto smo prilikom inicijalizacije "min" promenljive odvalili vrednost zbog
			// kompajlera, sada joj dodeljujemo korisnu vrednost, a to je prvi broj u
			// sekvenci (nizu).
			if (i == 0)
				min = sekvenca[i];
			
			
			// Potom ispitujemo da li je zapamæena minimalna vrednost veæa od vrednosti
			// na kojoj nam se nalazi sekvenca i ako jeste, dodeljujemo joj vrednost sekvence.
			else if (min > sekvenca[i])
				min = sekvenca[i];
			
		}
		
		
		// Po izlasku iz for petlje koja je protrèala kroz sekvencu i našla najmanji broj
		// pravimo novu for petlju koja ispisuje unetu sekvencu.
		System.out.print("Upisali ste sekvencu: ");
		for (int i = 0; i < sekvenca.length; i++) {
			System.out.print(sekvenca[i]);
			
			// Ispitujemo da li smo na kraju sekvence da vidimo da li da pišemo zarez iza broja.
			// Pitamo da li NIJE("i" jednako dužini sekvence od èije dužine oduzimamo 1).
			// 1 oduzimamo da bi vrednost dužine sekvence uskladili sa indeksom sekvence koji
			// poèinje od nule.
			if (!(i == sekvenca.length - 1)) {
				System.out.print(", ");
			}
		}
		
		
		// Ispisujemo minimalnu vrednost
		System.out.println("\nNajmanji broj u upisanoj sekvenci je: " + min);

	}

}
