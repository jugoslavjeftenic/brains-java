package s049_kontrola_pristupa_i_enkapsulacija;

class Poruka {

	private String tekst;
	
	public void postaviTekst (String poruka) {
		this.tekst = poruka;
	}
	
	public void prikaziPoruku () {
		System.out.println(tekst);
	}
}

public class S054_Poruka_pristupni_atributi {

	public static void main(String[] args) {
		
		Poruka p = new Poruka();
		
//		p.tekst = "Zdravo Radovane!"; // nije vidljivo
		p.prikaziPoruku();

		p.postaviTekst("Zdravo svete!");
		p.prikaziPoruku();
	}
}
