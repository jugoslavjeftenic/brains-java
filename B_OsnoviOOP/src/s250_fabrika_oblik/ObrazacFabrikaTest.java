package s250_fabrika_oblik;

public class ObrazacFabrikaTest {

	public static void main(String[] args) {

		Figura f = FabrikaOblik.dajMiFiguru("pravougaonik");
		f.crtaj();
		
		f = FabrikaOblik.dajMiFiguru("krug");
		f.crtaj();
	}
}
