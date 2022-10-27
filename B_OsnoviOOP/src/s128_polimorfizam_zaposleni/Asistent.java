package s128_polimorfizam_zaposleni;

public class Asistent extends Zaposleni {

<<<<<<< HEAD
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
=======
	/*
	 * Realizovati klase Nastavnik, Asistent i NenastavniRadnik, izvedene nasleðivanjem iz klase Zaposleni.
	 * 
	 * Klasa Nastavnik ima dodatne atribute zvanje (tipa String) i brojSCIRadova (tipa int)
	 * Klasa Asistent ima dodatne atribute mentor (tipa String) i godinaDoktorskihStudija (tipa int)
	 * Klasa NenastavniRadnik ima dodatne atribute radnoMesto (tipa String) i godineStaza (tipa int).
	 * 
	 * Za svaku od klasa realizovati metodu predstaviSe i racunajPlatu uzimajuæi u obzir
	 * specifiène atributa za svaku od klasa.
	 * 
	 * Napomena: platu za nastavnike raèunati kao 60000 + brojSCIRadova * 3000,
	 * kod asistenata kao 40000 + godinaDoktorskihStudija * 2000,
	 * a kod nenastavnih radnika kao 30000 + godineStaza * 500.
	 * 
	 * • Klase testirati kreiranjem više objekata u glavnom programu i
	 * pozivanjem metoda za predstavljanje i raèunanje plate.
	 */

	private String mentor;
	private int godinaDoktorskihStudija;
	
	Asistent() {}

	public Asistent(String ime, String prezime, String mentor, int godinaDoktorskihStudija) {
		super(ime, prezime, 0);
		this.mentor = mentor;
		this.godinaDoktorskihStudija = godinaDoktorskihStudija;
	}
	
	public void predstaviSe() {
		System.out.printf("%s %s, mentor %s, godina doktorskih studija[%d], primanja %.2f.",
				super.getIme(), super.getPrezime(), mentor, godinaDoktorskihStudija, racunajPlatu());
>>>>>>> branch 'master' of https://github.com/jugoslavjeftenic/brains.git
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
