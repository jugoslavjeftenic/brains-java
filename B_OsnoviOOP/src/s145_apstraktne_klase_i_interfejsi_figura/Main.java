package s145_apstraktne_klase_i_interfejsi_figura;

import alati.RADE;

public class Main {

	/*
	 * Realizovati interfejs Figura sa metodama za raèunanje površine i obima.
	 * Izmeniti klase Kvadrat i Krug tako da implementiraju interfejs Figura i nasleðuju klasu Oblik.
	 * Klase testirati kreiranjem više objekata u glavnom programu i pozivanjem metoda
	 * za raèunanje površine i obima i štampu podataka.
	 */
	
	public static void main(String[] args) {
		
		Kvadrat kv = new Kvadrat(RADE.generisiBoju(), 10.1);
		Krug kr = new Krug(RADE.generisiBoju(), 2.2);
		
		Figura fkv = kv;
		Figura fkr = kr;
		
		ispisFigure(kv);
		ispisFigure(fkv);
		ispisFigure(kr);
		ispisFigure(fkr);
		
		kv.ispisiPodatke();
		System.out.println();
		kr.ispisiPodatke();
		System.out.println();
		
	}

	public static void ispisFigure(Figura figura) {
		System.out.printf("povrsina [%.2f], obim [%.2f]\n", figura.izracunajPovrsinu(), figura.izracunajObim());
	}
}
