package s154_radno_okruzenje_i_api_prodavnica;

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
	
	public static void main(String[] args) {

		Poslasticarnica slasticarnica = new Poslasticarnica();
		Picerija picerija = new Picerija();
		
		slasticarnica.setIme("Jugoslavija");
		picerija.setIme("Bella");
		
		slasticarnica.kupiInventar("Sladoljed");
		picerija.kupiInventar("Pica");
	}
}
