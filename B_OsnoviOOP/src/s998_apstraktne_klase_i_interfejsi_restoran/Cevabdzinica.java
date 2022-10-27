package s998_apstraktne_klase_i_interfejsi_restoran;

public class Cevabdzinica extends Restoran {

	private String vrstaCevapa;
	
	public Cevabdzinica() {}

	public Cevabdzinica(String imeRestorana, String[] meni, Osoba vlasnik, String vrstaCevapa) {
		super(imeRestorana, meni, vlasnik);
		this.vrstaCevapa = vrstaCevapa;
	}

	@Override
	public String[] dobaviMeni() {
		return getMeni();
	}

	@Override
	public double naruciStavku() {
		return 0;
	}

	public String getVrstaCevapa() {
		return vrstaCevapa;
	}

	public void setVrstaCevapa(String vrstaCevapa) {
		this.vrstaCevapa = vrstaCevapa;
	}
}
