package s129_apstraktne_klase_i_interfejsi_osoba;

public class Zaposleni extends Osoba {

	/*
	 * -qRM:double
	 * -plata:double
	 * ---------------------
	 * +Zaposleni
	 * +racunajPlatu:void
	 * +stampajPlatu:void
	*/
	
	private double qRM, plata;
	
	public Zaposleni() {}

	public Zaposleni(String ime, String prezime, int starost, double qRM) {
		super(ime, prezime, starost);
		this.qRM = qRM;
	}
	
	@Override
	public void predstaviSe() {
		racunajPlatu(30);
		System.out.printf("Ime: %s\nPrezime: %s\nStarost: %s.\nPlata: %.2f\n",
				pribaviIme(), pribaviPrezime(), pribaviStarost(), pribaviPlata());
	}

	public void racunajPlatu(int brojDana) {
		plata = pribaviQRM() * brojDana;
	}
	
	public void stampajPlatu(int brojDana) {
		racunajPlatu(brojDana);
		System.out.printf("Zaposleni %s %s, na radnom mestu sa koeficijentom %.2f ima platu %.2f\n",
			pribaviIme(), pribaviPrezime(), pribaviQRM(), pribaviPlata());
	}

	public double pribaviQRM() {
		return qRM;
	}

	public void postaviQRM(double qRM) {
		this.qRM = qRM;
	}

	public double pribaviPlata() {
		return plata;
	}

	public void postaviPlata(double plata) {
		this.plata = plata;
	}
}
