package s259_mali_fudbal;

public class Utakmica {

	private String tim1, tim2, rezultat;
	
	public Utakmica() {
		tim1 = "";
		tim2 = "";
		rezultat = "neodigrana";
	}

	public Utakmica(String tim1, String tim2, String rezultat) {
		this.tim1 = tim1;
		this.tim2 = tim2;
		this.rezultat = rezultat;
	}
	
	// Predragova ideja.
	public String toString(){
		return String.format("%s : %s [%s]", tim1, tim2, rezultat);
	}

	public String getTim1() {
		return tim1;
	}

	public void setTim1(String tim1) {
		this.tim1 = tim1;
	}

	public String getTim2() {
		return tim2;
	}

	public void setTim2(String tim2) {
		this.tim2 = tim2;
	}

	public String getRezultat() {
		return rezultat;
	}

	public void setRezultat(String rezultat) {
		this.rezultat = rezultat;
	}
}
