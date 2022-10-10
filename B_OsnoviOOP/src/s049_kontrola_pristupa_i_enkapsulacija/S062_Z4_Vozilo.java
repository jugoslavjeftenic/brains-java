package s049_kontrola_pristupa_i_enkapsulacija;

class Vozilo {
	
	static int godina = 2022;
	
	private String marka, tip, registracija;
	private int godiste, maksBrzina, snaga;

	public Vozilo() {}
	
	public Vozilo(String marka, String tip, int godiste, String registracija, int maksBrzina, int snaga) {
		this.marka = marka;
		this.tip = tip;
		this.godiste = godiste;
		this.registracija = registracija;
		this.maksBrzina = maksBrzina;
		this.snaga = snaga;
	}
	
	public String getMarka() {
		return marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getRegistracija() {
		return registracija;
	}

	public void setRegistracija(String registracija) {
		this.registracija = registracija;
	}

	public int getGodiste() {
		return godiste;
	}

	public void setGodiste(int godiste) {
		this.godiste = godiste;
	}

	public int getMaksBrzina() {
		return maksBrzina;
	}

	public void setMaksBrzina(int maksBrzina) {
		this.maksBrzina = maksBrzina;
	}

	public int getSnaga() {
		return snaga;
	}

	public void setSnaga(int snaga) {
		this.snaga = snaga;
	}

	public void stampajPodatke() {
		System.out.println("Podaci o vozilu " + marka + " " + tip + ":");
		System.out.println("-godiste:           " + godiste);
		System.out.println("-registracija:      " + registracija);
		System.out.println("-maksimalna brzina: " + maksBrzina);
		System.out.println("-snaga vozila:      " + snaga);
		System.out.println();
	}
	
	public int izracunajCenu() {
		return this.maksBrzina * this.snaga / (godina - this.godiste);
	}
	
	public boolean uporediCenu(int cenaDrugogVozila) {
		return (this.izracunajCenu() < cenaDrugogVozila) ? false : true;
	}
}

public class S062_Z4_Vozilo {

	public static void main(String[] args) {
		
		Vozilo fica = new Vozilo("Zastava", "750", 1972, "SU-001", 80, 25);
		Vozilo stojadin = new Vozilo("Zastava", "101", 1982, "SU-101", 130, 55);
		Vozilo lada = new Vozilo("Lada", "750", 1972, "SU-USSR", 150, 70);

		fica.stampajPodatke();
		System.out.println("Cena vozila je: " + fica.izracunajCenu());
		System.out.println("------------------------------------");
		
		stojadin.stampajPodatke();
		System.out.println("Cena vozila je: " + stojadin.izracunajCenu());
		System.out.println("------------------------------------");

		lada.stampajPodatke();
		System.out.println("Cena vozila je: " + lada.izracunajCenu());
		System.out.println("------------------------------------");
		
		System.out.println("Poredjenje cena vozila:");
		System.out.printf
			("Vozilo %s %s je %s od vozila %s %s.\n",
			 fica.getMarka(), fica.getTip(), (fica.uporediCenu(stojadin.izracunajCenu())) ? "skuplje" : "jeftinije",
			 stojadin.getMarka(), stojadin.getTip());
		System.out.printf
			("Vozilo %s %s je %s od vozila %s %s.\n",
			 fica.getMarka(), fica.getTip(), (fica.uporediCenu(lada.izracunajCenu())) ? "skuplje" : "jeftinije",
			 lada.getMarka(), lada.getTip());
		System.out.printf
			("Vozilo %s %s je %s od vozila %s %s.\n",
			 stojadin.getMarka(), stojadin.getTip(), (stojadin.uporediCenu(lada.izracunajCenu())) ? "skuplje" : "jeftinije",
			 lada.getMarka(), lada.getTip());
		System.out.printf
			("Vozilo %s %s je %s od vozila %s %s.\n",
			 lada.getMarka(), lada.getTip(), (lada.uporediCenu(stojadin.izracunajCenu())) ? "skuplje" : "jeftinije",
			 stojadin.getMarka(), stojadin.getTip());
	}
}
