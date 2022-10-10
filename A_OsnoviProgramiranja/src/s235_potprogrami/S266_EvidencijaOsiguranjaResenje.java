package s235_potprogrami;

import alati.TextIO;

public class S266_EvidencijaOsiguranjaResenje {
	static final int KATEGORIJE = 5;
	static final int DANI = 5;

	public static void main(String[] args) {
		double[][] EvidOsig = new double[DANI][KATEGORIJE];
		char izbor = '0';
		
		do {
			
			prikazMenija();
			
			izbor = preuzmiChar('0', '7', "", "Morate odabrati vrednost u opsegu 0-7");
			
			switch(izbor) {
			case '1': 
				unesiPrihod(EvidOsig);
				break;
			case '2': 
				// izmena
				break;
			case '3': 
				prikazKategorZaDan(EvidOsig);
				break;
			case '4': 
				prikazDanaZaKategor(EvidOsig);
				break;
			case '5': 
				danSaNajmanjimPrihodom(EvidOsig);
				break;
			case '6': 
				prihodiKategor(EvidOsig);
				break;
			case '7': 
				// prosecan mesecni prihod
			}
			
			
		}while(izbor != '0');

	}
	static void prikazMenija() {
		System.out.println("Dobrodošli u program za vođenje evidencije rada agenta osiguranja!");
		System.out.println("Molimo Vas izaberite jednu od ponuđenih opcija:");
		System.out.println("\t 1: Unos ostvarenog prihoda za željenu kategorije i željeni dan.");
		System.out.println("\t 2: Izmena ostvarenog prihoda za željenu kategorije i željeni dan.");
		System.out.println("\t 3: ............");
		System.out.println("\t 4: ............");
		System.out.println("\t 5: ............");
		System.out.println("\t 6: ............");		
		System.out.println("\t 7: ............");
		System.out.println("\t 0: Izlazak iz programa.");
	}

	static char preuzmiChar(char donja, char gornja, String poruka, String porukaGreska) {
		char vrednost = '0';
		
		do {
			System.out.println(poruka);
			vrednost = TextIO.getlnChar();
			if ((vrednost < donja) || (vrednost > gornja))
				System.out.println(porukaGreska);			
		} while((vrednost < donja) || (vrednost > gornja));
		
		return vrednost;
	}
	static int preuzmiInt(int donja, int gornja, String poruka, String porukaGreska) {
		int vrednost = 0;
		
		do {
			System.out.println(poruka);
			vrednost = TextIO.getlnInt();
			if ((vrednost < donja) || (vrednost > gornja))
				System.out.println(porukaGreska);			
		} while((vrednost < donja) || (vrednost > gornja));
		
		return vrednost;
	}
	
	static void unesiPrihod(double[][] eo) {
		int dan, kat;
		char odg;
		
		do {
			
			dan = preuzmiInt(1, DANI, 
					"Unesite dan za koji unosite prihod:\t", 
					"Dan mora biti u opsegu 1-"+DANI);
			
			kat = preuzmiInt(1, KATEGORIJE, 
					"Unesite kategoriju za koju unosite prihod:\t", 
					"Kategorija mora biti u opsegu 1-"+KATEGORIJE);
			
			eo[dan-1][kat-1] = TextIO.getlnDouble();
			
			prikaziMatricu(eo, "DANI", "KATEGORIJE");
			
			System.out.println("Za unos još jednog prihoda pritisnite tester d");
			odg = TextIO.getlnChar();
		}while(odg == 'd' || odg == 'D');
		
	}
	
	static void izmenaPrihoda(double[][] eo) {
		int dan, kat;
		char odg;
		
		do {
			
			dan = preuzmiInt(1, DANI, 
					"Unesite dan za koji unosite prihod:\t", 
					"Dan mora biti u opsegu 1-"+DANI);
			
			kat = preuzmiInt(1, KATEGORIJE, 
					"Unesite kategoriju za koju unosite prihod:\t", 
					"Kategorija mora biti u opsegu 1-"+KATEGORIJE);
			
			eo[dan-1][kat-1] += TextIO.getlnDouble();
			
			prikaziMatricu(eo, "DANI", "KATEGORIJE");
			
			System.out.println("Za unos još jednog prihoda pritisnite tester d");
			odg = TextIO.getlnChar();
		}while(odg == 'd' || odg == 'D');
		
	}
	
	static void prikazKategorZaDan(double[][] eo) {
		int dan;
		char odg;
		int brKol = eo[0].length;
		
		do {
			
			dan = preuzmiInt(1, DANI, 
					"Unesite dan za koji unosite prihod:\t", 
					"Dan mora biti u opsegu 1-"+DANI);
			
			System.out.println("Prodaja kategorija za " + dan + ". dan izgleda:");
			for(int i = 0; i < brKol; i++)
				System.out.println("Kategorija " + (i+1) + ": " + eo[dan-1][i]);
			
			System.out.println("Za pregled novog dana pritisnite tester d");
			odg = TextIO.getlnChar();
		}while(odg == 'd' || odg == 'D');
	}
	
	static void prikazDanaZaKategor(double[][] eo) {
		int kat;
		char odg;
		int brVr = eo.length;
		
		do {
			
			kat = preuzmiInt(1, KATEGORIJE, 
					"Unesite kategoriju za koju unosite prihod:\t", 
					"Kategorija mora biti u opsegu 1-"+KATEGORIJE);
			
			System.out.println("Prodaja po danima za " + kat + ". kategoriju izgleda:");
			for(int i = 0; i < brVr; i++)
				System.out.println((i+1) + ". dan: " + eo[i][kat-1]);
			
			System.out.println("Za pregled nove kategorije pritisnite tester d");
			odg = TextIO.getlnChar();
		}while(odg == 'd' || odg == 'D');
		
	}
	static void danSaNajmanjimPrihodom(double[][] eo) {
		// Koliko je svakog dana ostvareno ukupno prihoda (suma po vrsti)
		// zatim pozicija minimuma u rezultujuĆoj vrsti
		int brKol = eo[0].length;
		int brVr = eo.length;
		double[] prihodDani = new double [brVr];
		int i, j;
		int pozMin; 
		
		for (i = 0; i < brVr; i++)
			for (j = 0; j < brKol; j++) 
				prihodDani[i] += eo[i][j];
		
		pozMin = 0;
		for (i = 1; i < brVr; i++)
			if (prihodDani[pozMin] > prihodDani[i])
				pozMin = i;
		
		System.out.println((pozMin+1) + ". dana je ostvaren najmanji prihod u iznosu od: " + prihodDani[pozMin]);
		
	}
	static void prihodiKategor(double[][] eo) {
		int brKol = eo[0].length;
		int brVr = eo.length;
		double[] prihodKategorije = new double [brKol];
		int i, j;
		
		for (j = 0; j < brKol; j++) 
			for (i = 0; i < brVr; i++)
				prihodKategorije[j] += eo[i][j];
		
		for (j = 0; j < brKol; j++) 
			System.out.println((j+1) + ". kategorija je ostvarila sledeći prihod: " + prihodKategorije[j]);
	}
	static void mesecniPrihod(double[][] eo) {
		int brKol = eo[0].length;
		int brVr = eo.length;
		int i, j;
		double suma = 0;
		for (i = 0; i < brVr; i++)
			for (j = 0; j < brKol; j++)
				suma += eo[i][j];
		
		System.out.println("Ukupan mesečni prihod iznosi: " + suma);
	}
	static void prikaziMatricu(double[][] eo, String imeVr, String imeKol) {
		int i = 0, j = 0;
		int brVr = eo.length;
		int brKol = eo[0].length;
		int brKaraktVrsta = imeVr.length();
		
		ispisiPraznaMesta(brKaraktVrsta);
		System.out.println(" " + imeKol);
		
		System.out.println(imeVr);
		
		for (i = 0; i < brVr;  i++) {
			ispisiPraznaMesta(brKaraktVrsta);
			for (j = 0; j < brKol; j++)
				System.out.printf(" %8.2f", eo[i][j]);
			System.out.println();
		}
		
	}
	
	static void ispisiPraznaMesta(int vel) {
		for (int k = 0; k <= vel; k++)
			System.out.print(" ");
	}
}
