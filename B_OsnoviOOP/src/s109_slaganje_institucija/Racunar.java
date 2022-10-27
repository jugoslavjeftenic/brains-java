package s109_slaganje_institucija;

public class Racunar {

	private String imeRacunara, oznakaProcesora, invBroj;
	private double radniTakt, indeksPerformansi;
	private int kapacitetMemorije;
	
	public Racunar() {}

	public Racunar(String imeRacunara, String oznakaProcesora, double radniTakt, int kapacitetMemorije) {
		this.imeRacunara = imeRacunara;
		this.oznakaProcesora = oznakaProcesora;
		this.radniTakt = radniTakt;
		this.kapacitetMemorije = kapacitetMemorije;
		this.indeksPerformansi = indeksPerformansi();
	}

	public double indeksPerformansi() {
		return 100 * radniTakt + kapacitetMemorije;
	}

	public void stampajIndeksPerformansi() {
		System.out.printf
			("%s sa procesorom %s-%.2f MHz i memorijom kapaciteta %d KiB ima indeks performansi %.2f.\n",
			 getImeRacunara(), getOznakaProcesora(), getRadniTakt(), getKapacitetMemorije(),
			 getIndeksPerformansi());
	}

	public void stampajRacunar() {
		System.out.printf("Racunar %s sa procesorom %s-%.2f MHz i memorijom kapaciteta %d KiB",
			getImeRacunara(), getOznakaProcesora(), getRadniTakt(), getKapacitetMemorije());
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

	public String getInvBroj() {
		return invBroj;
	}

	public void setInvBroj(String invBroj) {
		this.invBroj = invBroj;
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
}
