package s149_radno_okruzenje_i_api_prodavnica;

public class Picerija extends Prodavnica implements Imenovanje {

	private String ime;
	private String[] meni =
			new String[] {"kapricoza", "madjarica", "vegetarijana", "quattro stagione", "pivo", "limunada"};
	
	public Picerija(String ime) {
		super();
		this.ime = ime;
	}

	@Override
	public String getIme() {
		return ime;
	}

	@Override
	public void setIme(String novoIme) {
		ime = novoIme;
	}

	@Override
	public String[] uzmiInventar() {
		return meni;
	}

	@Override
	public void kupiInventar(String inventar) {
		for (int i = 0; i < meni.length; i++) {
			if (inventar.equals(meni[i])) {
				System.out.println("Klijent je narucio: " + inventar + ".");
			}
		}
	}
}
