
public class CheckingAccount extends BankAccount{

	//The cost fee for check clearing
	protected static double FEE = 0.15;
	
	public CheckingAccount(String name, double amount) {
		//Call the constructor for superclass
		super(name, amount);
		this.setAccountNumber(this.getAccountNumber() + "-10");
	}
	
	
	public boolean withdraw(double amount) {
		//Add the fee to withdraw amount
		double newAmount = amount + FEE;
		return super.withdraw(newAmount);
		
	}
}
