package s065_nasledjivanje_osoba;

public class Student extends Osoba {
	
	private int brojIndeksa;
	private double test1, test2;

	public Student() {}

	public Student(String ime, String prezime, int starost, int brojIndeksa, double test1, double test2) {
		super(ime, prezime, starost);
		this.brojIndeksa = brojIndeksa;
		this.test1 = test1;
		this.test2 = test2;
	}
	
	public int getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(int brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public double getTest1() {
		return test1;
	}

	public void setTest1(double test1) {
		this.test1 = test1;
	}

	public double getTest2() {
		return test2;
	}

	public void setTest2(double test2) {
		this.test2 = test2;
	}

	public double racunajProsek() {
		return (test1 + test2) / 2;
	}
	
	public void stampajProsek() {
		System.out.printf("Student %s %s, broj indeksa %d - prosecan broj poena: %.2f.\n",
			getIme(), getPrezime(), getBrojIndeksa(), racunajProsek());
	}
}
