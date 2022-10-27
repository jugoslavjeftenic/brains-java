package s999_vezbe_1;

public class Programer extends Osoba implements Iterator {

	/*
	 * Napisati klasu Programer koja nasleðuje klasu Osoba i implementira interfejs
	 * Iterator. Klasa ima atribute iskustvo (tipa String) i plata (tipa double),
	 * konstruktor (napomena: roditeljska klasa ima atribute ime, tipa String,
	 * prezime, tipa String i starost, tipa int) i metode za pribavljanje i
	 * postavljanje atributa (getere i setere). Kod svih atributa i metoda navesti i
	 * odgovarajuæe pristupne atribute.
	 */

	private String iskustvo;
	private double plata;
	
	@Override
	public void predstaviSe() {
		// TODO Auto-generated method stub
		
	}

	public Programer() {
		super();
	}

	public Programer(String ime, String prezime, int starost, String iskustvo, double plata) {
		super(ime, prezime, starost);
		this.iskustvo = iskustvo;
		this.plata = plata;
	}

	public String getIskustvo() {
		return iskustvo;
	}

	public void setIskustvo(String iskustvo) {
		this.iskustvo = iskustvo;
	}

	public double getPlata() {
		return plata;
	}

	public void setPlata(double plata) {
		this.plata = plata;
	}
}
