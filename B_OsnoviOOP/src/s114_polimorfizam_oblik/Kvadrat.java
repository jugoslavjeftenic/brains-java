package s114_polimorfizam_oblik;

public class Kvadrat extends Oblik {

	private double duzinaStranice;
	
	public Kvadrat() {}

	public Kvadrat(String boja, double duzinaStranice) {
		super(boja, "kvadrat", 4);
		this.duzinaStranice = duzinaStranice;
	}
	
	public double izracunajPovrsinu() {
		return duzinaStranice * duzinaStranice;
	}
	
	public double izracunajObim() {
		return brojStrana * duzinaStranice;
	}
	
	public void ispisiPodatke() {
		super.ispisiPodatke();
		System.out.printf(" duzina stranice[%.2f] povrsina[%.2f] obim[%.2f]", duzinaStranice, izracunajPovrsinu(), izracunajObim());
	}

	public double getDuzinaStranice() {
		return duzinaStranice;
	}

	public void setDuzinaStranice(double duzinaStranice) {
		this.duzinaStranice = duzinaStranice;
	}
}
