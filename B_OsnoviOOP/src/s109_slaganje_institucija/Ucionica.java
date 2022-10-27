package s109_slaganje_institucija;

public class Ucionica {

	private int sprat, broj;
	private Racunar[] racunari = null;
	protected int brojRacunara = 0;
	
	public Ucionica() {}

	public Ucionica(int sprat, int broj, int maksBrojRacunara) {
		this.sprat = sprat;
		this.broj = broj;
		racunari = new Racunar[maksBrojRacunara];
	}

	public void dodajRacunar(Racunar racunar) {
		if (brojRacunara < racunari.length) {
			racunar.setInvBroj(Integer.toString(brojRacunara));
			racunari[brojRacunara++] = racunar;
		}
	}
	
	public void stampajInventar() {
		System.out.printf("Ucionica broj %d, sprat %d ", getBroj(), getSprat());
		if (brojRacunara == 0) {
			System.out.println("nema racunara.\n");
		}
		else {
			System.out.println("ima racunare:\n");
			for (int i = 0; i < brojRacunara; i++) {
				racunari[i].stampajRacunar();
				System.out.println();
			}
			System.out.println("----------------------------");
		}
	}
	
	public int getSprat() {
		return sprat;
	}

	public void setSprat(int sprat) {
		this.sprat = sprat;
	}

	public int getBroj() {
		return broj;
	}

	public void setBroj(int broj) {
		this.broj = broj;
	}

	public Racunar[] getRacunari() {
		return racunari;
	}

	public void setRacunari(Racunar[] racunari) {
		this.racunari = racunari;
	}

	public int getBrojRacunara() {
		return brojRacunara;
	}

	public void setBrojRacunara(int brojRacunara) {
		this.brojRacunara = brojRacunara;
	}
}
