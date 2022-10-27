package s260_banka;

public interface RadSaKlijentima {
	public void ucitajKlijente(String imeUlazneDatoteke);
	public void pisiKlijente(String imeIzlazneDatoteke);
	public void dodajKlijenta();
	public void obrisiKlijenta();
	public Klijent traziKlijenta(String jedinstveniMaticniBrojGradjana);
	void stampaKlijenata();
}
