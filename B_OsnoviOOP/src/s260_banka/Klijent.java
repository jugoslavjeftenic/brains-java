package s260_banka;

import java.io.BufferedWriter;
import java.util.Scanner;

public class Klijent implements RadSaFajlovima {

	private String ime, prezime, jmbg;
	private Racun brojRacuna;

	public Klijent() {
		this.brojRacuna = new Racun();
	}
	
	public Klijent(String ime, String prezime, String jmbg) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.brojRacuna = new Racun();
	}

	public Klijent(String ime, String prezime, String jmbg, String valuta) {
		this(ime, prezime, jmbg);
		this.brojRacuna.setValuta(valuta);
	}

	@Override
	public void citaj(Scanner s) {
		ime = s.next();
		prezime = s.next();
		jmbg = s.next();
		brojRacuna.setStanje(s.nextFloat());
		brojRacuna.setValuta(s.next());
		brojRacuna.setActivan(s.nextBoolean());
	}

	@Override
	public void cuvaj(BufferedWriter bw) {
		
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

	public Racun getRacun() {
		return brojRacuna;
	}

	public void setRacun(Racun racun) {
		this.brojRacuna = racun;
	}
}
