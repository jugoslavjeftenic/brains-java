package s154_radno_okruzenje_i_api_prodavnica;

public abstract class Prodavnica {
	
	private SpisakKlijenata spisakKlijenata;
	
	public void izracunajPDV() {
		System.out.println("PDV za ovu delatnost iznosi 20%!");
	}
	
	public abstract String[] uzmiInventar();
	public abstract void kupiInventar(String artikal);

	public SpisakKlijenata getSpisakKlijenata() {
		return spisakKlijenata;
	}

	public void setSpisakKlijenata(SpisakKlijenata spisakKlijenata) {
		this.spisakKlijenata = spisakKlijenata;
	}
}
