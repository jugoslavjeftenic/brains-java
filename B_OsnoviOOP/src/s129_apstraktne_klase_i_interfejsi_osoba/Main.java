package s129_apstraktne_klase_i_interfejsi_osoba;

import alati.RADE;

public class Main {

	static int brojRadnihDana = 30, brojIndeksa = 0;

	public static void main(String[] args) {
		
		Zaposleni zaposleni[] = new Zaposleni[2];
		zaposleni[0] =  new Zaposleni(RADE.generisiIme(0), RADE.generisiPrezime(), 25, 2000);
		zaposleni[1] =  new Zaposleni(RADE.generisiIme(0), RADE.generisiPrezime(), 50, 1500);
		
		Student studenti[] = new Student[2];
		studenti[0] =  new Student(RADE.generisiIme(0), RADE.generisiPrezime(), 25, ++brojIndeksa, 2, 3);
		studenti[1] =  new Student(RADE.generisiIme(0), RADE.generisiPrezime(), 50, ++brojIndeksa, 4, 5);
		
		Klijent klijenti[] = new Klijent[2];
		klijenti[0] =  new Klijent(RADE.generisiIme(0), RADE.generisiPrezime(), 25, 10000);
		klijenti[1] =  new Klijent(RADE.generisiIme(0), RADE.generisiPrezime(), 50, 15000);
		
		zaposleni[0].predstaviSe();
		System.out.println();
		studenti[0].predstaviSe();
		System.out.println();
		klijenti[0].predstaviSe();
	}
}
