package Account;

public class Account {
	private int accountNumber;
	private double balance;
	
	public Account(){
		this.accountNumber = 0;
		this.balance =0;
	}
	public Account(int accountNumber){
		this.accountNumber = accountNumber;
		this.balance = 0;
	}
	public Account(int accountNumber, double balance){
		this.accountNumber= accountNumber;
		this.balance = balance;
	}
	
	public void setAccountNumber(int accountNumber){
		this.accountNumber = accountNumber;
	}
	public int getAccountNumber(){
		return this.accountNumber;
	};
	public void setBalance(double balance){
		this.balance = balance;
	}
	public double getBalance(){
		return this.balance;
	}
	
	public void credit(double amount){
		System.out.println("Credit amount "+amount);
		this.balance+=amount;
	}
	public void debit(double amount){
		if(this.balance<amount){
			System.out.println("insufficient fund: "+this.balance);
			return;
		}
		System.out.println("debiting amount: "+amount);
		this.balance-=amount;
	}
	public String toString(){
		return "Account number" +this.accountNumber+"Balance:"+this.balance;
	}

}
