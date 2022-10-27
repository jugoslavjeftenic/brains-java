package s260_banka;

public class Racun {

	private float stanje;
	private boolean activan;
	private String valuta;
	
	public Racun() {
		stanje = 0;
		activan = true;
		valuta = "RSD";
	}

	public float getStanje() {
		return stanje;
	}

	public void setStanje(float stanje) {
		this.stanje = stanje;
	}

	public boolean isActivan() {
		return activan;
	}

	public void setActivan(boolean activan) {
		this.activan = activan;
	}

	public String getValuta() {
		return valuta;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
	}
}
