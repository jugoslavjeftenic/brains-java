package s049_kontrola_pristupa_i_enkapsulacija;

class PorukaGetSet {

<<<<<<< HEAD
=======
	/*
	 *  *-------------------*
	 *  |Poruka             |
	 *  *-------------------*
	 *  |-tekst:String      |
	 *  *-------------------*
	 *  |Poruka:            |
	 *  |+tekst:String      |
	 *  |+setTekst:void     |
	 *  |+prikaziPoruku:void|
	 *  *-------------------*
	 */

>>>>>>> branch 'master' of https://github.com/jugoslavjeftenic/brains.git
	private String tekst;
	
	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public void prikaziPoruku() {
		System.out.println(getTekst());
	}
}

public class S060_Poruka_pristupne_metode {

	public static void main(String[] args) {
		
		PorukaGetSet p = new PorukaGetSet();
		
		p.setTekst("Zdravo svete!");
		System.out.println(p.getTekst());
	}
}
