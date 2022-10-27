package s129_apstraktne_klase_i_interfejsi_oblik;

public abstract class Oblik {
	
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
	
	protected String boja, tip;
	protected int brojStrana;
	
	public Oblik() {}

	public Oblik(String boja, String tip, int brojStrana) {
		this.boja = boja;
		this.tip = tip;
		this.brojStrana = brojStrana;
	}
	
	public abstract double izracunajPovrsinu();
	
	public abstract double izracunajObim();

	public void ispisiPodatke() {
		System.out.printf("boja[%s] tip[%s] broj strana[%d]", boja, tip, brojStrana);
	}

	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
}
