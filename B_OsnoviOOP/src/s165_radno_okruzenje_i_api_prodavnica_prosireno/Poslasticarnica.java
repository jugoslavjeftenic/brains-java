package s165_radno_okruzenje_i_api_prodavnica_prosireno;

public class Poslasticarnica extends Prodavnica implements Imenovanje {

	private String imeKompanije;
	private String[] stavkeMenija = {"Sladoljed", "Koljac", "Krofna", "Kafa", "Caj", "Ljimunada"};
	
	@Override
	public String pribaviIme() {
		return imeKompanije;
	}
	@Override
	public void postaviIme(String ime) {
		imeKompanije = ime;
	}
	@Override
	public String[] uzmiInventar() {
		return stavkeMenija;
	}
	@Override
	public void kupiInventar(String artikal) {
		System.out.println("\nUpravo ste narucili artikal: " + artikal + ".");
	}
	
	
}
