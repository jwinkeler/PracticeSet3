
public class InsufficientFundsException extends Exception {

	private double AmountNeeded=0;


	public InsufficientFundsException(double AmountNeeded) {
		this.AmountNeeded = AmountNeeded;
	}

	public double getAmountNeeded(){
		return AmountNeeded;
	}
}
