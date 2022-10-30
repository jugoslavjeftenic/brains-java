package s999_zavrsni_test;

public class Trgovac {

	private Osoba trgovac;
	private String licenca;
	
	public Trgovac(Osoba trgovac, String licenca) {
		this.trgovac = trgovac;
		this.licenca = licenca;
	}

	public Osoba getTrgovac() {
		return trgovac;
	}

	public void setTrgovac(Osoba trgovac) {
		this.trgovac = trgovac;
	}

	public String getLicenca() {
		return licenca;
	}

	public void setLicenca(String licenca) {
		this.licenca = licenca;
	}
}
