package s259_mali_fudbal;

public class Turnir {

	ListaTimova timovi = new ListaTimova();
	ListaIgraca igraci = new ListaIgraca();
	ListaUtakmica utakmice = new ListaUtakmica();
	private double fond, nagrada1, nagrada2, nagrada3;
	
	public Turnir() {}

	public Turnir(ListaTimova timovi, ListaIgraca igraci, ListaUtakmica utakmice) {
		this.timovi = timovi;
		this.igraci = igraci;
		this.utakmice = utakmice;
		// Tanjina matematika.
		fond = timovi.getListaTimova().size() * 500 + igraci.getListaIgraca().size() * 100;
		nagrada1 = fond * 50.0 / 100;
		nagrada2 = fond * 30.0 / 100;
		nagrada3 = fond * 10.0 / 100;
	}
	
	public void izracunajFond() {
		fond = timovi.getListaTimova().size() * 500 + igraci.getListaIgraca().size() * 100;
		nagrada1 = fond * 50.0 / 100;
		nagrada2 = fond * 30.0 / 100;
		nagrada3 = fond * 10.0 / 100;
	}
	
	public ListaTimova getTimovi() {
		return timovi;
	}

	public void setTimovi(ListaTimova timovi) {
		this.timovi = timovi;
	}

	public ListaIgraca getIgraci() {
		return igraci;
	}

	public void setIgraci(ListaIgraca igraci) {
		this.igraci = igraci;
	}

	public ListaUtakmica getUtakmice() {
		return utakmice;
	}

	public void setUtakmice(ListaUtakmica utakmice) {
		this.utakmice = utakmice;
	}

	public double getFond() {
		return fond;
	}

	public void setFond(double fond) {
		this.fond = fond;
	}

	public double getNagrada1() {
		return nagrada1;
	}

	public void setNagrada1(double nagrada1) {
		this.nagrada1 = nagrada1;
	}

	public double getNagrada2() {
		return nagrada2;
	}

	public void setNagrada2(double nagrada2) {
		this.nagrada2 = nagrada2;
	}

	public double getNagrada3() {
		return nagrada3;
	}

	public void setNagrada3(double nagrada3) {
		this.nagrada3 = nagrada3;
	}
}
