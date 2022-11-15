package s198_zaposleni;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public abstract class Radnik {

	/*
	 * Apstraktnu klasu Radnik èiji su zaštiæeni podaci: ime radnika, prezime
	 * radnika, JMBG, broj tekuæeg raèuna i koeficijent struène spreme, a javni:
	 * metod za uèitavanje podataka o radniku iz tekstualne datoteke, metod za upis
	 * imena, prezimena, broja tekuæeg raèuna i plate radnika (za zadatu vrednost
	 * cene rada) u jedan red tekstualne datoteke i apstraktni metod za
	 * izraèunavanje plate radnika.
	 */
	
	protected String ime, prezime, jmbg, racun;
	protected double qss;
	
	public Radnik() {}
	
	public Radnik(String ime, String prezime, String jmbg, String racun, double qss) {
		this.ime = ime;
		this.prezime = prezime;
		this.jmbg = jmbg;
		this.racun = racun;
		this.qss = qss;
	}
	
	public void ucitajPodatke(String filePath) {
		String line = "";
		InputStreamReader reader = null;
		BufferedReader br = null;
		try {
			reader = new InputStreamReader(new FileInputStream(filePath + "spisak.txt"), "UTF-8");
			br = new BufferedReader(reader);
			while ((line = br.readLine()) != null) {
				
			}
			
		} catch (UnsupportedEncodingException e) {
			System.out.println("PAZNJA! Doslo je do greske prilikom enkodovanja karaktera u UTF-8 format.");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("PAZNJA! Datoteka \"" + filePath + "spisak.txt\" nije pronadjena.");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("PAZNJA! Doslo je do nepoznate IO greske prilikom citanja datoteke \"" + filePath + "spisak.txt\"");
			e.printStackTrace();
		}
		finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
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

	public String getRacun() {
		return racun;
	}

	public void setRacun(String racun) {
		this.racun = racun;
	}

	public double getQss() {
		return qss;
	}

	public void setQss(double qss) {
		this.qss = qss;
	}

	public abstract void izracunajPlatu();
}
