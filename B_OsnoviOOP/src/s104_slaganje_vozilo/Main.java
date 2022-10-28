package s104_slaganje_vozilo;

import alati.RADE;

public class Main {
	
	/*
	 * Agregacija Vozilo-Motor, asocijacija Vozilo-Osoba
	 */
	
	public static void main(String[] args) {
		
		Motor mb750 = new Motor("benzin", 25, 750);
		Motor mb1100 = new Motor("benzin", 55, 1100);
		Motor mb1300 = new Motor("benzin", 65, 1300);
		Motor md1600 = new Motor("benzin", 65, 1600);
		Motor md2000 = new Motor("benzin", 100, 2000);

		Osoba vlasnik1 = new Osoba (RADE.generisiIme(0), RADE.generisiPrezime(), RADE.mrRobot(18, 70));
		Osoba vlasnik2 = new Osoba (RADE.generisiIme(0), RADE.generisiPrezime(), RADE.mrRobot(18, 70));
		Osoba vlasnik3 = new Osoba (RADE.generisiIme(0), RADE.generisiPrezime(), RADE.mrRobot(18, 70));
		Osoba vlasnik4 = new Osoba (RADE.generisiIme(0), RADE.generisiPrezime(), RADE.mrRobot(18, 70));
		Osoba vlasnik5 = new Osoba (RADE.generisiIme(0), RADE.generisiPrezime(), RADE.mrRobot(18, 70));
				
		Automobil fica = new Automobil("Zastava", "750", 1972, "SU-001", mb750, vlasnik1, 2);
		Automobil stojadin = new Automobil("Zastava", "101", 1982, "SU-101", mb1100, vlasnik2,3);
		Automobil lada = new Automobil("Lada", "VAZ-2101", 1985, "SU-USSR", mb1300, vlasnik3,4);
		Automobil golf = new Automobil("Volkswagen", "Golf Mk2", 1990, "SU-sarajlija1", md1600, vlasnik4, 5);
		Automobil audi = new Automobil("Audi", "80", 1992, "SU-gangstabajster", md2000, vlasnik5, 4);

		fica.stampajPodatke();
		stojadin.stampajPodatke();
		lada.stampajPodatke();
		golf.stampajPodatke();
		audi.stampajPodatke();
	}
}
