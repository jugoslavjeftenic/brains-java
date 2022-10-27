package s998_apstraktne_klase_i_interfejsi_osoba;

public class Klijent extends Osoba {

	/*
	 * -racunStanje:double
	 * ---------------------
	 * +Klijent
	 * +prikaziStanje:void
	 * +prebaciNovac:void
	 * +primiNovac:void
	*/
	
	private double racunStanje;
	
	public Klijent() {}

	public Klijent(String ime, String prezime, int starost, double racunStanje) {
		super(ime, prezime, starost);
		this.racunStanje = racunStanje;
	}

	@Override
	public void predstaviSe() {
		System.out.printf("Ime: %s\nPrezime: %s\nStarost: %s.\nStanje racuna: %.2f\n", 
				pribaviIme(), pribaviPrezime(), pribaviStarost(), pribaviRacunStanje());
	}
	
	public void prikaziStanje() {
		System.out.printf
			("Klijent %s %s ima na racunu %.2f dukata.\n",
			 pribaviIme(), pribaviPrezime(), pribaviRacunStanje());
	}
	
	public void prebaciNovac(Klijent klijent, double suma) {
		this.racunStanje -= suma;
		klijent.racunStanje += suma;
	}
	
	public void primiNovac(Klijent klijent, double suma) {
		this.racunStanje += suma;
		klijent.racunStanje -= suma;
	}

	public double pribaviRacunStanje() {
		return racunStanje;
	}

	public void postaviRacunStanje(double racunStanje) {
		this.racunStanje = racunStanje;
	}
}
