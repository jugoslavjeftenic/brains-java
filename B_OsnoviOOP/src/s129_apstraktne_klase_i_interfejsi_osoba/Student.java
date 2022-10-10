package s129_apstraktne_klase_i_interfejsi_osoba;

public class Student extends Osoba {

	/*
	 * -brojIndeksa:int
	 * -test1:double
	 * -test2:double
	 * ---------------------
	 * +Student
	 * +racunajPoene:double
	 * +stampajPoene:void
	*/
	
	private int brojIndeksa;
	private double test1, test2;

	public Student() {}

	public Student(String ime, String prezime, int starost, int brojIndeksa, double test1, double test2) {
		super(ime, prezime, starost);
		this.brojIndeksa = brojIndeksa;
		this.test1 = test1;
		this.test2 = test2;
	}

	@Override
	public void predstaviSe() {
		racunajProsek();
		System.out.printf("Ime: %s\nPrezime: %s\nStarost: %s.\nIndeks broj: %d\n",
				pribaviIme(), pribaviPrezime(), pribaviStarost(), pribaviBrojIndeksa());
	}
	
	public double racunajProsek() {
		return (test1 + test2) / 2;
	}
	
	public void stampajProsek() {
		System.out.printf
			("Student %s %s, broj indeksa %d - prosecan broj poena: %.2f.\n",
			 pribaviIme(), pribaviPrezime(), pribaviBrojIndeksa(), racunajProsek());
	}

	public int pribaviBrojIndeksa() {
		return brojIndeksa;
	}

	public void postaviBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public double pribaviTest1() {
		return test1;
	}

	public void postaviTest1(double test1) {
		this.test1 = test1;
	}

	public double pribaviTest2() {
		return test2;
	}

	public void postaviTest2(double test2) {
		this.test2 = test2;
	}
}
