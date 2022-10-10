package s149_radno_okruzenje_i_api_prodavnica;

public abstract class Prodavnica {
	
	public void izracunajPDV() {
		System.out.println("PDV za ovu delatnost iznosi 20%!");
	}
	
	public abstract String[] uzmiInventar();
	public abstract void kupiInventar(String inventar);
}
