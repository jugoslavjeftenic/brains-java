package s149_radno_okruzenje_i_api_prodavnica;

import alati.RADE;

public class Main {

	public static void main(String[] args) {
		
		Picerija picerija = new Picerija("Bella");
		
		System.out.println(picerija.getIme());
		picerija.setIme("Krivi toranj");
		System.out.println(picerija.getIme());
		
		String[] meni = picerija.uzmiInventar();
		System.out.println("Meni:");
		for (int i = 0; i < meni.length; i++) {
			System.out.println("\t" + meni[i]);
		}
		
		picerija.kupiInventar("madjarica");
		
		String[] imenaKlijenata = new String[5];
		for (int i = 0; i < imenaKlijenata.length; i++) {
			imenaKlijenata[i] = RADE.generisiIme(0);
		}
		SpisakKlijenata klijenti = new SpisakKlijenata(imenaKlijenata);
		
		for (int i = 0; i < klijenti.getKlijenti().length; i++) {
			System.out.print(klijenti.getKlijenti()[i] + ", ");
		}
		
		System.out.println();
		klijenti.dodajKlijenta("Jovica");
		
		for (int i = 0; i < klijenti.getKlijenti().length; i++) {
			System.out.print(klijenti.getKlijenti()[i] + ", ");
		}
	}
}
