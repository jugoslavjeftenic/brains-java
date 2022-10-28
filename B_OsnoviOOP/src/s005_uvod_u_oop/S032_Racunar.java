package s005_uvod_u_oop;

class Racunar {
	
	String procesor;
	double radniTakt, indeksPerformansi;
	int kapacitetMemorije;
	
	void postaviOsobine(String pProcesor, double pRadniTakt, int pKapacitetMemorije) {
		procesor = pProcesor;
		radniTakt = pRadniTakt;
		kapacitetMemorije = pKapacitetMemorije;
		indeksPerformansi = 10 * (radniTakt + kapacitetMemorije);
	}
	
	String pribaviProcesor() {
		return procesor;
	}
	
	double pribaviPerformanse() {
		return indeksPerformansi;
	}
}

public class S032_Racunar {

	/*
	 * Kreirati klasu Racunar sa atributima procesor (tipa String), radniTakt (tipa double),
	 * kapacitetMemorije (tipa int), kao i metodama za postavljanje naziva i radnog takta procesora,
	 * postavljanje kapaciteta memorije u GB, racunanje indeksa performansi racunara po formuli:
	 * indeksPerformansi = 10*radniTakt + kapacitetMemorije i stampanje indeksa performansi racunara.
	 * 
	 * Potom testirati klasu kreiranjem pet objekta u okviru glavnog programa, kojima prvo postavljamo
	 * vrednosti atributa, a potom racunamo i prikazujemo njihovu rang listu uredjenu po
	 * indeksu performansi u opadajucem redosledu.
	 */
	
	public static void main(String[] args) {
		
		double performanse[] = new double[5];

		Racunar galaksija = new Racunar();
		galaksija.postaviOsobine("Zilog Z80A", 3.072, 6);
		performanse[0] = galaksija.pribaviPerformanse();
		
		Racunar spectrum = new Racunar();
		spectrum.postaviOsobine("Zilog Z80", 3.5, 48);
		performanse[1] = spectrum.pribaviPerformanse();
		
		Racunar commodore = new Racunar();
		commodore.postaviOsobine("MOS Technology 6510", 0.985, 64);
		performanse[2] = commodore.pribaviPerformanse();
		
		Racunar amstrad = new Racunar();
		amstrad.postaviOsobine("Zilog Z80", 4.0, 64);
		performanse[3] = amstrad.pribaviPerformanse();
		
		Racunar atari = new Racunar();
		atari.postaviOsobine("MOS Technology 6502C", 1.77, 128);
		performanse[4] = atari.pribaviPerformanse();
		
		for (int i = 0; i < performanse.length; i++) {
			for (int j = i + 1; j < performanse.length; j++) {
				if (performanse[i] < performanse[j]) {
					double pPerformanse = performanse[i];
					performanse[i] = performanse[j];
					performanse[j] = pPerformanse;
				}
			}
		}
		
		System.out.println("Racunari poslagani od najjaceg ka najslabijem imaju sledeµe indekse performansi:");
		for (int i = 0; i < performanse.length; i++) {
			System.out.println(i + ". " + performanse[i]);
		}
	}
}
