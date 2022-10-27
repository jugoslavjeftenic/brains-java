package s153_enum;
public class S156_EnumDemo {

	enum Dan {PONEDELJAK, UTORAK, SREDA, CETVRTAK, PETAK, SUBOTA, NEDELJA}
	enum Mesec {JANUAR, FEBRUAR, MART, APRIL, MAJ, JUN, JUL, AUGUST, SEPTEMBAR, OKTOBAR, NOVEMBAR, DECEMBAR}

	public static void main(String[] args) {
		
		Dan danRodjenja;					// promenljiva tipa Dan
		Mesec mesecRodjenja;				// promenljiva tipa Mesec
		danRodjenja = Dan.SUBOTA;			// dodela vrednosti promenljivoj tipa Dan
		mesecRodjenja = Mesec.SEPTEMBAR;	// dodela vrednosti promenljivoj tipa Mesec
		
		System.out.println("Moj znak je devica, jer sam ja rodjen u mesecu " + mesecRodjenja);
		System.out.println("To je "+ (mesecRodjenja.ordinal() + 1) + ". mesec godine.");
		System.out.println("Dan kada sam se rodio je " + danRodjenja + ".");
		System.out.println( danRodjenja + " je " + danRodjenja.ordinal() + ". dan u nedelji.");
		
	}
}
