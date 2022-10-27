package s128_polimorfizam_zaposleni;

import alati.RADE;

public class Main {

	/*
	 * Realizovati klase Nastavnik, Asistent i NenastavniRadnik, izvedene nasleðivanjem iz klase Zaposleni.
	 * Klasa Nastavnik ima dodatne atribute zvanje (tipa String) i brojSCIRadova (tipa int)
	 * Klasa Asistent ima dodatne atribute mentor (tipa String) i godinaDoktorskihStudija (tipa int)
	 * Klasa NenastavniRadnik ima dodatne atribute radnoMesto (tipa String) i godineStaza (tipa int).
	 * Za svaku od klasa realizovati metodu predstaviSe i racunajPlatu uzimajuæi u obzir
	 * specifiène atributa za svaku od klasa.
	 * Napomena: platu za nastavnike raèunati kao 60000 + brojSCIRadova * 3000,
	 * kod asistenata kao 40000 + godinaDoktorskihStudija * 2000,
	 * a kod nenastavnih radnika kao 30000 + godineStaza * 500.
	 * 
	 * Klase testirati kreiranjem više objekata u glavnom programu i
	 * pozivanjem metoda za predstavljanje i raèunanje plate.
	 */

	public static void main(String[] args) {
		
		Nastavnik[] nastavnici = new Nastavnik[3];
		System.out.println("Nastavnici");
		for (int i = 0; i < nastavnici.length; i++) {
			nastavnici[i] = new Nastavnik(RADE.generisiIme(0), RADE.generisiPrezime(), RADE.generisiZanimanje(1), RADE.mrRobot(1, 5));
			System.out.printf("%2d. ", i + 1);
			nastavnici[i].predstaviSe();
			System.out.println();
		}
		
		System.out.println();
		
		Asistent[] asistenti = new Asistent[5];
		System.out.println("Asistenti");
		for (int i = 0; i < asistenti.length; i++) {
			int nastavnik = RADE.mrRobot(0, nastavnici.length - 1);
			asistenti[i] = new Asistent(RADE.generisiIme(0), RADE.generisiPrezime(),
				nastavnici[nastavnik].getZvanje() + " " + nastavnici[nastavnik].getIme() + " " +
				nastavnici[nastavnik].getPrezime(), RADE.mrRobot(1, 5));
			System.out.printf("%2d. ", i + 1);
			asistenti[i].predstaviSe();
			System.out.println();
		}
		
		System.out.println();
		
		NenastavniRadnik[] radnici = new NenastavniRadnik[10];
		System.out.println("Nenastavni radnici");
		for (int i = 0; i < radnici.length; i++) {
			radnici[i] = new NenastavniRadnik(RADE.generisiIme(0), RADE.generisiPrezime(), RADE.generisiZanimanje(0), RADE.mrRobot(1, 30));
			System.out.printf("%2d. ", i + 1);
			radnici[i].predstaviSe();
			System.out.println();
		}
	}
}
