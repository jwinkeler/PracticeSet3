import java.util.Date;


public class Account {
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	
	
	public Account(int id, double balance){
		this.id=id;
		this.balance=balance;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
		
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public String getDateCreated() {
		return dateCreated.toString();
	}
	// method to return monthly interest rate
	public double getMonthlyInterestRate() {
		return (getAnnualInterestRate()/12);	
	}
	// method to withdraw a specific amount from an account
	public double withdraw(double AmountWithdrawn) throws InsufficientFundsException
	{
		double BalanceAfterWithdrawn;
		if(getBalance()>= AmountWithdrawn)
		{
			BalanceAfterWithdrawn = getBalance() - AmountWithdrawn; 
			setBalance(BalanceAfterWithdrawn);
			return(getBalance());
		}
		else {
			double needs = AmountWithdrawn - getBalance();
			throw new InsufficientFundsException (needs);
		}
		
	}
	//method to deposit a specific amount to the account
	public double deposit(double AmountAdded){
		double BalanceAfterAdded;
		BalanceAfterAdded = getBalance() + AmountAdded;
		setBalance(BalanceAfterAdded);
		return(getBalance());
	}
}