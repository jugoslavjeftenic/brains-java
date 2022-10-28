package s128_polimorfizam_zaposleni;

public class Asistent extends Zaposleni {

	private String mentor;
	private int godinaDoktorskihStudija;
	
	public Asistent() {}

	public Asistent(String ime, String prezime, String mentor, int godinaDoktorskihStudija) {
		super(ime, prezime, 0);
		this.mentor = mentor;
		this.godinaDoktorskihStudija = godinaDoktorskihStudija;
	}
	
	public void predstaviSe() {
		System.out.printf("%s %s, mentor %s, godina doktorskih studija[%d], primanja %.2f.",
			super.getIme(), super.getPrezime(), mentor, godinaDoktorskihStudija, racunajPlatu());
	}
	
	public double racunajPlatu() {
		return 40000 + godinaDoktorskihStudija * 2000;
	}

	public String getMentor() {
		return mentor;
	}

	public void setMentor(String mentor) {
		this.mentor = mentor;
	}

	public int getGodinaDoktorskihStudija() {
		return godinaDoktorskihStudija;
	}

	public void setGodinaDoktorskihStudija(int godinaDoktorskihStudija) {
		this.godinaDoktorskihStudija = godinaDoktorskihStudija;
	}
}
