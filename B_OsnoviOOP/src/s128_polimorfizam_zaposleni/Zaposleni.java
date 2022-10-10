package s128_polimorfizam_zaposleni;

class Zaposleni extends Osoba {
	
	/*
	 * Zadatak: Realizovati klasu Zaposleni sa atributima ime, prezime,
	 * koefRadnogMesta, plata, standardnim konstruktorom i konstruktorom koji
	 * postavlja inicijalne vrednosti atributa, metodom za raèunanje plate na osnovu
	 * broja radnih dana u mesecu i radnog mesta, kao i metodom za štampanje
	 * podataka o zaposlenom i njegovoj plati
	 * Formula za raèunanje plate: plata = koefRadnogMesta * brojRadnihDana * 100
	 */
	
	protected double qRM;
	
	public Zaposleni() {}
	
	public Zaposleni(String ime, String prezime, double qRM) {
		super(ime, prezime, 0);
		this.qRM = qRM;
	}
	
	public double racunajPlatu(int brojDana) {
		return 100 * qRM * brojDana;
	}
	
	public void stampajPlatu(int brojDana) {
		System.out.printf
			("%s %s na radnom mestu sa koeficijentom %.2f ima platu %.2f.",
			 ime, prezime, qRM, racunajPlatu(brojDana));
	}

	public double getqRM() {
		return qRM;
	}

	public void setqRM(double qRM) {
		this.qRM = qRM;
	}
}
