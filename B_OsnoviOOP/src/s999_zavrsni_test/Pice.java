package s999_zavrsni_test;

public abstract class Pice {
	
	/*
	 * (7 bd) Napisati apstraktnu klasu Pice koja ima atribute:
	 * ime (tipa String), vrsta (tipa String) i brojSastojaka (tipa int);
	 * metode za pribavljanje i postavljanje svih atributa (getere i setere),
	 * konstruktor kojim se postavljaju vrednosti svih atributa i
	 * apstraktne metode za pravljenje i konzumiranje.
	 * Kod svih atributa i metoda navesti i odgovarajuce pristupne atribute.
	 */
	
	protected String ime, vrsta;
	protected int brojSastojaka;
	
	public Pice(String ime, String vrsta, int brojSastojaka) {
		this.ime = ime;
		this.vrsta = vrsta;
		this.brojSastojaka = brojSastojaka;
	}
	
	public abstract void pravljenje();
	public abstract void konzumiranje();
	
	public String getIme() {
		return ime;
	}
	
	public void setIme(String ime) {
		this.ime = ime;
	}
	
	public String getVrsta() {
		return vrsta;
	}
	
	public void setVrsta(String vrsta) {
		this.vrsta = vrsta;
	}
	
	public int getBrojSastojaka() {
		return brojSastojaka;
	}
	
	public void setBrojSastojaka(int brojSastojaka) {
		this.brojSastojaka = brojSastojaka;
	}
}
