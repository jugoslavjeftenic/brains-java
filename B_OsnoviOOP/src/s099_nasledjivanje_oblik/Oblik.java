package s099_nasledjivanje_oblik;

public class Oblik {

	protected String boja, tip;
	protected int brojStrana;
	protected double povrsina;
	
	public Oblik() {}
	
	public Oblik(String boja, String tip, int brojStrana) {
		this.boja = boja;
		this.tip = tip;
		this.brojStrana = brojStrana;
	}

	public Oblik(String boja, String tip, int brojStrana, double povrsina) {
		this.boja = boja;
		this.tip = tip;
		this.brojStrana = brojStrana;
		this.povrsina = povrsina;
	}
	
	public void ispisiPodatke() {
		System.out.printf("Oblik %s, boje %s, ima %d strane.\n", getTip(), getBoja(), getBrojStrana());
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

	public int getBrojStrana() {
		return brojStrana;
	}

	public void setBrojStrana(int brojStrana) {
		this.brojStrana = brojStrana;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}
}
