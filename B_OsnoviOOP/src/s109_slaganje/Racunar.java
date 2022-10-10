package s109_slaganje;

public class Racunar {

	/*
	 * Osmisliti, nacrtati dijagrame klasa i realizovati u Javi klase
	 * Institucija, Ucionica, Zaposleni (koja nasleðuje klasu Osoba) i Racunar koje
	 * bi se mogle koristiti u programu za evidenciju zaposlenih i inventara neke
	 * obrazovne institucije.
	 * Spiskove uèionica, zaposlenih i raèunara po uèionicama èuvati u
	 * odgovarajuæim nizovima (svaki sa najviše 20 èlanova).
	 * U kojim meðusobnim odnosima se nalaze pomenute klase
	 * (nasleðivanje, asocijacija, agregacija, kompozicija)?
	 * • Klase testirati kreiranjem objekata u glavnom programu i pozivanjem izabranih metoda.
	 *   Nacrtati UML dijagram klasa rešenja.
	 */

	private String imeRacunara, oznakaProcesora;
	private double radniTakt;
	private int kapacitetMemorije;
	
	public Racunar() {}

	public Racunar(String imeRacunara, String oznakaProcesora, double radniTakt, int kapacitetMemorije) {
		this.imeRacunara = imeRacunara;
		this.oznakaProcesora = oznakaProcesora;
		this.radniTakt = radniTakt;
		this.kapacitetMemorije = kapacitetMemorije;
	}
	
	public void postaviAtribute(String imeRacunara, String oznakaProcesora, double radniTakt, int kapacitetMemorije) {
		this.imeRacunara = imeRacunara;
		this.oznakaProcesora = oznakaProcesora;
		this.radniTakt = radniTakt;
		this.kapacitetMemorije = kapacitetMemorije;
	}

	public double indeksPerformansi() {
		return 100 * radniTakt + kapacitetMemorije;
	}
	
	public void stampajIndeksPerformansi() {
		System.out.printf
			("%s sa procesorom %s-%.2f MHz i memorijom kapaciteta %d KiB ima indeks performansi %.2f.\n",
			 getImeRacunara(), getOznakaProcesora(), getRadniTakt(), getKapacitetMemorije(), indeksPerformansi());
	}
	
	public String getImeRacunara() {
		return imeRacunara;
	}
	
	public void setImeRacunara(String imeRacunara) {
		this.imeRacunara = imeRacunara;
	}
	
	public String getOznakaProcesora() {
		return oznakaProcesora;
	}

	public void setOznakaProcesora(String oznakaProcesora) {
		this.oznakaProcesora = oznakaProcesora;
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
}
