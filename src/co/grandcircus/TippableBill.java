package co.grandcircus;

public class TippableBill extends Bill {
	private double tip;

	public TippableBill() {
	}

	public TippableBill(double subtotal, double taxRate, double tip) {
		super(subtotal, taxRate);
		this.tip = tip;
	}

	@Override
	public double calcTotal() {
		double total = (super.getSubtotal() * (1 + super.getTaxRate()) + tip);
		return total;
	}

	@Override
	public String toString() {
		return "TippableBill [tip=" + tip + ", calcTotal()=" + calcTotal() + "]";
	}
}
