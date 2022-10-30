package s235_potprogrami;

import alati.TextIO;

public class S269_PracenjeNaplatnihRampi {

	/*
	 * Program za pracenje statistike rada naplatnih rampi na auto putu u nekom mesecu.
	 * Ukupno ima 10 naplatnih rampi i svakog dana (pretpostaviti da ih je 30) belezi se
	 * broj automobila koji su prosli kroz tu rampu.
	 * Program treba da omoguci:
	 * 1) Unos broja proslih automobila za zadatu rampu i dan.
	 * 2) Prikaz ukupnog broja automobila koji su prosli kroz izabranu rampu.
	 * 3) Prikaz kojim je sve danima proslo ukupno automobila
	 *    vise od nekog broja automobila koje zadaje korisnik.
	 * 4) Izracunavanje i prikaz ukupnog broja automobila koji su tog meseca prosli kroz rampe.
	 * 5) Meni iz kojeg se biraju ponudjene funkcije.
	 * Obavezno koristiti funkcije za implementaciju trazenih funkcionalnosti.
	 * Izabrati korektne tipove podataka i strukture podataka i ograniciti unos tako da
	 * nije moguce uneti neispravne vrednosti.
	 */
	
	// Broj karaktera '-' sa kojim ce se iscrtavati linija za podvlacenje.
	private static final int MINUSI = 85;

	public static void main(String[] args) {
		
		// Dimenzionise se matrica evidencije.
		int [][] evidencija = new int[30][10];
		
		// Dimenzionise se i inicijalizuje niz za cuvanje opcija menija.
		String meniPoruka = "Dobrodosli u GLAVNI meni programa za voðenje evidencije naplatnih rampi.";
		String[] meni = new String[5];
		meni[0] = "KRAJ programa.";
		meni[1] = "Unos/izmena broja prolazaka automobila na odreðenoj rampi i danu.";
		meni[2] = "Prikaz izvestaja ukupnog broja prolaza automobila za izabranu rampu.";
		meni[3] = "Prikaz dana sa brojem prolaza automobila vecim od trazenog broja prolaza.";
		meni[4] = "Prikaz izvestaja ukupnog broja prolaza automobila na mesecnom nivou.";
		
		// Glavni meni se drzi u beskonacnoj petlji dokle god korisnik ne izabere opciju za zavrsetak programa.
		do {
			podvuci(MINUSI);

			// Ispituje se korisnikov izbor menija i poziva se odgovarajuci potprogram.
			// Switch u izrazu poziva potprogram za izbor i proveru izbora menija.
			// Potprogramu za izbor menija se prosleðuje niz stringova sa opcijama menija i
			// minimalna i maksimalna vrednost opcija menija.
			// (https://www.w3schools.com/java/java_switch.asp)
			switch (meniIzbor(meniPoruka, meni, 0, meni.length - 1)) {
			case 0:
				// Poziva se potprogram za terminaciju programa.
				kraj();
			case 1:
				// Poziva se potprogram za unos/izmenu vrednosti elemenata.
				unosMeni(evidencija);
				break;
			case 2:
				// Poziva se potprogram za prikaz ukupnog broja prolaza po izabranoj rampi.
				prikazUkupnoPoRampi(evidencija);
				break;
			case 3:
				// Poziva se potprogram za prikaz dana sa brojem prolaza vecim od trazenog broja.
				prikazPoDanuVeciOd(evidencija);
				break;
			case 4:
				// Poziva se potprogram za prikaz ukupnih brojeva prolaza na mesecnom nivou.
				prikazUkupnoZaMesec(evidencija);
				break;
			case 9:
				// Neka tajna opcija.
				prikazTajnaOpcija(evidencija);
				break;
			}
		} while (true);
	}

	static void prikazUkupnoZaMesec(int[][] matrica) {
		// Potprogram za prikaz ukupnog broja prolaza na mesecnom nivou.

		// Inicijalizujemo privremene promenljive
		int suma = 0, sirinaKolone;
		int[] sumaDan = new int[matrica[0].length];
		
		// Iscrtavamo liniju.
		podvuci(MINUSI);
		
		// Prolazimo kroz matricu i u privremenom nizu pamtimo sumu po danu.
		for (int i = 0; i < matrica[0].length; i ++)
			for (int j = 0; j < matrica.length; j++)
				sumaDan[i] += matrica[j][i];
		
		// Sabiramo ukupan broj prolaza automobila.
		for (int i = 0; i < sumaDan.length; i++)
			suma += sumaDan[i];
		
		// Formiramo ispis prvog dela izvestaja.
		System.out.printf("\nTokom meseca kroz sve rampe je proslo ukupno %d automobila.\n\n", suma);

		// Trazimo sirinu kolone radi formiranja ispisa tabele.
		sirinaKolone = nadjiSirinuKolone(sumaDan);
		
		// Formiramo ispis tabele izvestaja.
		System.out.println("        Po rampi je ukupno proslo...");
		System.out.print("       ");
		for (int i = 0; i < sumaDan.length; i++)
			System.out.printf(" %" + sirinaKolone + "d|", i + 1);
		System.out.print("\nukupno:");
		for (int i = 0; i < sumaDan.length; i++)
			System.out.printf(" %" + sirinaKolone + "d|", sumaDan[i]);
		System.out.println();
	}
	
	static void prikazPoDanuVeciOd(int[][] matrica) {
		// Potprogram za prikaz svih dana sa vecim brojem prolaza od trazenog minimalnog broja prolaza.

		// Inicijalizujemo privremene promenljive
		int minAutomobila;
		int[] sumaDan = new int[matrica.length];
		String ispis = "";
		
		// Od korisnika trazimo unos minimalnog broja prolaza automobila i testiramo da li je negativan broj.
		do {
			podvuci(MINUSI);

			System.out.println();
			System.out.println("Upisite minimalan broj prolaza automobila?");
			minAutomobila = TextIO.getlnInt();

			if (minAutomobila < 0) System.out.println("Paznja! Upisali ste negativan broj.");
		} while (minAutomobila < 0);

		// Prolazimo kroz matricu i u privremenom nizu pamtimo sumu po danu.
		for (int i = 0; i < matrica.length; i ++)
			for (int j = 0; j < matrica[0].length; j++)
				sumaDan[i] += matrica[i][j];
		
		// Formiramo ispis koji pamtimo u stringu 'ispis'.
		System.out.println("Broj prolazaka automobila veci od " + minAutomobila + " je evidentiran za sledece dane: ");
		
		// Proveravamo niz sa dnevnim sumama da li je veci od minimalnog broja i ako jeste
		// dodajemo u string 'ispis' zajedno sa zarezom na kraju broja.
		for (int i = 0; i < sumaDan.length; i++)
			if (sumaDan[i] > minAutomobila) ispis += (i + 1) + ", ";
		
		// Testiramo da li postoje rezultati i ukoliko ne postoje 'ispis' punimo sa porukom.
		if (ispis.isEmpty())
			ispis += "Nema evidentiran broj prolazaka veci od " + minAutomobila + " po danu";
		
		// Na kraju stringa 'ispis' dodajemo tacku i ako postoje karakteri ', .' menjamo ih sa '.'.
		ispis += ".";
		System.out.println(ispis.replace(", .", "."));
	}
	
	static void prikazUkupnoPoRampi(int[][] matrica) {
		// Potprogram za prikaz ukupnog broja automobila na izabranoj rampi.

		int rampa, suma = 0;

		// Od korisnika trazimo da izabere rampu i proveravamo vrednost.
		do {
			podvuci(MINUSI);
		
			System.out.println();
			System.out.println("Za koju rampu zelite da prikazete ukupan broj prolaza (1 - 10)?");
			rampa = TextIO.getlnInt();
			
			if (rampa < 1 || rampa > 10) System.out.println("Paznja! Izabrali ste pogresnu rampu.");
		} while (rampa < 1 || rampa > 10);

		// Prolazimo po kolonama matrice za izabranu vrstu i sabiramo vrednosti.
		for (int i = 0; i < matrica.length; i++)
			suma += matrica[i][rampa - 1];
		
		// Ispisujemo izvestaj.
		System.out.printf("\nTokom celog meseca na rampi %s je proslo ukupno %s automobila.\n", rampa, suma);
	}
	
	static void prikazTajnaOpcija(int[][] matrica) {
		// Tajni potprogram

		// Trazimo sirinu kolone radi formiranja ispisa tabele.
		int sirinaKolone = nadjiSirinuKolone(matrica);
		
		// Formiramo ispis zaglavlja tabele.
		podvuci(MINUSI);
		
		System.out.println("Pssst. Nasli ste neku TAJNU opciju!\n");
		System.out.println("Prikaz prolaza za sve dane i rampe.");
		
		// Ispisujemo zaglavlja kolona matrice.
		System.out.println("Dani  Rampe...");
		System.out.print("      ");
		
		for (int i = 0; i < matrica[0].length; i++) {
			System.out.printf("%" + sirinaKolone + "s| ", i + 1);
		}
		
		System.out.println();
		podvuci((sirinaKolone + 2) * matrica[0].length + 5);
		
		// Formiramo ispis vrednosti svih elemenata matrice sa zaglavljem vrste
		for (int i = 0; i < matrica.length; i++) {
			System.out.printf("%4d| ", i + 1);
			for (int j = 0; j < matrica[i].length; j++)
				System.out.printf("%" + sirinaKolone + "d| ", matrica[i][j]);
			System.out.printf("\n");
		}
		
		// Formiramo ispis futera.
		podvuci((sirinaKolone + 2) * matrica[0].length + 5);
	}
	
	static int nadjiSirinuKolone(int[] niz) {
		// Potprogram za proveru maksimalne sirine kolone (niz).

		// Sirinu kolone trazimo tako sto prebrojavamo cifre u vrednosti elementa.
		// Metod prebrojavanja izabran po kriterijumu jednostavnost/performanse.
		// (https://www.baeldung.com/java-number-of-digits-in-int)
		int sirina = 0;
		for (int i = 0; i < niz.length; i++) {
			int s = 0;
			long p = 1;
			while (p <= niz[i]) {
			    s++;
			    p *= 10;
			}
			if (sirina < s) sirina = s; 
		}

		// Ukoliko je sirina kolone manja od 2, sirinu postavljamo na 2 zbog dvocifrenog zaglavlja kolone.
		if (sirina < 2) sirina = 2;
		return sirina;
	}
	
	static int nadjiSirinuKolone(int[][] matrica) {
		// Potprogram za proveru maksimalne sirine kolone (matrica).

		// Sirinu kolone trazimo tako sto prebrojavamo cifre u vrednosti elementa.
		// Metod prebrojavanja izabran po kriterijumu jednostavnost/performanse.
		// (https://www.baeldung.com/java-number-of-digits-in-int)
		int sirina = 0;
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[0].length; j++) {
				int s = 0;
				long p = 1;
				while (p <= matrica[i][j]) {
				    s++;
				    p *= 10;
				}
				if (sirina < s) sirina = s; 
			}
		}
//		   Stara verzija metode koju sam napravio bez googlanja pre sugestije kolege da to moze bolje.
//		   -------------------------------------------------------------------------------------------
//		// Vrednost elementa matrice "prelivamo" u ceo broj da bi izgubili decimalu.
//		// Ceo broj konvertujemo u string i duzinu stringa zapisujemo kao celobrojnu
//		// vrednost koju cemo u petlji porediti sa duzinama stringa svih elemenata
//		// matrice i najvecu vrednost pamtiti u promenljivoj sirina.
//		
//		int sirina = Integer.toString((int) matrica[0][0]).length();
//		for (int i = 0; i < matrica.length; i++)
//			for (int j = 0; j < matrica[i].length; j++)
//				if (sirina < Integer.toString((int) matrica[i][j]).length())
//					sirina = Integer.toString((int) matrica[i][j]).length();
		
		// Ukoliko je sirina kolone manja od 2, sirinu postavljamo na 2 zbog dvocifrenog zaglavlja kolone.
		if (sirina < 2) sirina = 2;
		return sirina;
	}

	static void unosMeni(int[][] matrica) {
		// Potprogram menija za unos/izmenu vrednosti elemenata.

		// Inicijalizujemo string sa porukom i niz sa opcijama menija.
		String meniPoruka = "Dobrodosli u PODMENI za unos/izmenu podataka evidencije.";
		String[] meniUnos = new String[4];
		meniUnos[0] = "Povratak u glavni meni.";
		meniUnos[1] = "Automatizovana popuna kompletne tabele sa nasumicnim podacima (0 - 500).";
		meniUnos[2] = "Unos/izmena pojedinacnih podataka.";
		meniUnos[3] = "Rucna popuna kompletne tabele.";
		
		// Inicijalizujemo privremenu promenljivu koju cemo koristiti kao uslov za izlaz iz petlje podtebija.
		boolean kraj = false;

		do {
			podvuci(MINUSI);

			// Ispituje se korisnikov izbor menija i poziva se odgovarajuci potprogram.
			// Switch u izrazu poziva potprogram za izbor i proveru izbora menija.
			// Potprogramu za izbor menija se prosleðuje niz stringova sa opcijama menija i
			// minimalna i maksimalna vrednost opcija menija.
			// (https://www.w3schools.com/java/java_switch.asp)
			switch (meniIzbor(meniPoruka, meniUnos, 0, meniUnos.length - 1)) {
			case 0:
				// Povratak na glavni meni.
				// Promenljivi 'kraj' se dodeljuje istinita vrednost koja je uslov za izlaz iz petlje.
				kraj = true;
				break;
			case 1:
				// Poziva se potprogram za automatski unos vrednosti elemenata.
				unosAutomatski(matrica);
				break;
			case 2:
				// Poziva se potprogram za pojedinacni unos/izmenu vrednosti elemenata.
				unosPojedinacno(matrica);
				break;
			case 3:
				// Poziva se potprogram za rucni unos/izmenu vrednosti svih elemenata.
				unosRucno(matrica);
				break;
			}
		} while (!kraj);
	}
	
	static void unosRucno(int[][] matrica) {
		// Potprogram za rucno popunjavanje elemenata matrice

		// Deklarisemo privremenu promenljivu za potvrdu korisnika pri upitu da li zeli da zapocne unos. 
		boolean siguran;
		System.out.println("\nIzabrali ste opciju za rucni unos SVIH elemenata tabele!");
		System.out.println("Da li ste SIGURNI da zelite da pokrenete sekvencu unosa (y/n)?");
		siguran = TextIO.getlnBoolean();
		if (siguran) {
			// Deklarisemo privremenu promenljivu u koju cemo smestati korisnikov unos broja automobila.
			int automobili = 0;
			
			// Prolazimo kroz kompletnu matricu i od korisnika trazimo unos vrednosti za svaki element.
			// Proveravamo da li je korisnik upisao negativnu vrednost.
			for (int i = 0; i < matrica.length; i++) {
				for (int j = 0; j < matrica[0].length; j++) {
					do {
						System.out.printf("Upisite broj automobila za rampu %2d na dan %d", j + 1, i + 1);
						automobili = TextIO.getlnInt();
						if (automobili < 0)	System.out.println("Paznja! Upisali ste negativan broj.");
					} while (automobili < 0);
					matrica[i][j] = automobili;
				}
			}
			System.out.println("Svaka cast na trudu. Svi unosi ce biti izgubljeni po zavrsetku programa.");
		}
		else System.out.println("(-chicken-)");
	}
	
	static void unosPojedinacno(int[][] matrica) {
		// Potprogram za pojedinacno popunjavanje elementa matrice

		// Deklarisemo privremene promenljive.
		int dan, rampa, automobili;
		
		// Korisniku postavljamo upit za vrstu matrice i proveravamo unos.
		do {
			System.out.println("Za koji dan zelite da unesete podatak (1 - 30)?");
			dan = TextIO.getlnInt();
			if (dan < 1 || dan > 30) System.out.println("Paznja! Izabrali ste pogresan dan.");
		} while (dan < 1 || dan > 30);
		
		// Korisniku postavljamo upit za kolonu matrice i proveravamo unos.
		do {
			System.out.println("Za koju rampu zelite da unesete podatak (1 - 10)?");
			rampa = TextIO.getlnInt();
			if (rampa < 1 || rampa > 10) System.out.println("Paznja! Izabrali ste pogresnu rampu.");
		} while (rampa < 1 || rampa > 10);
		
		// Korisniku postavljamo upit za vrednost elementa i upisujemo u matricu ako nije negativan broj.
		do {
			System.out.printf("Upisite broj automobila za rampu %d na dan %d:", rampa, dan);
			automobili = TextIO.getlnInt();
			if (automobili < 0) System.out.println("Paznja! Upisali ste negativan broj.");
			else matrica[dan - 1][rampa - 1] = automobili;
		} while (automobili < 0);
	}
	
	static void unosAutomatski(int[][] matrica) {
		// Potprogram za popunjavanje matrice sa slucajno generisanim brojevima u rasponu 0 - 500.

		// Prolazimo kroz sve elemente matrice i upisujemo vrednosti pozivajuci metodu slucajnog broja.
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[0].length; j++)
				matrica[i][j] = mrRobot(0, 500);
		}
		System.out.println("\nmrRobot je POPUNIO kompletnu tabelu umesto Vas.");
	}
	
	static int mrRobot(int min, int max) {
		// Potprogram za generisanje slucajnih brojeva.

		// U potprogram se prosleðuju minimalna i maksimalna vrednost slucajnog broja.
		// Potprogram vraca generisanu vrednost.
		// (https://www.baeldung.com/java-generating-random-numbers-in-range)
		return (int) ((Math.random() * (max - min)) + min);
	}

	static int meniIzbor(String meniPoruka, String[] meni, int donja, int gornja) {
		// Potprogram za ispis i prihvat izbora menija.

		// Ispisujemo poruku koju smo dobili od prozivajuce metode.
		System.out.println();
		System.out.println(meniPoruka);
		System.out.println("Molim Vas da izaberete jednu od ponuðenih opcija:");
		System.out.println();

		// Petlja ispisuje niz sa stringovima opcija menija od indeksa 1 do kraja niza.
		// String na indeksnoj poziciji 0 je rezervisan za opciju KRAJ i prikazuje se poslednji.
		for (int i = 1; i < meni.length; i++)
			System.out.printf("\t%d: %s\n", i, meni[i]);
		System.out.printf("\t0: %s\n", meni[0]);
		
		// Inicijalizujemo promenljivu za prihvat korisnikovog izbora.
		int izbor = 0;
		
		// Korisnika drzimo u petlji dok ne upise ispravnu vrednost ciji nam je opseg
		// prosleðen od prozivajuce metode.
		do {
			System.out.printf("\nIzaberite opciju (%s - %s):", donja, gornja);
			izbor = TextIO.getlnInt();
			if (izbor == 9 && meniPoruka.contains("GLAVNI meni"))
				return izbor;
			else if ((izbor < donja) || (izbor > gornja))
				System.out.println("Paznja! Izabrali ste pogresnu opciju.");
		} while ((izbor < donja) || (izbor > gornja));
		
		// Vracamo korisnikov izbor prozivajucoj metodi.
		return izbor;
	}
	
	static void podvuci(int x) {
		// Potprogram za iscrtavanje horizontalne linije.

		// Za ispis linije formiramo string sa potrebnim brojem praznih karaktera i
		// prazne karaktere zamenjujemo karakterima za ispis linije.
		// Broj karaktera dobijamo preko prenesenih parametara.
		// (https://stackoverflow.com/questions/9997767/change-the-default-padding-character-in-java-printf)
		System.out.print(String.format("%" + x + "s\n", "-").replace(' ', '-'));
	}

	static void kraj() {
		// Potprogram za terminaciju programa i ispis poruke o zavrsetku programa.

		// Za ispis linije formiramo string sa potrebnim brojem praznih karaktera i
		// prazne karaktere zamenjujemo karakterima za ispis linije.
		// (https://stackoverflow.com/questions/9997767/change-the-default-padding-character-in-java-printf)
		podvuci(MINUSI);
		System.out.println("KRAJ programa.");
		System.exit(0);
	}
	
	// Testiramo program.
	// Ispisujemo komentare da bi smo zvucali pametnije.
	// Klikamo na sve sto je spelceker podvukao crvenim i dodajemo u recnik.
	// Šta sada?...
}
