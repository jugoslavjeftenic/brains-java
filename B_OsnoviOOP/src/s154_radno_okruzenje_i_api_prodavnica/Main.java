package s154_radno_okruzenje_i_api_prodavnica;

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
	
	public static void main(String[] args) {

		Poslasticarnica slasticarnica = new Poslasticarnica();
		Picerija picerija = new Picerija();
		
		slasticarnica.postaviIme("Jugoslavija");
		picerija.postaviIme("Bella");
		
		slasticarnica.kupiInventar("Sladoljed");
		picerija.kupiInventar("Pica");
	}
}
