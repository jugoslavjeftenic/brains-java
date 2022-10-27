package s049_kontrola_pristupa_i_enkapsulacija;

import alati.RADE;

<<<<<<< HEAD
class Klijent {
	
	private String jmbg, ime, prezime, grad, adresa;
	private double stanjeRacuna;
	
	public Klijent() {}
	
	public Klijent(String jmbg, String ime, String prezime, String grad, String adresa, double stanjeRacuna) {
		this.jmbg = jmbg;
		this.ime = ime;
		this.prezime = prezime;
		this.grad = grad;
		this.adresa = adresa;
		this.stanjeRacuna = stanjeRacuna;
	}

	public String getJMBG() {
		return jmbg;
	}

	public void setJMBG(String jmbg) {
		this.jmbg = jmbg;
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

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public double getStanjeRacuna() {
		return stanjeRacuna;
	}

	public void setStanjeRacuna(int stanjeRacuna) {
		this.stanjeRacuna = stanjeRacuna;
	}
}

public class S063_Z1_Klijent {

	/*
	 * Osmisliti, nacrtati dijagram klase i realizovati u Javi klasu Klijent za
	 * èuvanje i rad sa podacima o klijentima neke banke. Koje atribute bi trebalo
	 * posmatrati? Koje osnovne metode bi trebalo implementirati?
	 */
=======
/*
 * Osmisliti, nacrtati dijagram klase i realizovati u Javi klasu Klijent za
 * èuvanje i rad sa podacima o klijentima neke banke. Koje atribute bi trebalo
 * posmatrati? Koje osnovne metode bi trebalo implementirati?
 */

class Klijent {
	
	private String jmbg, ime, prezime, grad, adresa;
	private double stanjeRacuna;
	
	public Klijent() {}
	
	public Klijent(String jmbg, String ime, String prezime, String grad, String adresa, double stanjeRacuna) {
		this.jmbg = jmbg;
		this.ime = ime;
		this.prezime = prezime;
		this.grad = grad;
		this.adresa = adresa;
		this.stanjeRacuna = stanjeRacuna;
	}

	public String getJMBG() {
		return jmbg;
	}

	public void setJMBG(String jmbg) {
		this.jmbg = jmbg;
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

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public String getAdresa() {
		return adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public double getStanjeRacuna() {
		return stanjeRacuna;
	}

	public void setStanjeRacuna(int stanjeRacuna) {
		this.stanjeRacuna = stanjeRacuna;
	}
}

public class S063_Z1_Klijent {
>>>>>>> branch 'master' of https://github.com/jugoslavjeftenic/brains.git

	public static void main(String[] args) {
		
		Klijent klijenti[] = new Klijent[5];
		for (int i = 0; i < klijenti.length; i++) {
			klijenti[i] = new Klijent
				(RADE.generisiJMBG(), RADE.generisiIme(0), RADE.generisiPrezime(), RADE.generisiGrad(),
				 RADE.generisiUlicu() + " " + RADE.generisiBrojUlice(), RADE.mrRobot(0, 100000.0));
		}
		
		for (int i = 0; i < klijenti.length; i++) {
			System.out.println("      Klijent: " + klijenti[i].getIme() + " " + klijenti[i].getPrezime());
			System.out.println("         JBGM: " + klijenti[i].getJMBG());
			System.out.println("       Adresa: " + klijenti[i].getGrad()+ ", " + klijenti[i].getAdresa());
			System.out.printf("Stanje racuna: %.2f\n", klijenti[i].getStanjeRacuna());
			System.out.println();
		}
	}
}
