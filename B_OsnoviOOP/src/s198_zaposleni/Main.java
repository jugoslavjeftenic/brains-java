package s198_zaposleni;

public class Main {
	
	/*
	 * Napraviti paket zaposleni i u okviru njega implementirati:
	 * 1. Apstraktnu klasu Radnik ciji su zasticeni podaci:
	 * ime radnika, prezime radnika, JMBG, broj tekuceg racuna i koeficijent strucne spreme,
	 * a javni: metod za ucitavanje podataka o radniku iz tekstualne datoteke, metod za upis imena, prezimena,
	 * broja tekuceg racuna i plate radnika (za zadatu vrednost cene rada) u jedan red tekstualne datoteke i
	 * apstraktni metod za izracunavanje plate radnika.
	 * 2. klasu AktivanRadnik izvedenu iz apstraktne klase Radnik, koja kao privatni podatak sadrzi
	 * varijabilni koeficijent (u skladu sa tim treba predefinisati i metod za ucitavanje).
	 * 3. klasu RadnikNaBolovanju takodje izvedenu iz klase Radnik.
	 * U klasi Main kreirati platni spisak radnika jednog preduzeca na osnovu sadrzaja ulazne datoteke spisak.txt.

	 * NAPOMENA: Platu aktivnog radnika racunati po obrascu: plata = (koefStrucneSpreme + varijabilniKoef) * cenaRada
	 * a platu radnika na bolovanju po obrascu: 0.8 * koeficijentStrucneSpreme * cenaRada
	 * 
	 * U ulaznoj datoteci zapisana je najpre cena rada, zatim broj radnika u preduzecu,
	 * a zatim slede podaci o svim radnicima. Podaci o jednom radniku pocinju linijom u kojoj je zapisan
	 * simbol + ili -. Simbol + oznacava da slede podaci o aktivnom radniku, a – da slede podaci o radniku koji
	 * se trenutno nalazi na bolovanju. Platni spisak ispisati u izlaznu datoteku plate.txt.
	 * 
	 * Napomena: za konverziju se mogu koristiti omotac klase za primitivne tipove iz java.lang kao što je Integer:
	 * Primer za ulaz: n = Integer.parseInt(bafUlaz.readLine());
	 * Primer za izlaz: dat.write(new Double(plata).toString());
	 */
	
	public static void main(String[] args) {

		String filePath = "src/s198_zaposleni/";
//		GenerisiSpisak.generisiSpisak(filePath, 10000, 10);
		
	}
}
