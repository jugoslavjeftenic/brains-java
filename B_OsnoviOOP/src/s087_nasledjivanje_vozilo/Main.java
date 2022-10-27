package s087_nasledjivanje_vozilo;

import alati.RADE;

public class Main {

	/*
	 * Prethodne klase testirati kreiranjem dva objekta klase Osoba (iz prethodnog
	 * primera), i po jednog objekta klase Automobil, Kamion i Motocikl.
	 * • Potom odštampati podatke o kreiranim objektima i izvršiti prenos vlasništva svakog
	 * od vozila sa jednog vlasnika na drugog. Zatim ponovo prikazati podatke o vozilima.
	 */

	public static void main(String[] args) {
		
		Osoba o1 = new Osoba(RADE.generisiIme(0), RADE.generisiPrezime(), RADE.mrRobot(18, 50));
		Osoba o2 = new Osoba(RADE.generisiIme(0), RADE.generisiPrezime(), RADE.mrRobot(18, 50));
		
		Automobil a = new Automobil("Zastava", "750", "SU-001", 1972, o1, 2);
		Kamion k = new Kamion("TAM", "T3 75", "SU-002", 1962, o1, 2);
		Motocikl m = new Motocikl("Tomos", "APN4", "SU-003", 1982, o1, false);
		
		a.stampajPodatke();
		System.out.println();
		k.stampajPodatke();
		System.out.println();
		m.stampajPodatke();
		System.out.println();

		System.out.println();
		System.out.print("Vozila se prenose u vlasnistvo ");
		o2.predstaviSe();
		a.prenosVlasnistva(o2);
		k.prenosVlasnistva(o2);
		m.prenosVlasnistva(o2);
		System.out.println();

		a.stampajPodatke();
		System.out.println();
		k.stampajPodatke();
		System.out.println();
		m.stampajPodatke();
		System.out.println();
	}
}
