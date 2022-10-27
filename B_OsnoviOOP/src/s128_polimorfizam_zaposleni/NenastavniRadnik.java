package s128_polimorfizam_zaposleni;

public class NenastavniRadnik extends Zaposleni{

<<<<<<< HEAD
	private String radnoMesto;
	private int godineStaza;

	public NenastavniRadnik() {}

	public NenastavniRadnik(String ime, String prezime, String radnoMesto, int godineStaza) {
		super(ime, prezime, 0);
		this.radnoMesto = radnoMesto;
		this.godineStaza = godineStaza;
	}

	public void predstaviSe() {
		System.out.printf("%s %s, %s, godine radnog staza[%d], primanja %.2f.",
			super.getIme(), super.getPrezime(), radnoMesto, godineStaza, racunajPlatu());
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

	private String radnoMesto;
	private int godineStaza;

	public NenastavniRadnik() {}

	public NenastavniRadnik(String ime, String prezime, String radnoMesto, int godineStaza) {
		super(ime, prezime, 0);
		this.radnoMesto = radnoMesto;
		this.godineStaza = godineStaza;
	}

	public void predstaviSe() {
		System.out.printf("%s %s, %s, godine radnog staza[%d], primanja %.2f.",
				super.getIme(), super.getPrezime(), radnoMesto, godineStaza, racunajPlatu());
>>>>>>> branch 'master' of https://github.com/jugoslavjeftenic/brains.git
	}
	
	public double racunajPlatu() {
		return 30000 + godineStaza * 500;
	}

	public String getRadnoMesto() {
		return radnoMesto;
	}

	public void setRadnoMesto(String radnoMesto) {
		this.radnoMesto = radnoMesto;
	}

	public int getGodineStaza() {
		return godineStaza;
	}

	public void setGodineStaza(int godineStaza) {
		this.godineStaza = godineStaza;
	}
}
