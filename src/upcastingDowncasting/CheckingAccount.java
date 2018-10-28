package upcastingDowncasting;

public class CheckingAccount extends BankAccount {
	 private double serviceCharge;

	public double getServiceCharge() {
		return serviceCharge;
	}

	public void setServiceCharge(double serviceCharge) {
		this.serviceCharge = serviceCharge;
	}
}
