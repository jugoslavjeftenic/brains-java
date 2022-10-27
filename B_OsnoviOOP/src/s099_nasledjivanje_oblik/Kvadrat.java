package s099_nasledjivanje_oblik;

public class Kvadrat extends Oblik {

	/*
	 * Realizovati klase Kvadrat (dodatni atribut duzinaStranice tipa double) i
	 * Krug (dodatni atribut poluprecnik tipa double) koje nasleðuju klasu Oblik i
	 * implementiraju metode za raèunanje površine.
	 */

	private double duzinaStranice;
	
	public Kvadrat() {}

	public Kvadrat(String boja, double duzinaStranice) {
		super(boja, "kvadrat", 4);
		this.duzinaStranice = duzinaStranice;
	}

	public double racunajPovrsinu() {
		return duzinaStranice * duzinaStranice;
	}
	
	public double racunajObim() {
		return duzinaStranice * brojStrana;
	}
	
	public void ispisiPodatke() {
		super.ispisiPodatke();
		System.out.printf("Povrsina %.2f, obim %.2f, duzina stranice %.2f.\n",
			racunajPovrsinu(), racunajObim(), getDuzinaStranice());
	}

	public double getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(double duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}
}
