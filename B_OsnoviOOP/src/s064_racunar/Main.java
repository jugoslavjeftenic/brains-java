package s064_racunar;

public class Main {

	/*
	 * Stvoriti klasu Racunar sa atributima oznakaProcesora (tipa String), radniTakt (tipa double),
	 * kapacitetMemorije (tipa int), standardnim konstruktorom i konstruktorom koji postavlja
	 * inicijalne vrednosti, pristupnim metodama (get i set) za sve atribute,
	 * kao i metodom za raèunanje indeksa performansi raèunara po formuli:
	 * indeksPerformansi = 100*radniTakt + kapacitetMemorije.
	 * Implementirati i metod za prikaz indeksa performansi raèunara u konzoli.
	 * 
	 * Potom testirati klasu stvaranjem sedam objekata u okviru metode main.
	 * Nakon stvaranja objekata primenom konstruktora, potrebno je izraèunati i prikazati
	 * rang listu raèunara ureðenu po indeksu performansi u rastuæem redosledu.
	 */

	public static void main(String[] args) {

		Racunar racunari[] = new Racunar[7];
		
		for (int i = 0; i < racunari.length; i++) {
			racunari[i] = new Racunar();
		}
		
		racunari[0].postaviAtribute("Galaksija", "Zilog Z80A", 3.072, 6);
		racunari[1].postaviAtribute("ZX Spectrum 48", "Zilog Z80", 3.5, 48); 
		racunari[2].postaviAtribute("Commodore 64C", "MOS Technology 6510", 0.985, 64);
		racunari[3].postaviAtribute("Amstrad CPC 464", "Zilog Z80", 4.0, 64);
		racunari[4].postaviAtribute("Atari 800XL", "MOS Technology 6502C", 1.77, 128);
		racunari[5].postaviAtribute("Macintosh 128K", "Motorola 68000", 6.0, 128);
		racunari[6].postaviAtribute("IBM PC - Model 5150", "Intel 8088", 4.77, 64);
		
		System.out.println("Dobrodosli u program za rangiranje racunara po osnovu indeksa performansi.");
		System.out.println();
		
		System.out.println("Rang lista racunara pre uredjenja po indeksu performansi:");
		stampajListu(racunari);
		
		urediPoIndeksuPerformansi(racunari);

		System.out.println("Rang lista racunara nakon uredjenja po indeksu performansi:");
		stampajListu(racunari);
	}
	
	static void stampajListu(Racunar listaRacunara[]) {
		for (int i = 0; i < listaRacunara.length; i++) {
			System.out.print((i + 1) + ". ");
			listaRacunara[i].stampajIndeksPerformansi();
		}
		System.out.println();
	}
	
	static void urediPoIndeksuPerformansi(Racunar listaRacunara[]) {
		for (int i = 0; i < listaRacunara.length; i++) {
			for (int j = i + 1; j < listaRacunara.length; j++) {
				if (listaRacunara[i].indeksPerformansi() > listaRacunara[j].indeksPerformansi()) {
					Racunar performanse = listaRacunara[i];
					listaRacunara[i] = listaRacunara[j];
					listaRacunara[j] = performanse;
				}
			}
		}
	}
}
