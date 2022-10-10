package s064_oop_obavezni_zadatak_1;

public class Racunar {

	/*
	 * Stvoriti klasu Racunar sa atributima
	 * oznakaProcesora (tipa String),
	 * radniTakt (tipa double),
	 * kapacitetMemorije (tipa int),
	 * standardnim konstruktorom i konstruktorom koji postavlja inicijalne vrednosti,
	 * pristupnim metodama (get i set) za sve atribute,
	 * kao i metodom za raèunanje indeksa performansi raèunara po formuli:
	 * indeksPerformansi = 100*radniTakt + kapacitetMemorije.
	 * Implementirati i metod za prikaz indeksa performansi raèunara u konzoli.
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
