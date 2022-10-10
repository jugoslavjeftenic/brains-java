package s111_polimorfizam_oblik;

import alati.RADE;

public class Main {

	/*
	 * Realizovati klasu Oblik sa atributima boja (String), tip (String), brojStrana
	 * (int), standardnim konstruktorom i konstruktorom koji postavlja inicijalne
	 * vrednosti, kao i metodama za promenu boje oblika i štampanje podataka o
	 * obliku. • Realizovati klase Kvadrat (dodatni atribut duzinaStranice tipa
	 * double) i Krug (dodatni atribut poluprecnik tipa double) koje nasleðuju klasu
	 * Oblik i implementiraju metode za raèunanje površine i obima.
	 * 
	 * • Klase testirati kreiranjem više objekata u glavnom programu i pozivanjem metoda za
	 * raèunanje površine i obima i štampu podataka.
	 */
	
	public static void main(String[] args) {
		
		Kvadrat kvadrat = new Kvadrat(RADE.generisiBoju(), RADE.mrRobot(1.0, 21));
		Krug krug = new Krug(RADE.generisiBoju(), RADE.mrRobot(1.0, 10.5));

		kvadrat.ispisiPodatke();
		System.out.println();
		System.out.println("Povrsina kvadrata: " + kvadrat.izracunajPovrsinu());
		System.out.println("Obim kvadrata: " + kvadrat.izracunajObim());
		
		System.out.println();

		krug.ispisiPodatke();
		System.out.println();
		System.out.println("Povrsina kruga: " + krug.izracunajPovrsinu());
		System.out.println("Obim kruga: " + krug.izracunajObim());
	}
}
