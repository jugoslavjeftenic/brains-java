package s121_polimorfizam_osoba;

import alati.RADE;

public class Main {

	/*
	 * Realizovati klasu Zena, izvedenu iz klase Osoba, koja ima i atribut devojackoPrezime.
	 * Objekti klase Zena treba da odgovaraju na poruku predstaviSe, ali dame skoro nikada ne otkrivaju svoje godine.
	 * Zato objekat klase Zena treba da ima funkciju predstaviSe, samo sto ce ona izgledati nesto drugacije,
	 * svojstveno izvedenoj klasi Zena - bez saopstavanja podataka o starosti, ali sa devojackim prezimenom.
	 * 
	 * Klase testirati kreiranjem vise objekata u glavnom programu i pozivanjem metoda za predstavljanje.
	 */
	
	public static void main(String[] args) {
		
		Zena zena1 = new Zena(RADE.generisiIme(1), RADE.generisiPrezime(), 30, RADE.generisiPrezime());
		Zena zena2 = new Zena(RADE.generisiIme(1), RADE.generisiPrezime(), zena1.getStarost() + 1, RADE.generisiPrezime());
		Zena zena3 = new Zena(RADE.generisiIme(1), RADE.generisiPrezime(), zena2.getStarost() + 1, RADE.generisiPrezime());
		Zena zena4 = new Zena(RADE.generisiIme(1), RADE.generisiPrezime(), zena3.getStarost() + 1, RADE.generisiPrezime());

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
