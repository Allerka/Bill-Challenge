package co.grandcircus;

public class RestaurantApp {

	public static void main(String[] args) {
		Bill bill = new Bill(15.80, 0.06);
		TippableBill tippableBill = new TippableBill(8.50, 0.06, 2.00);

		pay(bill);
		pay(tippableBill);
	}

	public static void pay(Bill bill) {
		System.out.println("$" + bill.calcTotal());
		return;
	}

}
