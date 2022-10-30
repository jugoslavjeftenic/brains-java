package s141_klase_objekti_metode;

public class S145_RacunanjeVremena {

	public static void main(String[] args) {
		
		long vremePocetka;									// vreme pocetka rada programa u milisekundama
		long vremeKraja;									// vreme kraja rada programa u milisekundama
		double vreme;										// ukupno vreme trajanja programa
		vremePocetka = System.currentTimeMillis();

		double sirina = 42.0, visina = 17.0, hipotenuza;	// strane trougla
		hipotenuza = Math.sqrt( (sirina * sirina) + (visina * visina) );
		System.out.println("Pravougli trougao cije su stranice 42 i 17 ima hipotenuzu: " + hipotenuza);
		System.out.println();

		System.out.println("sin(1) * sin(1) + cos(1) * cos(1) - 1 je " +
				(Math.sin(1) * Math.sin(1) + Math.cos(1) * Math.cos(1) - 1));
		System.out.println();

		System.out.println("Slucajno generisana vrednost: " + Math.random());
		System.out.println();
		
		System.out.println("Broj PI ima vrednost: " + Math.PI);
		System.out.println();

		vremeKraja = System.currentTimeMillis();
		vreme = (vremeKraja - vremePocetka) / 1000.0;
		System.out.println("Ukupno trajanje programa u sekundama je: " + vreme);
	}
}
