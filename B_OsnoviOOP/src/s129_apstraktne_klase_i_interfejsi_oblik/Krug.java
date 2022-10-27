package s129_apstraktne_klase_i_interfejsi_oblik;

public class Krug extends Oblik {

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
	
	private double poluprecnik;
	
	public Krug() {}

	public Krug(String boja, double duzinaStranice) {
		super(boja, "krug", 0);
		this.poluprecnik = duzinaStranice;
	}
	
	public double izracunajPovrsinu() {
		return poluprecnik * poluprecnik * Math.PI;
	}
	
	public double izracunajObim() {
		return 2 * poluprecnik * Math.PI;
	}
	
	public void ispisiPodatke() {
		super.ispisiPodatke();
		System.out.printf(" poluprecnik[%.2f] povrsina[%.2f] obim[%.2f]",
				poluprecnik, izracunajPovrsinu(), izracunajObim());
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}
}
