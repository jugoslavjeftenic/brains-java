package s198_zaposleni;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public abstract class Radnik {

	/*
	 * Apstraktnu klasu Radnik èiji su zaštiæeni podaci: ime radnika, prezime
	 * radnika, JMBG, broj tekuæeg raèuna i koeficijent struène spreme, a javni:
	 * metod za uèitavanje podataka o radniku iz tekstualne datoteke, metod za upis
	 * imena, prezimena, broja tekuæeg raèuna i plate radnika (za zadatu vrednost
	 * cene rada) u jedan red tekstualne datoteke i apstraktni metod za
	 * izraèunavanje plate radnika.
	 */
	
	protected String ime, prezime, jmbg, racun, ss;
	
	public Radnik() {}
	
	public Radnik(String ime, String prezime, String jmbg, String racun, String ss) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.racun = racun;
		this.ss = ss;
	}

//	public void ucitajPodatke() throws IOException {
//		FileReader ulaz = null;
//		try {
//			ulaz = new FileReader("radnici.txt");
//			Scanner s = new Scanner(new FileReader("radnici.txt")).useDelimiter("\\s");
//			int c;
//			while ((c = s.next) != -1) {
//				izlaz.write(c);
//			}
//		}
//		catch (IOException e) {
//			System.out.println(e.getMessage());
//		}
//		finally {
//			if (ulaz != null) {
//				ulaz.close();
//			}
//		}
//	}
	
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

	public String getRacun() {
		return racun;
	}

	public void setRacun(String racun) {
		this.racun = racun;
	}

	public String getSs() {
		return ss;
	}

	public void setSs(String ss) {
		this.ss = ss;
	}

	public abstract void izracunajPlatu();
}
