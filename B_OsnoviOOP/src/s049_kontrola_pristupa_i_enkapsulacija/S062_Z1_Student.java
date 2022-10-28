package s049_kontrola_pristupa_i_enkapsulacija;

class Student {

	private String ime, prezime;
	private int test1, test2;
	
	public Student() {}
	
	public Student(String ime, String prezime, int test1, int test2) {
		this.ime = ime;
		this.prezime = prezime;
		this.test1 = test1;
		this.test2 = test2;
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public int getTest1() {
		return test1;
	}

	public void setTest1(int test1) {
		this.test1 = test1;
	}

	public int getTest2() {
		return test2;
	}

	public void setTest2(int test2) {
		this.test2 = test2;
	}

	public void setImePrezime(String ime, String prezime) {
		this.ime = ime;
		this.prezime = prezime;
	}
	
	public void setPoeni(int prviPoen, int drugiPoen) {
		test1 = prviPoen;
		test2 = drugiPoen;
	}
	
	public void printProsek() {
		System.out.println("Prosek studenta " + ime + " " + prezime + " je: " + ((double) (test1 + test2) / 2));
	}
}

public class S062_Z1_Student {
	
	/*
	 * Realizovati prethodno implementirane klase (Student, Zaposleni, Racunar, Vozilo)
	 * tako da pruze dobru enkapsulaciju podataka kroz uvoðenje pristupnih atributa i
	 * realizaciju pristupnih metoda (za postavljanje i pribavljanje vrednosti) za svaki od atributa.
	 */
	
	public static void main(String[] args) {
		
		Student student1 = new Student("Marko", "Markovic", 2, 3);
		Student student2 = new Student("Marko", "Kraljevic", 4, 5);
		
		student1.printProsek();
		student2.printProsek();
	}
}
