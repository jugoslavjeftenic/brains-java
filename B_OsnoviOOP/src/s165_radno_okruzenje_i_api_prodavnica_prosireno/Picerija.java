package s165_radno_okruzenje_i_api_prodavnica_prosireno;

public class Picerija extends Prodavnica implements Imenovanje {

	private String imeKompanije;
	private String[] ponudaHrane = {"Pica", "Pasta", "Salata", "Kalcona", "Sok", "Pivo"};
	
	@Override
	public String pribaviIme() {
		return imeKompanije;
	}
	@Override
	public void postaviIme(String ime) {
		// TODO Auto-generated method stub
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
