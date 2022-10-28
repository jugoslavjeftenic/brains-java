package s235_potprogrami;

import alati.TextIO;

public class S269_PracenjeNaplatnihRampi {

	// Broj karaktera '-' sa kojim æe se iscrtavati linija za podvlaèenje.
	private static final int MINUSI = 85;

	public static void main(String[] args) {
		
		/*
		 * Program za praæenje statistike rada naplatnih rampi na auto putu u nekom mesecu.
		 * Ukupno ima 10 naplatnih rampi i svakog dana (pretpostaviti da ih je 30) beleži se
		 * broj automobila koji su prošli kroz tu rampu.
		 * Program treba da omoguæi:
		 * 1) Unos broja prošlih automobila za zadatu rampu i dan.
		 * 2) Prikaz ukupnog broja automobila koji su prošli kroz izabranu rampu.
		 * 3) Prikaz kojim je sve danima prošlo ukupno automobila
		 *    više od nekog broja automobila koje zadaje korisnik.
		 * 4) Izraèunavanje i prikaz ukupnog broja automobila koji su tog meseca prešli kroz rampe.
		 * 5) Meni iz kojeg se biraju ponuðene funkcije.
		 * Obavezno koristiti funkcije za implementaciju traženih funkcionalnosti.
		 * Izabrati korektne tipove podataka i strukture podataka i ogranièiti unos tako da
		 * nije moguæe uneti neispravne vrednosti.
		 */
		
		// Dimenzioniše se matrica evidencije.
		int [][] evidencija = new int[30][10];
		// Dimenzioniše se i inicijalizuje niz za èuvanje opcija menija.
		String meniPoruka = "Dobrodošli u GLAVNI meni programa za voðenje evidencije naplatnih rampi.";
		String[] meni = new String[5];
		meni[0] = "KRAJ programa.";
		meni[1] = "Unos/izmena broja prolazaka automobila na odreðenoj rampi i danu.";
		meni[2] = "Prikaz izveštaja ukupnog broja prolaza automobila za izabranu rampu.";
		meni[3] = "Prikaz dana sa brojem prolaza automobila veæim od traženog broja prolaza.";
		meni[4] = "Prikaz izveštaja ukupnog broja prolaza automobila na meseènom nivou.";
		// Glavni meni se drži u beskonaènoj petlji dokle god korisnik ne izabere
		// opciju za završetak programa.
		do {
			podvuci(MINUSI);
			// Ispituje se korisnikov izbor menija i poziva se odgovarajuæi potprogram.
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
				// Poziva se potprogram za prikaz dana sa brojem prolaza veæim od traženog broja.
				prikazPoDanuVeciOd(evidencija);
				break;
			case 4:
				// Poziva se potprogram za prikaz ukupnih brojeva prolaza na meseènom nivou.
				prikazUkupnoZaMesec(evidencija);
				break;
			case 9:
				// Neka tajna opcija.
				prikazTajnaOpcija(evidencija);
				break;
			}
		} while (true);
	}

	// Potprogram za prikaz ukupnog broja prolaza na meseènom nivou.
	static void prikazUkupnoZaMesec(int[][] matrica) {
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
		// Formiramo ispis prvog dela izveštaja.
		System.out.printf("\nTokom meseca kroz sve rampe je prošlo ukupno %d automobila.\n\n", suma);
		// Tražimo širinu kolone radi formiranja ispisa tabele.
		sirinaKolone = nadjiSirinuKolone(sumaDan);
		// Formiramo ispis tabele izveštaja.
		System.out.println("        Po rampi je ukupno prošlo...");
		System.out.print("       ");
		for (int i = 0; i < sumaDan.length; i++)
			System.out.printf(" %" + sirinaKolone + "d|", i + 1);
		System.out.print("\nukupno:");
		for (int i = 0; i < sumaDan.length; i++)
			System.out.printf(" %" + sirinaKolone + "d|", sumaDan[i]);
		System.out.println();
	}
	
	// Potprogram za prikaz svih dana sa veæim brojem prolaza od traženog minimalnog broja prolaza.
	static void prikazPoDanuVeciOd(int[][] matrica) {
		// Inicijalizujemo privremene promenljive
		int minAutomobila;
		int[] sumaDan = new int[matrica.length];
		String ispis = "";
		// Od korisnika tražimo unos minimalnog broja prolaza automobila i
		// testiramo da li je negativan broj.
		do {
			podvuci(MINUSI);
			System.out.println();
			System.out.println("Upišite minimalan broj prolaza automobila?");
			minAutomobila = TextIO.getlnInt();
			if (minAutomobila < 0) System.out.println("Pažnja! Upisali ste negativan broj.");
		} while (minAutomobila < 0);
		// Prolazimo kroz matricu i u privremenom nizu pamtimo sumu po danu.
		for (int i = 0; i < matrica.length; i ++)
			for (int j = 0; j < matrica[0].length; j++)
				sumaDan[i] += matrica[i][j];
		// Formiramo ispis koji pamtimo u stringu 'ispis'.
		System.out.println("Broj prolazaka automobila veæi od " + minAutomobila + " je evidentiran za sledeæe dane: ");
		// Proveravamo niz sa dnevnim sumama da li je veæi od minimalnog broja i ako jeste
		// dodajemo u string 'ispis' zajedno sa zarezom na kraju broja.
		for (int i = 0; i < sumaDan.length; i++)
			if (sumaDan[i] > minAutomobila) ispis += (i + 1) + ", ";
		// Testiramo da li postoje rezultati i ukoliko ne postoje 'ispis' punimo sa porukom.
		if (ispis.isEmpty())
			ispis += "Nema evidentiran broj prolazaka veæi od " + minAutomobila + " po danu";
		// Na kraju stringa 'ispis' dodajemo taèku i ako postoje karakteri ', .' menjamo ih sa '.'.
		ispis += ".";
		System.out.println(ispis.replace(", .", "."));
	}
	
	// Potprogram za prikaz ukupnog broja automobila na izabranoj rampi.
	static void prikazUkupnoPoRampi(int[][] matrica) {
		int rampa, suma = 0;
		// Od korisnika tražimo da izabere rampu i proveravamo vrednost.
		do {
			podvuci(MINUSI);
			System.out.println();
			System.out.println("Za koju rampu želite da prikažete ukupan broj prolaza (1 - 10)?");
			rampa = TextIO.getlnInt();
			if (rampa < 1 || rampa > 10) System.out.println("Pažnja! Izabrali ste pogrešnu rampu.");
		} while (rampa < 1 || rampa > 10);
		// Prolazimo po kolonama matrice za izabranu vrstu i sabiramo vrednosti.
		for (int i = 0; i < matrica.length; i++)
			suma += matrica[i][rampa - 1];
		// Ispisujemo izveštaj.
		System.out.printf("\nTokom celog meseca na rampi %s je prošlo ukupno %s automobila.\n", rampa, suma);
	}
	
	// Tajni potprogram
	static void prikazTajnaOpcija(int[][] matrica) {
		// Tražimo širinu kolone radi formiranja ispisa tabele.
		int sirinaKolone = nadjiSirinuKolone(matrica);
		// Formiramo ispis zaglavlja tabele.
		podvuci(MINUSI);
		System.out.println("Pssst. Našli ste neku TAJNU opciju!\n");
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
	
	// Potprogram za proveru maksimalne širine kolone (niz).
	static int nadjiSirinuKolone(int[] niz) {
		// Širinu kolone tražimo tako što prebrojavamo cifre u vrednosti elementa.
		// Metod prebrojavanja izabran po kriterijumu jednostavnost/performanse.
		// Metod je prekopiran sa linka ispod.
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
		// Ukoliko je širina kolone manja od 2, širinu postavljamo na 2 zbog dvocifrenog zaglavlja kolone.
		if (sirina < 2) sirina = 2;
		return sirina;
	}
	
	// Potprogram za proveru maksimalne širine kolone (matrica).
	static int nadjiSirinuKolone(int[][] matrica) {
		// Širinu kolone tražimo tako što prebrojavamo cifre u vrednosti elementa.
		// Metod prebrojavanja izabran po kriterijumu jednostavnost/performanse.
		// Metod je prekopiran sa linka ispod.
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
//		   Stara verzija metode koju sam napravio bez googlanja pre sugestije kolege da to može bolje.
//		   -------------------------------------------------------------------------------------------
//		// Vrednost elementa matrice "prelivamo" u ceo broj da bi izgubili decimalu.
//		// Ceo broj konvertujemo u string i dužinu stringa zapisujemo kao celobrojnu
//		// vrednost koju æemo u petlji porediti sa dužinama stringa svih elemenata
//		// matrice i najveæu vrednost pamtiti u promenljivoj sirina.
//		
//		int sirina = Integer.toString((int) matrica[0][0]).length();
//		for (int i = 0; i < matrica.length; i++)
//			for (int j = 0; j < matrica[i].length; j++)
//				if (sirina < Integer.toString((int) matrica[i][j]).length())
//					sirina = Integer.toString((int) matrica[i][j]).length();
		
		// Ukoliko je širina kolone manja od 2, širinu postavljamo na 2 zbog dvocifrenog zaglavlja kolone.
		if (sirina < 2) sirina = 2;
		return sirina;
	}

	// Potprogram menija za unos/izmenu vrednosti elemenata.
	static void unosMeni(int[][] matrica) {
		// Inicijalizujemo string sa porukom i niz sa opcijama menija.
		String meniPoruka = "Dobrodošli u PODMENI za unos/izmenu podataka evidencije.";
		String[] meniUnos = new String[4];
		meniUnos[0] = "Povratak u glavni meni.";
		meniUnos[1] = "Automatizovana popuna kompletne tabele sa nasumiènim podacima (0 - 500).";
		meniUnos[2] = "Unos/izmena pojedinaènih podataka.";
		meniUnos[3] = "Ruèna popuna kompletne tabele.";
		// Inicijalizujemo privremenu promenljivu koju æemo koristiti kao uslov za izlaz
		// iz petlje podtebija.
		boolean kraj = false;

		do {
			podvuci(MINUSI);
			// Ispituje se korisnikov izbor menija i poziva se odgovarajuæi potprogram.
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
				// Poziva se potprogram za pojedinaèni unos/izmenu vrednosti elemenata.
				unosPojedinacno(matrica);
				break;
			case 3:
				// Poziva se potprogram za ruèni unos/izmenu vrednosti svih elemenata.
				unosRucno(matrica);
				break;
			}
		} while (!kraj);
	}
	
	// Potprogram za ruèno popunjavanje elemenata matrice
	static void unosRucno(int[][] matrica) {
		// Deklarišemo privremenu promenljivu za potvrdu korisnika pri upitu da li želi da zapoène unos. 
		boolean siguran;
		System.out.println("\nIzabrali ste opciju za ruèni unos SVIH elemenata tabele!");
		System.out.println("Da li ste SIGURNI da želite da pokrenete sekvencu unosa (y/n)?");
		siguran = TextIO.getlnBoolean();
		if (siguran) {
			// Deklarišemo privremenu promenljivu u koju æemo smeštati korisnikov unos broja automobila.
			int automobili = 0;
			// Prolazimo kroz kompletnu matricu i od korisnika tražimo unos vrednosti za svaki element.
			// Proveravamo da li je korisnik upisao negativnu vrednost.
			for (int i = 0; i < matrica.length; i++) {
				for (int j = 0; j < matrica[0].length; j++) {
					do {
						System.out.printf("Upišite broj automobila za rampu %2d na dan %d", j + 1, i + 1);
						automobili = TextIO.getlnInt();
						if (automobili < 0)	System.out.println("Pažnja! Upisali ste negativan broj.");
					} while (automobili < 0);
					matrica[i][j] = automobili;
				}
			}
			System.out.println("Svaka èast na trudu. Svi unosi æe biti izgubljeni po završetku programa.");
		}
		else System.out.println("(-chicken-)");
	}
	
	// Potprogram za pojedinaèno popunjavanje elementa matrice
	static void unosPojedinacno(int[][] matrica) {
		// Deklarišemo privremene promenljive.
		int dan, rampa, automobili;
		// Korisniku postavljamo upit za vrstu matrice i proveravamo unos.
		do {
			System.out.println("Za koji dan želite da unesete podatak (1 - 30)?");
			dan = TextIO.getlnInt();
			if (dan < 1 || dan > 30) System.out.println("Pažnja! Izabrali ste pogrešan dan.");
		} while (dan < 1 || dan > 30);
		// Korisniku postavljamo upit za kolonu matrice i proveravamo unos.
		do {
			System.out.println("Za koju rampu želite da unesete podatak (1 - 10)?");
			rampa = TextIO.getlnInt();
			if (rampa < 1 || rampa > 10) System.out.println("Pažnja! Izabrali ste pogrešnu rampu.");
		} while (rampa < 1 || rampa > 10);
		// Korisniku postavljamo upit za vrednost elementa i upisujemo u matricu ako nije negativan broj.
		do {
			System.out.printf("Upišite broj automobila za rampu %d na dan %d:", rampa, dan);
			automobili = TextIO.getlnInt();
			if (automobili < 0) System.out.println("Pažnja! Upisali ste negativan broj.");
			else matrica[dan - 1][rampa - 1] = automobili;
		} while (automobili < 0);
	}
	
	// Potprogram za popunjavanje matrice sa sluèajno generisanim brojevima u rasponu 0 - 500.
	static void unosAutomatski(int[][] matrica) {
		// Prolazimo kroz sve elemente matrice i upisujemo vrednosti pozivajuæi metodu sluèajnog broja.
		for (int i = 0; i < matrica.length; i++) {
			for (int j = 0; j < matrica[0].length; j++)
				matrica[i][j] = mrRobot(0, 500);
		}
		System.out.println("\nmrRobot je POPUNIO kompletnu tabelu umesto Vas.");
	}
	
	// Potprogram za generisanje sluèajnih brojeva.
	static int mrRobot(int min, int max) {
		// U potprogram se prosleðuju minimalna i maksimalna vrednost sluèajnog broja.
		// Potprogram vraæa generisanu vrednost.
		// (https://www.baeldung.com/java-generating-random-numbers-in-range)
		return (int) ((Math.random() * (max - min)) + min);
	}

	// Potprogram za ispis i prihvat izbora menija.
	static int meniIzbor(String meniPoruka, String[] meni, int donja, int gornja) {
		// Ispisujemo poruku koju smo dobili od prozivajuæe metode.
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
		// Korisnika držimo u petlji dok ne upiše ispravnu vrednost èiji nam je opseg
		// prosleðen od prozivajuæe metode.
		do {
			System.out.printf("\nIzaberite opciju (%s - %s):", donja, gornja);
			izbor = TextIO.getlnInt();
			if (izbor == 9 && meniPoruka.contains("GLAVNI meni"))
				return izbor;
			else if ((izbor < donja) || (izbor > gornja))
				System.out.println("Pažnja! Izabrali ste pogrešnu opciju.");
		} while ((izbor < donja) || (izbor > gornja));
		// Vraæamo korisnikov izbor prozivajuæoj metodi.
		return izbor;
	}
	
	// Potprogram za iscrtavanje horizontalne linije.
	static void podvuci(int x) {
		// Za ispis linije formiramo string sa potrebnim brojem praznih karaktera i
		// prazne karaktere zamenjujemo karakterima za ispis linije.
		// Broj karaktera dobijamo preko prenešenih parametara.
		// (https://stackoverflow.com/questions/9997767/change-the-default-padding-character-in-java-printf)
		System.out.print(String.format("%" + x + "s\n", "-").replace(' ', '-'));
	}

	// Potprogram za terminaciju programa i ispis poruke o završetku programa.
	static void kraj() {
		// Za ispis linije formiramo string sa potrebnim brojem praznih karaktera i
		// prazne karaktere zamenjujemo karakterima za ispis linije.
		// (https://stackoverflow.com/questions/9997767/change-the-default-padding-character-in-java-printf)
		podvuci(MINUSI);
		System.out.println("KRAJ programa.");
		System.exit(0);
	}
	
	// Testiramo program.
	// Ispisujemo komentare da bi smo zvuèali pametnije.
	// Klikamo na sve što je spelèeker podvukao crvenim i dodajemo u reènik.
	// Šta sada?...
}
