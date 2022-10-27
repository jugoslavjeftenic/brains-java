package s259_mali_fudbal;

public class Tim {

	private String imeTima, grad;
	private int brojIgraca;
	
	public Tim() {}

	public Tim(String imeTima, String grad, int brojIgraca) {
		this.imeTima = imeTima;
		this.grad = grad;
		this.brojIgraca = brojIgraca;
	}

	public String getImeTima() {
		return imeTima;
	}

	public void setImeTima(String imeTima) {
		this.imeTima = imeTima;
	}

	public String getGrad() {
		return grad;
	}

	public void setGrad(String grad) {
		this.grad = grad;
	}

	public int getBrojIgraca() {
		return brojIgraca;
	}

	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}
}
