package s169_upravljacke_strukture;

import alati.TextIO;

public class S207_Z2_DeljivoSa7 {

	public static void main(String[] args) {
		
		/*
		 * Napisati program koji odreðuje ukupan broj brojeva deljivih sa 7. 
		 * Korisnik unosi brojeve sve dok ne unese vrednost -1. 
		 * Uneti broj mora biti u intervalu od 6..142.  
		 */
		
		// Na poèetku deklarišemo promenljivu koja æe nam trebati kroz ceo program.
		int broj;
		
		
		// Zadatak kaže da program treba da radi sve dok se ne upiše vrednost -1
		// pa u ovoj petlji vrtimo sve dok je petlja "true", odnosno beskonaèno.
		// Unutar petlje æemo ispitati da li je vrednost -1 i izaæi iz programa.
		do {
			
			
			// Unutar glavne petlje pravimo novu petlju koja æe korisnika vrteti u unosu
			// sve dok ne upiše uslov za završetak programa, "-1"
			do {
				
				
				// Korisnik upisuje vrednost.
				System.out.println("Unestite ceo broj u intervalu 6 - 142 (izlaz: -1)");
				broj = TextIO.getlnInt();
				
				
				// Ispitujemo da li je upisao "-1" i ako jeste prekidamo program televizije
				// sa odgovarajuæom porukom.
				if (broj == -1) {
					System.out.println("Upisali ste vrednost za KRAJ programa.");
					System.exit(0);
				}
				
				
				// Ispitujemo da li je korisnikov broj manji od 6 ILI veæi od 142
				// i na fin naèin mu kažemo da nije bistar.
				//
				// Ovo radimo nakon ispitivanja da li je korisnik upisao -1 iz razloga
				// ako bi smo prvo ispitivali da li je broj manji od 6 onda ne bismo nikada
				// došli do ispitivanja da li je broj jednak -1 što nam je uslov za kraj.
				else if (broj < 6 || broj > 142) {
					System.out.println("Broj je van intervala. Pokušajte ponovo.\n");
				}
				
			} while (broj < 6 || broj > 142);
			// U while-u ponavljamo ispitivanje opsega i korisnika držimo u petlji sve dok
			// ne ubode broj koji smo mu lepo napisali.
			// Kod pisanja programa se èesto polazi od pretpostavke da korisnik nije
			// najintiligentnija osoba na svetu.
			
			
			// Ispitujemo da li upisani broj ima ostatak pri delenju sa 7
			// (https://www.baeldung.com/modulo-java)
			if (broj % 7 == 0) {
				System.out.printf("Broj %d je deljiv sa 7 i sa 7 je podeljen ukupno %d puta.\n\n",
					broj, broj / 7);
			}
			
			
			// a ako ima ostatak, deklarišemo privremenu promenljivu "ostatak" za ispis
			// koja æe živeti kratko (poput leptira) i postojati samo dok smo u else delu.
			// (https://toplickevesti.com/leptiri-imaju-kratak-zivot-ali-i-krila.html)
			// Zašto ubacujem linkove koji nemaju veze sa programom?
			// Zato što treba non-stop guglati ono što se nezna.
			// (https://kakosepise.com/rec/neznam-ili-ne-znam/)
			else {
				int ostatak = broj % 7;
				System.out.printf("Broj %d ima ostatak pri delenju sa 7. "
					+ "Broj %d je sa 7 podeljen %d puta, a ostatak deljenja je: %d\n\n",
					broj, broj, broj / 7, ostatak);
			}
			
		} while (true);
		// while ispituje da li je nešto taèno i u ovom sluèaju smo mu rekli:
		// "Jeste, taèno je", bez da mu kažemo ŠTA treba da je taèno.
		// Pošto je while tupav i bitno mu je samo da dobije boolean vrednost
		// on æe ovo raditi beskonaèno.
		//
		// Ukoliko želimo konaènu vrednost pa mu napišemo "while (A > B)" onda se prvo
		// ispituje da li A jeste veæe od B, i to taèno ili netaèno se prenosi u while
		// koji zatim ponavlja petlju u sluèaju taènog ili izlazi iz petlje i nastavlja
		// program u sluèaju netaènog.
		
	}

}
