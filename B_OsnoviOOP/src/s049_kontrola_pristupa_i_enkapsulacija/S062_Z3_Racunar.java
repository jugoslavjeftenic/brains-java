package s049_kontrola_pristupa_i_enkapsulacija;

class Racunar {
	
	private String procesor;
	private double radniTakt;
	private int kapacitetMemorije;
	
	public Racunar() {}
	
	public Racunar(String procesor, double radniTakt, int kapacitetMemorije) {
		this.procesor = procesor;
		this.radniTakt = radniTakt;
		this.kapacitetMemorije = kapacitetMemorije;
	}

	public String getProcesor() {
		return procesor;
	}

	public void setProcesor(String procesor) {
		this.procesor = procesor;
	}

	public double getRadniTakt() {
		return radniTakt;
	}

	public void setRadniTakt(double radniTakt) {
		this.radniTakt = radniTakt;
	}

	public int getKapacitetMemorije() {
		return kapacitetMemorije;
	}

	public void setKapacitetMemorije(int kapacitetMemorije) {
		this.kapacitetMemorije = kapacitetMemorije;
	}

	public double izracunajPerformanse() {
		return 10 * (radniTakt + kapacitetMemorije);
	}

	public String pribaviOsobine() {
		// (https://www.javatpoint.com/java-string-format)
		return String.format("  Procesor %s,\nRadni takt %.2fMHz,\n  Memorija %dKB\n",
				procesor, radniTakt, kapacitetMemorije);
	}
}

public class S062_Z3_Racunar {

	public static void main(String[] args) {
		
		double performanse[][] = new double[5][2];

		Racunar galaksija = new Racunar("Zilog Z80A", 3.072, 6);
		performanse[0][0] = 1;
		performanse[0][1] = galaksija.izracunajPerformanse();
		
		Racunar spectrum = new Racunar("Zilog Z80", 3.5, 48);
		performanse[1][0] = 2;
		performanse[1][1] = spectrum.izracunajPerformanse();
		
		Racunar commodore = new Racunar("MOS Technology 6510", 0.985, 64);
		performanse[2][0] = 3;
		performanse[2][1] = commodore.izracunajPerformanse();
		
		Racunar amstrad = new Racunar("Zilog Z80", 4.0, 64);
		performanse[3][0] = 4;
		performanse[3][1] = amstrad.izracunajPerformanse();
		
		Racunar atari = new Racunar("MOS Technology 6502C", 1.77, 128);
		performanse[4][0] = 5;
		performanse[4][1] = atari.izracunajPerformanse();
		
		System.out.println(" Racunar 1 Galaksija");
		System.out.println(galaksija.pribaviOsobine());
		
		System.out.println(" Racunar 2 ZX Spectrum 48");
		System.out.println(spectrum.pribaviOsobine());
		
		System.out.println(" Racunar 3 Commodore 64C");
		System.out.println(commodore.pribaviOsobine());
		
		System.out.println(" Racunar 4 Amstrad CPC 464");
		System.out.println(amstrad.pribaviOsobine());
		
		System.out.println(" Racunar 5 Atari 800XL");
		System.out.println(atari.pribaviOsobine());
		
		for (int i = 0; i < performanse.length; i++) {
			for (int j = i + 1; j < performanse.length; j++) {
				if (performanse[i][1] < performanse[j][1]) {
					double pRacunar = performanse[i][0];
					double pPerformanse = performanse[i][1];
					performanse[i][0] = performanse[j][0];
					performanse[i][1] = performanse[j][1];
					performanse[j][0] = pRacunar;
					performanse[j][1] = pPerformanse;
				}
			}
		}
		
		System.out.println("Raèunari poslagani od najjaèeg ka najslabijem imaju sledeæe indekse performansi:");
		for (int i = 0; i < performanse.length; i++) {
			System.out.printf
				("%d. Racunar %.0f indeks %.2f\n", i, performanse[i][0], performanse[i][1]);
		}
		
	}
}
