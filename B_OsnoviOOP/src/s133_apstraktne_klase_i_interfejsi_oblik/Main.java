package s133_apstraktne_klase_i_interfejsi_oblik;

import alati.RADE;

public class Main {

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
