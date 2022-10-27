package s033_konstruktori;

class VoziloResenje {
	String marka;
	String tip;
	int godiste;
	String registracija;
	int maksBrzina;
	int snaga;
	int cena;
	
	VoziloResenje(){}
	
	VoziloResenje(String marka, String tip, int godiste, String registracija, int maksBrzina, int snaga){
		this.marka = marka;
		this.tip = tip;
		this.godiste = godiste;
		this.registracija = registracija;
		this.maksBrzina = maksBrzina;
		this.snaga = snaga;
	}
	
	void vrednost() {
		this.cena = this.maksBrzina*this.snaga/(2022 - this.godiste+1);	
	}
	
	void stampaj() {
		vrednost();
		System.out.println("Cena vozila je: " + this.cena);
	}
	
	int poredi(VoziloResenje v) {
		return this.cena - v.cena;
	}
}

public class S048_VoziloResenje {

	public static void main(String[] args) {
		VoziloResenje v1 = new VoziloResenje("Citroen", "C5", 2017, "NS111RT", 230, 1800);
		VoziloResenje v2 = new VoziloResenje("Pezo", "5008", 2022, "NS222TZ", 220, 1900);
		
		v1.stampaj();
		v2.stampaj();
		
		if (v1.poredi(v2)>0)
			System.out.println("Vrednije je prvo vozilo");
		else if (v1.poredi(v2)<0)
			System.out.println("Vrednije je drugo vozilo");
		else
			System.out.println("Vozila su iste vrednosti");
	}
}
