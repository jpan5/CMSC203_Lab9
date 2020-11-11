/* This program is to create two subclass of CheckingAmount and SavingsAmount to use to save 
 * and deposit money. Users can also create saving account in one bank account.
 * Programmer: Jie Pan
 */
public class SavingsAccount extends BankAccount{

	private double rate = 0.025; //Annual interest rate
	private int savingsNumber = 0;
	private String accountNumber;

	public SavingsAccount(String name, double amount) {
		//Call the constructor for superclass
		super(name, amount);
		this.accountNumber = super.getAccountNumber() + " - " + String.valueOf(savingsNumber);
	}
	
	public void postInterest() {
		//Calculate and deposit the interest
		double balance = (getBalance() * rate) /12;
	    deposit(balance);
	}
	
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	//Copy constructor
	public SavingsAccount(SavingsAccount s, double amount) {
		super(s, amount);
		savingsNumber++;
		this.accountNumber= super.getAccountNumber() + " - " + String.valueOf(savingsNumber);
	}
}
