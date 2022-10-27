package s129_apstraktne_klase_i_interfejsi_restoran;

public class Poslasticarnica extends Restoran {

	private int brojJagodaNaTorti;

	public Poslasticarnica() {}

	public Poslasticarnica(String imeRestorana, String[] meni, Osoba vlasnik, int brojJagodaNaTorti) {
		super(imeRestorana, meni, vlasnik);
		this.brojJagodaNaTorti = brojJagodaNaTorti;
	}


	@Override
	public String[] dobaviMeni() {
		return getMeni();
	}

	@Override
	public double naruciStavku() {
		return 0;
	}

	public int getBrojJagodaNaTorti() {
		return brojJagodaNaTorti;
	}

	public void setBrojJagodaNaTorti(int brojJagodaNaTorti) {
		this.brojJagodaNaTorti = brojJagodaNaTorti;
	}
}
