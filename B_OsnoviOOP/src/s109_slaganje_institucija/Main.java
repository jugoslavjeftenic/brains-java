package s109_slaganje_institucija;

import alati.RADE;

public class Main {
	
	/*
	 * Osmisliti, nacrtati dijagrame klasa i realizovati u Javi klase
	 * Institucija, Ucionica, Zaposleni (koja nasleðuje klasu Osoba) i Racunar
	 * koje bi se mogle koristiti u programu za evidenciju zaposlenih i inventara neke obrazovne institucije.
	 * Spiskove ucionica, zaposlenih i racunara po ucionicama cuvati u odgovarajuæim nizovima
	 * (svaki sa najviše 20 clanova).
	 * 
	 * U kojim meðusobnim odnosima se nalaze pomenute klase (nasleðivanje, asocijacija, agregacija, kompozicija)?
	 * 
	 * Klase testirati kreiranjem objekata u glavnom programu i pozivanjem izabranih metoda.
	 * Nacrtati UML dijagram klasa resenja.
	 */

	static int maksBrojUcionica = 20, maksBrojZaposlenih = 20, maksBrojRacunara = 20;

	public static void main(String[] args) {
		
		Institucija i = new Institucija(maksBrojUcionica, maksBrojZaposlenih);
		
		Zaposlenik z1 = new Zaposlenik(RADE.generisiIme(0), RADE.generisiPrezime(), RADE.generisiJMBG(), 1.1, 30);
		Zaposlenik z2 = new Zaposlenik(RADE.generisiIme(0), RADE.generisiPrezime(), RADE.generisiJMBG(), 2.2, 30);
		Zaposlenik z3 = new Zaposlenik(RADE.generisiIme(0), RADE.generisiPrezime(), RADE.generisiJMBG(), 3.3, 30);
		Zaposlenik z4 = new Zaposlenik(RADE.generisiIme(0), RADE.generisiPrezime(), RADE.generisiJMBG(), 4.4, 30);
		
		i.dodajZaposlenika(z1);
		i.dodajZaposlenika(z2);
		i.dodajZaposlenika(z3);
		i.dodajZaposlenika(z4);
		
		Ucionica u1 = new Ucionica(0, 1, maksBrojRacunara);
		Ucionica u2 = new Ucionica(1, 2, maksBrojRacunara);
		Ucionica u3 = new Ucionica(2, 3, maksBrojRacunara);
		
		i.dodajUcionicu(u1);
		i.dodajUcionicu(u2);
		i.dodajUcionicu(u3);
		
		Racunar r1 = new Racunar("Galaksija", "Zilog Z80A", 3.072, 6);
		Racunar r2 = new Racunar("ZX Spectrum 48", "Zilog Z80", 3.5, 48);
		Racunar r3 = new Racunar("Commodore 64C", "MOS Technology 6510", 0.985, 64);
		Racunar r4 = new Racunar("Amstrad CPC 464", "Zilog Z80", 4.0, 64);
		
		u1.dodajRacunar(r4);
		u1.dodajRacunar(r2);
		u1.dodajRacunar(r2);
		u1.dodajRacunar(r2);
		
		u2.dodajRacunar(r3);
		u2.dodajRacunar(r3);
		u2.dodajRacunar(r1);
		
		System.out.println("*****   Zaposleni   *****");
		i.inventarZaposlenih();
		System.out.println();
		
		System.out.println("*****   Ucionice   *****");
		i.inventarUcionica();
		System.out.println();
		
		System.out.println("*****   Racunari   *****");
		u1.stampajInventar();
		u2.stampajInventar();
		u3.stampajInventar();
		System.out.println();
	}
}
