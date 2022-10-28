package s121_operatori;

public class S139_Z3_Pritisak {

	public static void main(String[] args) {
		
		final double R = 8.314472;			// gasna konstanta J/(mol * K)
		int n = 1, v = 1;					// n = 1 mol, v = 1 kubni metar
		double t = 273.15;					// 273.15 Kelvin = 0 Celsius
		
		double p = (double) n * R * t / v;	// apsolutni pritisak gasa (Pa)
		
		System.out.println("Rezultat je " + p + " Pa.");
	}
}
