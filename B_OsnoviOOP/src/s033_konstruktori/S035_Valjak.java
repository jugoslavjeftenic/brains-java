package s033_konstruktori;

class Valjak {
	
	float r, H;
	
	Valjak() {
		r = 0;
		H = 0;
	}
	
	Valjak(float r1, float H1) {
		r = r1;
		H = H1;
	}
	
	float pribaviPoluprecnik() {
		return r;
	}
	
	float pribaviVisinu() {
		return H;
	}
	
	double pribaviZapreminuValjka() {
		return r * r * Math.PI * H;
	}
}

public class S035_Valjak {

	public static void main(String[] args) {
		
		Valjak prazno = new Valjak();
		Valjak cev = new Valjak(2.0f, 200.0f);
		
		System.out.printf("Zapremina objekta oblika valjka poluprecnika %.2f i visine %.2f je: %.2f.\n",
			prazno.pribaviPoluprecnik(), prazno.pribaviVisinu(), prazno.pribaviZapreminuValjka());
		System.out.printf("Zapremina objekta oblika valjka poluprecnika %.2f i visine %.2f je: %.2f.\n",
			cev.pribaviPoluprecnik(), cev.pribaviVisinu(), cev.pribaviZapreminuValjka());
	}
}
