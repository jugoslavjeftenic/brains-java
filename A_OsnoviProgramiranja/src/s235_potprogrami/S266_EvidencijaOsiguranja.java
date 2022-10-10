package s235_potprogrami;

import alati.TextIO;

public class S266_EvidencijaOsiguranja {
	
	public static void main(String[] args) {
		
		/*
		 * Evidencija prodaje osiguranja orgranizovana je u 5 kategorija i beleži se za
		 * svaki dan u mesecu (pretpostaviti da ih je 30).
		 * • Program treba da omoguæi:
		 * • Unos ostvarenog prihoda za zadatu kategoriju osiguranja i dan u mesecu.
		 * • Izmenu ostvarenog prihoda za zadatu kategoriju osiguranja i dan u mesecu.
		 * • Prikaz rezultata sortiran po kategorijama osiguranja za izabrani dan u mesecu.
		 * • Prikaz rezultata sortiran po danima u mesecu za izabranu kategoriju.
		 * • Izraèunavanje i prikaz dana kad je ostvaren najmanji prihod i koliko on iznosi.
		 * • Izraèunavanje i prikaz ukupnog meseènog prihod za svaku kategoriju osiguranja.
		 * • Izraèunavanje i prikaz proseènog meseènog prihoda.
		 * • Meni iz kojeg se biraju ponuðene funkcije.
		 * • Obavezno koristiti funkcije za implementaciju traženih funkcionalnosti.
		 * • Izabrati korektne tipove podataka i strukture podataka i
		 * ogranièiti unos tako da nije moguæe uneti neispravne vrednosti.
		 */
		
		/*
		 * REŠENJE
		 * - opcije menija se èuvaju u nizu
		 * - dodata opcija prikaza vrednosti svih elemenata u matrici
		 * - unos i izmena spojeni u jedan meni
		 * 
		 * - veæina ispisa se radi pomoæu printf metode
		 *   (https://www.baeldung.com/java-printstream-printf)
		 */
		
		// Dimenzioniše se matrica za èuvanje vrednosti.
		double[][] evidencija = new double[30][5];
		
		// Dimenzioniše se i inicijalizuje niz za èuvanje opcija menija.
		String[] meni = new String[8];
		meni[0] = "KRAJ programa.";
		meni[1] = "Unos ili izmena ostvarenog prihoda za željenu kategoriju i željeni dan.";
		meni[2] = "Prikaz prihoda za sve kategorije i dane.";
		meni[3] = "Prikaz prihoda za izabrani dan.";
		meni[4] = "Prikaz prihoda za izabranu kategoriju.";
		meni[5] = "Prikaz dana sa najmanjim ostvarenim prihodom.";
		meni[6] = "Prikaz ukupnog meseènog prihoda po kategorijama.";
		meni[7] = "Prikaz ukupnog i proseènog meseènog prihoda.";
		
		// Glavni meni se drži u beskonaènoj petlji dokle god korisnik ne izabere
		// opciju za završetak programa.
		do {
			
			// Ispituje se korisnikov izbor menija i poziva se odgovarajuæi potprogram.
			// Switch u izrazu poziva potprogram za izbor i proveru izbora menija.
			// Potprogramu za izbor menija se prosleðuje niz stringova sa opcijama menija i
			// minimalna i maksimalna vrednost menija.
			// (https://www.w3schools.com/java/java_switch.asp)
			switch (meniIzbor(meni, 0, meni.length - 1)) {
			case 0:
				// Poziva se potprogram za terminaciju programa.
				kraj();
			case 1:
				// Poziva se potprogram za unos/izmenu vrednosti elemenata.
				unos(evidencija);
				break;
			case 2:
				// Poziva se potprogram za prikaz vrednosti svih elemenata matrice.
				ispis(evidencija);
				break;
			case 3:
				// Poziva se potprogram za ispis svih kategorija za izabrani dan.
				ispisPrihodaPoDanu(evidencija);
				break;
			case 4:
				// Poziva se potprogram za ispis svih dana za izabranu kategoriju.
				ispisPrihodaPoKategoriji(evidencija);
				break;
			case 5:
				// Poziva se potprogram za ispis dana sa najmanjim ostvarenim prihodom.
				ispisNajmanjegPrihodaZaDan(evidencija);
				break;
			case 6:
				// Poziva se potprogram za prikaz ukupnog meseènog prihoda po kategorijama.
				ispisUkupnoPoKategorijama(evidencija);
				break;
			case 7:
				// Poziva se potprogram za prikaz ukupnog i proseènog meseènog prihoda.
				ispisUkupanIProsecanPrihod(evidencija);
				break;
			}
		} while (true);
	}
	
	// Potprogram za prikaz ukupnog i proseènog meseènog prihoda.
	static void ispisUkupanIProsecanPrihod(double[][] matrica) {

		double suma = 0;
		
		// Sabiramo vrednosti svih elemenata u matrici.
		for (int i = 0; i < matrica.length; i++)
			for (int j = 0; j < matrica[i].length; j++)
				suma += matrica[i][j];
		
		// Ispisujemo rezultat
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
		System.out.println();
		System.out.printf("  Ukupan meseèni prihod je: %.2f.\n", suma);
		System.out.printf("Proseèan meseèni prihod je: %.2f.\n", suma / 150);
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));

	}
	
	// Potprogram za prikaz ukupnog meseènog prihoda po kategorijama.
	static void ispisUkupnoPoKategorijama(double[][] matrica) {
		
		double[] sumaKategorija = new double[matrica[0].length];
		int sirinaKolone, sirinaKoloneMaks = 0;

		// Raèunamo sumu prihoda po kategorijama i rezultate upisujemo u privremeni niz.
		for (int i = 0; i < matrica[0].length; i++) {
			for (int j = 0; j < matrica.length; j++) {
				sumaKategorija[i] += matrica[j][i];
			}
			// Raèunamo maksimalnu širinu kolone.
			sirinaKolone = Integer.toString((int) sumaKategorija[i]).length();
			if (sirinaKoloneMaks < sirinaKolone)
				sirinaKoloneMaks = sirinaKolone;
		}
		sirinaKolone = sirinaKoloneMaks + 3;

		// Formiramo ispis zaglavlja tabele sa potrebnim širinama kolona.
		System.out.println();
		System.out.print
			(String.format("%" + ((sirinaKolone + 1) * 5) + "s\n", "-").replace(' ', '-'));
		System.out.println("Prikaz ukupnog meseènog prihoda po kategorijama.");
		System.out.println();
		System.out.println(" Kategorije...");

		for (int i = 0; i < sumaKategorija.length; i++) {
			System.out.printf("%" + sirinaKolone + "s|", i + 1);
		}
		System.out.println();
		
		for (int i = 0; i < sumaKategorija.length; i++)
			System.out.printf("%" + sirinaKolone + ".2f|", sumaKategorija[i]);
		System.out.println();
		
		// Formiramo ispis futera.
		System.out.print
			(String.format("%" + ((sirinaKolone + 1) * 5) + "s\n", "-").replace(' ', '-'));
	}
	
	// Potprogram za ispis dana sa najmanjim prihodom.
	static void ispisNajmanjegPrihodaZaDan(double[][] matrica) {
		
		// Inicijalizujemo promenljive potrebne za nalaženje najmanje sume po danu.
		// sumaDan pamti ukupan dnevni iznos.
		// sumaMin pamti minimalni meseèni iznos i poredi da li je manja od sumaDan.
		// indxMinDan pamti indeks vrste za minimalni meseèni iznos.
		double sumaDan = 0, sumaMin = 0;
		int indxMinDan = 0;
		
		// Sabiramo prihode za prvi dan i upisujemo ih kao minimalne.
		for (int i = 0; i < matrica[0].length; i++) {
			sumaMin += matrica[0][i];
		}
		
		// Sabiramo prihode za sve dane po danu i poredimo sa veæ upisanim minimalnim prihodom.
		for (int i = 1; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				sumaDan += matrica[i][j];
			}
			// Ukoliko je dnevni prihod manji od zapamæenog minimalnog prihoda,
			// dnevni prihod postaje minimalni prihod i pamtimo indeks dana.
			if (sumaMin > sumaDan) {
				sumaMin = sumaDan;
				indxMinDan = i;
			}
			// Nuliramo dnevnu sumu.
			sumaDan = 0;
		}
		
		// Ispisujemo rezultat
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
		System.out.println();
		System.out.printf
			("Najmanji prihod (%.2f) je ostvaren na dan: %d.\n", sumaMin, indxMinDan + 1);
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
	}
	
	// Potprogram za ispis svih dana za izabranu kategoriju.
	static void ispisPrihodaPoKategoriji(double[][] matrica) {
		
		int kategorija = 0;

		// Korisnik upisuje kolonu matrice.
		do {
			System.out.println();
			System.out.println
				("Za koju kategoriju želite da izlistate prihode (1 - 5)?");
			kategorija = TextIO.getlnInt();
			if (kategorija < 1 || kategorija > 5)
				System.out.println("Izabrali ste pogrešnu kategoriju!");
		} while (kategorija < 1 || kategorija > 5);

		// Pozivamo potprogram za proveru maksimalne širine kolone i pamtimo vrednost.
		int sirinaKolone = maksSirinaKolone(matrica);

		// Formiramo ispis zaglavlja tabele sa potrebnim širinama kolona.
		System.out.println();
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
		System.out.println("Prikaz prihoda po danima za kategoriju " + kategorija + ".\n");
		System.out.println("Dani| Prihodi");
		
		// Formiramo ispis vrednosti svih dana za izabranu kategoriju.
		for (int i = 0; i < matrica.length; i++) {
			System.out.printf("  %2d| ", i + 1);
			System.out.printf("%" + sirinaKolone + ".2f\n", matrica[i][kategorija - 1]);
		}
		
		// Formiramo ispis futera.
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
	}
	
	// Potprogram za ispis svih kategorija za izabrani dan.
	static void ispisPrihodaPoDanu(double[][] matrica) {
		
		int dan = 0;

		// Korisnik upisuje vrstu matrice.
		do {
			System.out.println();
			System.out.println
				("Za koji dan želite da ispišete prihode (1 - 30)?");
			dan = TextIO.getlnInt();
			if (dan < 1 || dan > 30)
				System.out.println("Izabrali ste pogrešan dan!\n");
		} while (dan < 1 || dan > 30);

		// Pozivamo potprogram za proveru maksimalne širine kolone i pamtimo vrednost.
		int sirinaKolone = maksSirinaKolone(matrica);

		// Formiramo ispis zaglavlja tabele sa potrebnim širinama kolona.
		System.out.println();
		System.out.print
			(String.format("%" + (6 + ((sirinaKolone + 1) * 5)) + "s\n", "-").replace(' ', '-'));
		System.out.println("Prikaz prihoda po kategorijama za dan " + dan + ".\n");
		System.out.println(" Dan  Kategorije...");
		System.out.print("      ");
		for (int i = 0; i < matrica[0].length; i++) {
			System.out.printf("%" + sirinaKolone + "s|", i + 1);
		}
		System.out.println();
		
		// Formiramo izabrane vrste svih kategorija matrice sa zaglavljem vrste
		System.out.printf("  %2d| ", dan);
		for (int i = 0; i < matrica[dan - 1].length; i++)
			System.out.printf("%" + sirinaKolone + ".2f|", matrica[dan - 1][i]);
		System.out.printf("\n");
		
		// Formiramo ispis futera.
		System.out.print
			(String.format("%" + (6 + ((sirinaKolone + 1) * 5)) + "s\n", "-").replace(' ', '-'));
	}
	
	// Potprogram za ispis svih elemenata matrice.
	static void ispis(double[][] matrica) {
		
		// Pozivamo potprogram za proveru maksimalne širine kolone i pamtimo vrednost.
		int sirinaKolone = maksSirinaKolone(matrica);

		// Formiramo ispis zaglavlja tabele sa potrebnim širinama kolona.
		System.out.println();
		System.out.print
			(String.format("%" + (6 + ((sirinaKolone + 1) * 5)) + "s\n", "-").replace(' ', '-'));
		System.out.println("Prikaz prihoda za sve kategorije i dane.");
		System.out.println();
		System.out.println("Dani  Kategorije...");
		System.out.print("      ");
		for (int i = 0; i < matrica[0].length; i++) {
			System.out.printf("%" + sirinaKolone + "s|", i + 1);
		}
		System.out.println();
		
		// Formiramo ispis vrednosti svih elemenata matrice sa zaglavljem vrste
		for (int i = 0; i < matrica.length; i++) {
			System.out.printf("  %2d| ", i + 1);
			for (int j = 0; j < matrica[i].length; j++)
				System.out.printf("%" + sirinaKolone + ".2f|", matrica[i][j]);
			System.out.printf("\n");
		}
		
		// Formiramo ispis futera.
		System.out.print
			(String.format("%" + (6 + ((sirinaKolone + 1) * 5)) + "s\n", "-").replace(' ', '-'));
	}

	// Potprogram za proveru maksimalne širine kolone.
	static int maksSirinaKolone(double[][] matrica) {
		
		// Vrednost elementa matrice "prelivamo" u ceo broj da bi izgubili decimalu.
		// Ceo broj konvertujemo u string i dužinu stringa zapisujemo kao celobrojnu
		// vrednost koju æemo u petlji porediti sa stringnim dužinama svih elemenata
		// matrice i najveæu vrednost pamtiti u promenljivoj sirina.
		// Na povratnu vrednost dodajemo 3 za taèku i dve decimale.
		
		int sirina = Integer.toString((int) matrica[0][0]).length();
		
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[i].length; j++) {
				if (sirina < Integer.toString((int) matrica[i][j]).length())
					sirina = Integer.toString((int) matrica[i][j]).length();
			}
		}
		
		return sirina + 3;
	}
	
	// Potprogram za unos/izmenu vrednosti elemenata.
	static void unos(double[][] matrica) {
		
		// Pitamo korisnika da li želi da program popuni kompletnu matricu.
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
		System.out.println("Da li želite da mrRobot popuni kompletnu tabelu umesto Vas (y/n)?");
		System.out.println("Svi elementi æe biti popunjeni sa vrednostima od 0 do 10.000.");
		System.out.println("PAŽNJA! Prethodno unete vrednosti æe biti prepisane. PAŽNJA!");
		boolean generisi = TextIO.getlnBoolean();
		
		// Ukoliko korisnik želi da program popuni matricu prolazimo kroz celu matricu i
		// za svaki element pozivamo potprogram za generisanje sluèajnih projeva kome
		// prosleðujemo parametre minimalne i maksimalne vrednosti sluèajnog broja.
		if (generisi) {
			
			for (int i =0; i < matrica.length; i++)
				for (int j = 0; j < matrica[i].length; j++)
					matrica[i][j] = mrRobot(0, 10000);
			System.out.println("mrRobot je popunio kompletnu tabelu.");
		}
		// U drugom sluèaju ulazimo u seriju pitanja i provera za unos nove vrednosti
		// pojedinaènih elementa matrice.
		else {
			
			boolean izlaz = false;

			do {

				int dan = 0, kategorija = 0;

				// Korisnik upisuje kolonu matrice.
				do {
					System.out.println
						("Za koju kategoriju želite da upišete/izmenite vrednost (1 - 5)?");
					kategorija = TextIO.getlnInt();
					if (kategorija < 1 || kategorija > 5)
						System.out.println("Izabrali ste pogrešnu kategoriju!\n");
				} while (kategorija < 1 || kategorija > 5);
				
				// Korisnik upisuje vrstu matrice.
				do {
					System.out.println
						("Za koji dan kategorije " + kategorija +
						 " želite da upišete/izmenite vrednost (1 - 30)?");
					dan = TextIO.getlnInt();
					if (dan < 1 || dan > 30)
						System.out.println("Izabrali ste pogrešan dan!\n");
				} while (dan < 1 || dan > 30);
				
				// Ispisujemo sadašnju vrednost elementa i tražimo unos nove vrednosti.
				System.out.printf
					("Sadašnja vrednost kategorije %s na dan %s je: %.2f\n",
					 kategorija, dan, matrica[dan - 1][kategorija - 1]);
				System.out.println("Upišite novu vrednost:");
				matrica[dan - 1][kategorija - 1] = TextIO.getlnDouble();
				
				// Pitamo korisnika da li je završio sa unosom i izlazimo iz petlje ukoliko jeste.
				System.out.println("Da li ste završili sa unosom/izmenom (y/n)?");
				izlaz = TextIO.getlnBoolean();
			} while (!izlaz);
		}
		
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
	}
	
	// Potprogram za generisanje brojeva.
	static double mrRobot(double min, double max) {
		// U potprogram se prosleðuju minimalna i maksimalna vrednost nasumiènog broja.
		// Potprogram vraæa generisanu vrednost.
		// (https://www.baeldung.com/java-generating-random-numbers-in-range)
		
		return ((Math.random() * (max - min)) + min);
	}
	
	// Potprogram za unos i proveru vrednosti izbora menija.
	static int meniIzbor(String[] meni, int donja, int gornja) {
		
		// Poziva se potprogram za ispis menija.
		// Kao parametar se prosleðuje niz stringova sa opcijama menija.
		meniPrikaz(meni);
		
		int izbor = 0;
		
		do {
			
			System.out.printf("\nIzaberite opciju (%s - %s):", donja, gornja);
			izbor = TextIO.getlnInt();
			
			if ((izbor < donja) || (izbor > gornja)) {
				System.out.println("Pažnja! Izabrali ste pogrešnu opciju.");
			}
		} while ((izbor < donja) || (izbor > gornja));
		
		return izbor;
	}
	
	// Potprogram za ispis menija.
	static void meniPrikaz(String[] meni) {
		
		System.out.println();
		System.out.println("Dobrodošli u program za voðenje evidencije prihoda osiguranja.");
		System.out.println("Molim Vas da izaberete jednu od ponuðenih opcija:");
		System.out.println();
		
		// Petlja ispisuje niz sa stringovima opcija menija od indeksa 1 do kraja niza.
		// String na indeksnoj poziciji 0 je rezervisan za opciju KRAj i prikazuje se poslednji.
		for (int i = 1; i < meni.length; i++)
			System.out.printf("\t%d: %s\n", i, meni[i]);
		System.out.printf("\t0: %s\n", meni[0]);
	}
	
	// Potprogram za terminaciju programa i ispis poruke o završetku programa.
	static void kraj() {

		// Za ispis linije formiramo string sa potrebnim brojem praznih karaktera i
		// prazne karaktere zamenjujemo karakterima za ispis linije.
		// (https://stackoverflow.com/questions/9997767/change-the-default-padding-character-in-java-printf)
		System.out.print(String.format("%65s\n", "-").replace(' ', '-'));
		System.out.println("KRAJ programa.");
		System.exit(0);
	}
}
