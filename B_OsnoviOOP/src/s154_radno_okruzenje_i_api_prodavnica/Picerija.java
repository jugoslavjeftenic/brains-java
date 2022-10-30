package s154_radno_okruzenje_i_api_prodavnica;

public class Picerija extends Prodavnica implements Imenovanje {

	private String imeKompanije;
	private String[] ponudaHrane = {"Pica", "Pasta", "Salata", "Kalcona", "Sok", "Pivo"};
	
	@Override
	public String getIme() {
		return imeKompanije;
	}

	@Override
	public void setIme(String ime) {
		imeKompanije = ime;
	}
	
	@Override
	public String[] uzmiInventar() {
		return ponudaHrane;
	}
	
	@Override
	public void kupiInventar(String artikal) {
		System.out.println("\nUpravo ste narucili artikal: " + artikal + ".");
	}
}
