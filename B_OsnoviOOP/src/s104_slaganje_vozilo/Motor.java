package s104_slaganje_vozilo;

public class Motor {

	private boolean radi = false;
	private String tip;
	private int snaga;
	private int kubikaza;
	
	Motor() {}
	
	Motor(String tip, int snaga, int kubikaza){
		this.tip = tip;
		this.snaga = snaga;
		this.kubikaza = kubikaza;
	}
	
	public void ukljuci() {
		if (isRadi() == false) radi = true;
	}
	
	public void iskljuci() {
		if (isRadi()) radi = false;
	}
	
	public void stampajPodatke() {
		System.out.println("Informacije o motoru:");
		System.out.printf("\tUpaljen [%s],\n\tTip [%s],\n\tSnaga [%dkS],\n\tKubikaza [%dccm].",
				(isRadi() ? "da" : "ne"), getTip(), getSnaga(), getKubikaza());
	}

	public boolean isRadi() {
		return radi;
	}

	public void setRadi(boolean radi) {
		this.radi = radi;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public int getSnaga() {
		return snaga;
	}

	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}

	public int getKubikaza() {
		return kubikaza;
	}

	public void setKubikaza(int kubikaza) {
		this.kubikaza = kubikaza;
	}
}
