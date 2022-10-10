package s049_kontrola_pristupa_i_enkapsulacija;

	/*
	 * Osmisliti, nacrtati dijagrame klasa i realizovati u Javi klase Ucionica i Racunar
	 * koje bi se mogle koristiti u programu za evidenciju inventara neke institucije.
	 * U svakoj ucionici moze se nalaziti odredjeni broj racunara.
	 * Koje atribute bi trebalo posmatrati?
	 * Koje osnovne metode bi trebalo implementirati?
	 */

class Ucionica {

	private int brojRacunara;
	private UcionickiRacunar[] racunari = new UcionickiRacunar[brojRacunara];
	
	public Ucionica() {}

	public Ucionica(int brojRacunara, UcionickiRacunar[] racunari) {
		this.brojRacunara = brojRacunara;
		this.racunari = racunari;
	}

	public UcionickiRacunar[] getRacunari() {
		return racunari;
	}

	public void setRacunari(UcionickiRacunar[] racunari) {
		this.racunari = racunari;
	}

	public int getBrojRacunara() {
		return brojRacunara;
	}

	public void setBrojRacunara(int brojRacunara) {
		this.brojRacunara = brojRacunara;
	}
}

class UcionickiRacunar {
	
	private String procesor;
	private double radniTakt, indeksPerformansi;
	private int kapacitetMemorije;
	
	public UcionickiRacunar() {}
	
	public UcionickiRacunar(String procesor, double radniTakt, int kapacitetMemorije) {
		this.procesor = procesor;
		this.radniTakt = radniTakt;
		this.kapacitetMemorije = kapacitetMemorije;
		this.indeksPerformansi = izracunajPerformanse();
	}

	public String getProcesor() {
		return procesor;
	}

	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}

	public double getRadniTakt() {
		return radniTakt;
	}

	public void setRadniTakt(double radniTakt) {
		this.radniTakt = radniTakt;
	}

	public int getKapacitetMemorije() {
		return kapacitetMemorije;
	}

	public void setKapacitetMemorije(int kapacitetMemorije) {
		this.kapacitetMemorije = kapacitetMemorije;
	}

	public double getIndeksPerformansi() {
		return indeksPerformansi;
	}

	public void setIndeksPerformansi(double indeksPerformansi) {
		this.indeksPerformansi = indeksPerformansi;
	}

	public double izracunajPerformanse() {
		return 10 * (radniTakt + kapacitetMemorije);
	}

	public String ispisiOsobine() {
		return String.format("Procesor [%s], radni takt [%.2f] MHz, memorija [%d] KB.",
			getProcesor(), getRadniTakt(), getKapacitetMemorije());
	}
}

public class S063_Z2_Ucionica_i_Racunar {

	public static void main(String[] args) {
		
		UcionickiRacunar[] racunari = new UcionickiRacunar[4];
		
		racunari[0] = new UcionickiRacunar("AMD", 2.0, 16);
		racunari[1]= new UcionickiRacunar("AMD", 2.6, 32);
		racunari[2] = new UcionickiRacunar("Intel", 2.0, 16);
		racunari[3] = new UcionickiRacunar("Intel", 2.6, 32);
		
		Ucionica ucionica = new Ucionica(racunari.length, racunari);
		
		System.out.println("Ucionica sadrzi " + ucionica.getBrojRacunara() + " racunara:");
		for (int i = 0; i < racunari.length; i++) {
			System.out.println(racunari[i].ispisiOsobine());
		}
	}
}
