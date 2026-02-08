//컴퓨터학과 20250492 이윤진
public class BankAccount {
	private String name, accNo;
	private int balance;
	private double rate;
	
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	String getAccNo() {
		return accNo;
	}
	String getName() {
		return name;
	}
	int getBalance() {
		return balance;
	}
	double getRate() {
		return rate;
	}
	
	public String toString() {
		String rslt = "";
		rslt += accNo + " :: " + name + " :: " + balance + "원 :: " + String.format("%.2f%%\n", rate);
		return rslt;
	}
	/*
	private int calcInterest() {
		int c = 0;
		c = (int)(balance * (rate/100));
		return c;
	}
	*/
	public BankAccount() {
		this("없음", "모름", 0, 0);
	}
	public BankAccount(String name, int balance) {
		this("없음", name, balance, 0);
	}
	public BankAccount(String accNo, String name, int balance, double rate) {
		this.accNo = accNo;
	    this.name = name;
	    this.balance = balance;
	    this.rate = rate;
	}
	
	public boolean deposit(int money) {
		if(money < 0) {
			return false;
		}
		balance += money;
		return true;
	}	
	public boolean withdraw(int money) {
		if(money < 0 || money > balance) {
			return false;
		}
		balance -= money;
		return true;
	}
	public static boolean transfer(BankAccount from, BankAccount to, int money) {
		boolean d = to.deposit(money);
		boolean w = from.withdraw(money);
		
		if(!w) {
			return false;
		}
		else {
			if(!d) {
				from.deposit(money);
				return false;
			}
		}
		return true;
	}
}
