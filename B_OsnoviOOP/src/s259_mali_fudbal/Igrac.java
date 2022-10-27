package s259_mali_fudbal;

public class Igrac {
	
	private String ime, prezime, jmbg, tim;
	
	public Igrac() {}
	
	public Igrac(String ime, String prezime, String jmbg, String tim) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.tim = tim;
	}
	
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getPrezime() {
		return prezime;
	}
	
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public String getJmbg() {
		return jmbg;
	}
	
	public void setJmbg(String jmbg) {
		this.jmbg = jmbg;
	}
	
	public String getTim() {
		return tim;
	}
	
	public void setTim(String tim) {
		this.tim = tim;
	}
}
