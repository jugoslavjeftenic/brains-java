package s111_polimorfizam_oblik;

public class Oblik {
	
	protected String boja, tip;
	protected int brojStrana;
	
	public Oblik() {}

	public Oblik(String boja, String tip, int brojStrana) {
		this.boja = boja;
		this.tip = tip;
		this.brojStrana = brojStrana;
	}

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
