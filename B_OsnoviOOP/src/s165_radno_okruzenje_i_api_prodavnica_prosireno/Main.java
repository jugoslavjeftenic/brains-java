package s165_radno_okruzenje_i_api_prodavnica_prosireno;

import alati.RADE;

public class Main {

	/*
	 * Napraviæemo apstraktnu klasu koja izdvaja odreðenu realizaciju i interfejs koji modeluje neka ponašanja
	 * Cilj – radno okruženje kojim višekratno koristimo kod.
	 * Svaka specifièna aplikacija biæe vezana samo ugovorom,
	 * nema njenog strogog vezivanja za prilagoðene klase.
	 * 
	 * Sastoji se od:
	 * - Interfejsa Imenovanje, modeluje ponašanja, deo ugovora,
	 * - Apstraktne klase Prodavnica, izdvaja implementaciju, deo ugovora,
	 * - Klase SpisakKlijenata, koju koristimo kroz spajanje i
	 * - Nove realizacije klase Prodavnica za svakog klijenta kroz klase potomke koji je nasleðuju.
	 */
	
	/*
	 * Zadatak: dopuniti apstraktnu klasu Prodavnica, interfejs Imenovanje, klasu SpisakKlijenata,
	 * kao i izvedene klase Picerija i Poslasticarnica novim atributima i metodima i
	 * proširiti implementacije postojeæih metoda, tako da se realizuju funkcionalnosti
	 * koje bi se mogle zahtevati u svakodnevnom poslovanju.
	 * 
	 * Realizovati nove klase Restoran i Knjizara koje takoðe nasleðuju apstraktnu klasu
	 * Prodavnica i implementiraju interfejs Imenovanje.
	 * Klase testirati kreiranjem više objekata u glavnom programu i pozivanjem odgovarajuæih izabranih metoda.
	 */
	
	public static void main(String[] args) {

		Poslasticarnica slasticarnica = new Poslasticarnica();
		Picerija picerija = new Picerija();
		
		slasticarnica.postaviIme("Jugoslavija");
		picerija.postaviIme("Bella");
		
		slasticarnica.kupiInventar("Sladoljed");
		picerija.kupiInventar("Pica");
		
		System.out.println();
		SpisakKlijenata sk1 = new SpisakKlijenata(10);
		for (int i = 1; i < 12; i++)
			sk1.dodajKlijenta(RADE.generisiIme(0));
		
		slasticarnica.setSpisakKlijenata(sk1);
		
	}
}
