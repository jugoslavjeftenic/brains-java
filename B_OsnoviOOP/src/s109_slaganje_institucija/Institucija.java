package s109_slaganje_institucija;

public class Institucija {
	
	private Ucionica[] ucionice = null;
	private Zaposlenik[] zaposlenici = null;
	private int brojUcionica = 0, brojZaposlenih = 0;
	
	public Institucija() {}
	
	public Institucija(int maksBrojUcionica, int maksBrojZaposlenih) {
		ucionice = new Ucionica[maksBrojUcionica];
		zaposlenici = new Zaposlenik[maksBrojZaposlenih];
	}

	public void dodajUcionicu(Ucionica ucionica) {
		if (brojUcionica < ucionice.length)
			ucionice[brojUcionica++] = ucionica;
	}
	
	public void inventarUcionica() {
		for (int i = 0; i < brojUcionica; i++)
			System.out.printf("Na spratu %d je ucionica %d sa %d racunara.\n",
				ucionice[i].getSprat(), ucionice[i].getBroj(), ucionice[i].getBrojRacunara());
	}
	
	public void dodajZaposlenika(Zaposlenik zaposlenik) {
		if (brojZaposlenih < zaposlenici.length)
			zaposlenici[brojZaposlenih++] = zaposlenik;
	}
	
	public void inventarZaposlenih() {
		for (int i = 0; i < brojZaposlenih; i++) {
			zaposlenici[i].predstaviSe();
			System.out.println();
		}
	}
	
	public Ucionica[] getUcionice() {
		return ucionice;
	}

	public void setUcionice(Ucionica[] ucionice) {
		this.ucionice = ucionice;
	}

	public Zaposlenik[] getZaposleni() {
		return zaposlenici;
	}

	public void setZaposleni(Zaposlenik[] zaposleni) {
		this.zaposlenici = zaposleni;
	}

	public int getBrojUcionica() {
		return brojUcionica;
	}

	public void setBrojUcionica(int brojUcionica) {
		this.brojUcionica = brojUcionica;
	}

	public int getBrojZaposlenih() {
		return brojZaposlenih;
	}

	public void setBrojZaposlenih(int brojZaposlenih) {
		this.brojZaposlenih = brojZaposlenih;
	}
}
