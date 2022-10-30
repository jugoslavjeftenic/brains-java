package s165_radno_okruzenje_i_api_prodavnica_prosireno;

import alati.RADE;

public class Main {

	/*
	 * Napravicemo apstraktnu klasu koja izdvaja odredjenu realizaciju i interfejs koji modeluje neka ponasanja
	 * Cilj – radno okruzenje kojim visekratno koristimo kod.
	 * Svaka specifièna aplikacija bice vezana samo ugovorom, nema njenog strogog vezivanja za prilagodjene klase.
	 * 
	 * Sastoji se od:
	 * - Interfejsa Imenovanje, modeluje ponasanja, deo ugovora,
	 * - Apstraktne klase Prodavnica, izdvaja implementaciju, deo ugovora,
	 * - Klase SpisakKlijenata, koju koristimo kroz spajanje i
	 * - Nove realizacije klase Prodavnica za svakog klijenta kroz klase potomke koji je nasledjuju.
	 */
	
	/*
	 * Zadatak: dopuniti apstraktnu klasu Prodavnica, interfejs Imenovanje, klasu SpisakKlijenata,
	 * kao i izvedene klase Picerija i Poslasticarnica novim atributima i metodima i prosiriti implementacije
	 * postojecih metoda, tako da se realizuju funkcionalnosti koje bi se mogle zahtevati u svakodnevnom poslovanju.
	 * 
	 * Realizovati nove klase Restoran i Knjizara koje takodje nasledjuju apstraktnu klasu Prodavnica i
	 * implementiraju interfejs Imenovanje.
	 * 
	 * Klase testirati kreiranjem vise objekata u glavnom programu i pozivanjem odgovarajucih izabranih metoda.
	 */
	
	public static void main(String[] args) {

		Poslasticarnica poslasticarnica = new Poslasticarnica();
		Picerija picerija = new Picerija();
		
		poslasticarnica.setIme("Jugoslavija");
		picerija.setIme("Bella");
		
		poslasticarnica.kupiInventar("Sladoljed");
		picerija.kupiInventar("Pica");
		
		System.out.println();
		SpisakKlijenata sk1 = new SpisakKlijenata(10);
		for (int i = 1; i < 12; i++)
			sk1.dodajKlijenta(RADE.generisiIme(0));
		
		poslasticarnica.setSpisakKlijenata(sk1);
	}
}
