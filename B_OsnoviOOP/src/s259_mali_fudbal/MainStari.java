package s259_mali_fudbal;

public class MainStari {

	/*
	 * Program za podršku voðenju evidencije turnira u malom fudbalu.
	 * 
	 * Kada se organizuju amaterski turniri u malom fudbalu, vodi se minimalna
	 * evidencija o igraèima, timovima i utakmicama. Za timove se beleže ime tima,
	 * grad odakle dolaze i broj igraèa u timu. Za igraèe se beleže ime, prezime,
	 * jmbg, ime tima za koji igraju. Za utakmice se beleže ime prvog tima, ime
	 * drugog tima i rezultata (neodigrana, prviPobedio, drugiPobedio, nerešeno).
	 * 
	 * Realizovati sledeæe funkcionalnosti: - uèitavanje podataka o timovima i
	 * igraèima iz datoteka (timovi.txt, igraci.txt) - dodavanje, brisanje i
	 * pretraga timova (pretraga po imenu) - dodavanje, brisanje i pretraga igraèa
	 * (pretraga po imenu) - dodavanje, brisanje i pretraga utakmica (pretraga po
	 * imenima oba tima) - izraèunavanje i ispis ukupnog fonda takmièenja i iznosa
	 * nagrada: - ukupan fond takmièenja je zbir kotizacija timova i igraèa (timovi
	 * 500 dinara, igraèi 100) - 1. nagrada 50% fonda - 2. nagrada 30% fonda - 3.
	 * nagrada 10% fonda - upis podataka o odigranim utakmicama u datoteku
	 * (utakmice.txt)
	 * 
	 * Rad sa spiskovima organizovati u odgovarajuæe klase (ListaTimova, ListaIgraca
	 * i ListaUtakmica). U test klasi stvoriti turnir, uèitati podatke o timovima i
	 * igraèima i dodati nekoliko odigranih i neodigranih utakmica. Podatke o fondu
	 * i nagradama ispisati na konzoli a podatke o utakmicama u izlaznu datoteku
	 * utakmice.txt.
	 */
	
	/*
	 * https://www.igremladih.co.rs/bs/sportovi/mali-nogomet-fudbal
	 */
	
	public static void main(String[] args) {

		String filePath = "src/s259_mali_fudbal/";

		System.out.println("PAZNJA! Zadatak nije kompletno uradjen. Pokretati na sopstvenu odgovornost.");
		System.out.println("---------------------------------------------------");
		
		ListaTimova timovi = new ListaTimova();
//		timovi.listaGenerisi(filePath);
		timovi.ucitaj(filePath);
		timovi.dodaj("Klosari", "Subotica", 8);
		timovi.dodaj("Vetrovi", "Vrbas", 6);
		timovi.dodaj("Oliva", "Malta", 6);
		timovi.stampaj();
		System.out.println("---------------------------------------------------");
		timovi.brisi("Klosari");
		timovi.stampaj();
		System.out.println("---------------------------------------------------");
		System.out.println((timovi.trazi("Vetrovi") != null) ? "Tim Vetrovi je pronadjen." : "Tim Vetrovi nije pronadjen.");
		System.out.println((timovi.trazi("Jebivetrovi") != null) ? "Tim Jebivetrovi je pronadjen." : "Tim Jebivetrovi nije pronadjen.");
		System.out.println("---------------------------------------------------");
		
		ListaIgraca igraci = new ListaIgraca(timovi.getListaTimova());
//		igraci.listaGenerisi(filePath);
		igraci.ucitaj(filePath);
		igraci.dodaj("Pera", "Zdera", "1234567890123", "Oliva");
		igraci.dodaj("Zdera", "Bandera", "1234567890123", "Oliva");
//		igraci.stampajIgrace();
//		System.out.println("---------------------------------------------------");
		igraci.brisi("Zdera");
		igraci.stampaj();
		System.out.println("---------------------------------------------------");
		System.out.println((igraci.trazi("Pera") != null) ? "Igrac Pera je pronadjen." : "Igrac Pera nije pronadjen.");
		System.out.println("---------------------------------------------------");
		
		ListaUtakmica utakmice = new ListaUtakmica(20, timovi.getListaTimova());
//		utakmice.listaGenerisi(filePath);
		utakmice.ucitaj(filePath);
		utakmice.stampaj();
		System.out.println("---------------------------------------------------");
		utakmice.dodaj("Vetrovi", "Jebivetrovi");
		utakmice.dodaj("Oliva", "Vetrovi", "neki pogresan rezultat posto nema kontrole");
		utakmice.stampaj();
		System.out.println(utakmice.trazi("Vetrovi", "Jebivetrovi"));
		System.out.println("---------------------------------------------------");
		utakmice.brisi("Oliva", "Vetrovi");
		utakmice.stampaj();
		System.out.println("---------------------------------------------------");
		System.out.println("PAZNJA! Zadatak nije kompletno uradjen. Pokretati na sopstvenu odgovornost.");
	}
}
