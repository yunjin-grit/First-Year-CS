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
		rslt += "계좌 번호: " + accNo + "\n";
		rslt += "이름: " + name + "\n";
		rslt += "잔액: " + balance + "원\n";
		rslt += String.format("이자율: %.2f%%\n", rate);
		rslt += "이자: " + calcInterest() + "원\n";
		return rslt;
	}
	
	private int calcInterest() {
		int c = 0;
		c = (int)(balance * (rate/100));
		return c;
	}
	
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
}
