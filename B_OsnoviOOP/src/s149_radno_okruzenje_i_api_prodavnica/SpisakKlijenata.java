package s149_radno_okruzenje_i_api_prodavnica;

public class SpisakKlijenata {
	
	private String[] klijenti;
	
	public SpisakKlijenata() {}

	public SpisakKlijenata(String[] klijenti) {
		this.klijenti = klijenti;
	}
	
	public String nadjiKlijenta(String klijent) {
		String imeKlijenta = "";
		for (int i = 0; i < klijenti.length; i++) {
			if (klijent.equals(klijenti[i])) {
				imeKlijenta = klijenti[i];
			}
		}
		return (imeKlijenta.equals("")) ? "Klijent nije na spisku klijenata" : imeKlijenta;
	}

	public String[] dodajKlijenta(String klijent) {
		String[] privNiz = new String[klijenti.length + 1];
		int duzinaNiza = 0;
		for (duzinaNiza = 0; duzinaNiza < klijenti.length; duzinaNiza++) {
			privNiz[duzinaNiza] = klijenti[duzinaNiza];
		}
		privNiz[duzinaNiza] = klijent;
		klijenti = privNiz;
		return this.klijenti;
	}

	public String[] getKlijenti() {
		return klijenti;
	}

	public void setKlijenti(String[] klijenti) {
		this.klijenti = klijenti;
	}
}
