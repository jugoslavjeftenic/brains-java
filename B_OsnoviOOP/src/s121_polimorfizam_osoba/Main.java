package s121_polimorfizam_osoba;

import alati.RADE;

public class Main {

	/*
	 * Realizovati klasu Zena, izvedenu iz klase Osoba, koja ima i atribut
	 * devojackoPrezime. Objekti klase Zena treba da odgovaraju na poruku
	 * predstaviSe, ali dame skoro nikada ne otkrivaju svoje godine. Zato objekat
	 * klase Zena treba da ima funkciju predstaviSe, samo što æe ona izgledati nešto
	 * drugaèije, svojstveno izvedenoj klasi Zena – bez saopštavanja podataka o
	 * starosti, ali sa devojaèkim prezimenom.
	 * 
<<<<<<< HEAD
	 * Klase testirati kreiranjem više objekata u glavnom programu i pozivanjem metoda za predstavljanje.
	 */
	
	public static void main(String[] args) {
		
		Zena zena1 = new Zena(RADE.generisiIme(1), RADE.generisiPrezime(), 30, RADE.generisiPrezime());
		Zena zena2 = new Zena(RADE.generisiIme(1), RADE.generisiPrezime(), zena1.getStarost() + 1, RADE.generisiPrezime());
		Zena zena3 = new Zena(RADE.generisiIme(1), RADE.generisiPrezime(), zena2.getStarost() + 1, RADE.generisiPrezime());
		Zena zena4 = new Zena(RADE.generisiIme(1), RADE.generisiPrezime(), zena3.getStarost() + 1, RADE.generisiPrezime());
=======
	 * • Klase testirati kreiranjem više objekata u glavnom programu i pozivanjem metoda za predstavljanje.
	 */
	
	public static void main(String[] args) {
		
//		String ime, String prezime, int starost, String devojackoPrezime
		Zena zena1 = new Zena(RADE.generisiIme(1), RADE.generisiPrezime(), 30, RADE.generisiPrezime());
		Zena zena2 = new Zena(RADE.generisiIme(1), RADE.generisiPrezime(), zena1.getStarost() + 1,
				RADE.generisiPrezime());
		Zena zena3 = new Zena(RADE.generisiIme(1), RADE.generisiPrezime(), zena2.getStarost() + 1,
				RADE.generisiPrezime());
		Zena zena4 = new Zena(RADE.generisiIme(1), RADE.generisiPrezime(), zena3.getStarost() + 1,
				RADE.generisiPrezime());
>>>>>>> branch 'master' of https://github.com/jugoslavjeftenic/brains.git

		System.out.println("Ime, devojacko prezime, udato prezime.");
		System.out.println();
		zena1.predstaviSe();
		System.out.println();
		zena2.predstaviSe();
		System.out.println();
		zena3.predstaviSe();
		System.out.println();
		zena4.predstaviSe();
	}
}
