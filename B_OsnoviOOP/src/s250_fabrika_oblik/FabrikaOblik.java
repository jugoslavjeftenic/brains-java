package s250_fabrika_oblik;

public class FabrikaOblik {

	public static Figura dajMiFiguru(String imeFigure) {
		if (imeFigure == null)
			return null;
		if (imeFigure.equals("pravougaonik"))
			return new Pravugaonik();
		if (imeFigure.equals("krug"))
			return new Krug();
		return null;
	}
}
