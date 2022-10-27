package s998_apstraktne_klase_i_interfejsi_restoran;

public abstract class Restoran {

	private String imeRestorana;
	private String[] meni;
	private Osoba vlasnik;
	
	Restoran() {}

	public Restoran(String imeRestorana, String[] meni, Osoba vlasnik) {
		this.imeRestorana = imeRestorana;
		this.meni = meni;
		this.vlasnik = vlasnik;
	}
	
	public abstract String[] dobaviMeni();
	
	public abstract double naruciStavku();
	
	public String getImeRestorana() {
		return imeRestorana;
	}

	public void setImeRestorana(String imeRestorana) {
		this.imeRestorana = imeRestorana;
	}

	public String[] getMeni() {
		return meni;
	}

	public void setMeni(String[] meni) {
		this.meni = meni;
	}

	public Osoba getVlasnik() {
		return vlasnik;
	}

	public void setVlasnik(Osoba vlasnik) {
		this.vlasnik = vlasnik;
	}
}
