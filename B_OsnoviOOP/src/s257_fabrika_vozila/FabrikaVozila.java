package s257_fabrika_vozila;


public class FabrikaVozila {
	public static Proizvod pokreniProizvodnju(String vrstaProizvoda) {
		if (vrstaProizvoda == null)
			return null;
		if (vrstaProizvoda.equalsIgnoreCase("automobil"))
			return new Automobil();
		if (vrstaProizvoda.equalsIgnoreCase("kamion"))
			return new Kamion();
		if (vrstaProizvoda.equalsIgnoreCase("motocikl"))
			return new Motocikl();
		return null;
	}
}
