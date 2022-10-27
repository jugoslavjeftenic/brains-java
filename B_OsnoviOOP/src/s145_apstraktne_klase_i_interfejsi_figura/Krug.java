package s145_apstraktne_klase_i_interfejsi_figura;

public class Krug extends Oblik implements Figura {

	private double poluprecnik;
	
	public Krug() {}

	public Krug(String boja, double poluprecnik) {
		super(boja, "krug", 0);
		this.poluprecnik = poluprecnik;
	}
	
	public double izracunajPovrsinu() {
		return poluprecnik * poluprecnik * Math.PI;
	}
	
	public double izracunajObim() {
		return 2 * poluprecnik * Math.PI;
	}
	
	public void ispisiPodatke() {
		super.ispisiPodatke();
		System.out.printf(" poluprecnik[%.2f] povrsina[%.2f] obim[%.2f]", getPoluprecnik(), izracunajPovrsinu(), izracunajObim());
	}

	public double getPoluprecnik() {
		return poluprecnik;
	}

	public void setPoluprecnik(double poluprecnik) {
		this.poluprecnik = poluprecnik;
	}
}
