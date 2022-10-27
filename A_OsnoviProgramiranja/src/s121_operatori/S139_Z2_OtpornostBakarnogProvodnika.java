package s121_operatori;
  
public class S139_Z2_OtpornostBakarnogProvodnika {

	public static void main(String[] args) {
		
		double i = 1000.0, d = 0.005, rCu = 1.588e-8;
		double r = rCu * 4 * i / (d * d * Math.PI);
		
		System.out.println(r);
		System.out.println((double) 1588e-8);

	}
	
}
