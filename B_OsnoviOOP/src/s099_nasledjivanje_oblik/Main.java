package s099_nasledjivanje_oblik;

import alati.RADE;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * Klasu testirati kreiranjem više objekata u glavnom programu i
		 * pozivanjem odgovarajuæih metoda. Nacrtati i dijagram klasa.
		 */

		Oblik kv = new Kvadrat(RADE.generisiBoju(), RADE.mrRobot(1.0, 10.0));
		Oblik kr = new Krug(RADE.generisiBoju(), RADE.mrRobot(1.0, 10.0));
		
		kv.ispisiPodatke();
		System.out.println();
		kr.ispisiPodatke();
		System.out.println();
	}
}
