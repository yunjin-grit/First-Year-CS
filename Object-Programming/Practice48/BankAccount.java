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
		rslt += "잔액: " + balance + "\n";
		rslt += String.format("이자율: %.2f%%\n", rate);
		rslt += "이자: " + calclnterest() + "원";
		return rslt;
	}
	
	private int calclnterest() {
		int c = 0;
		c = (int)(balance * (rate/100));
		return c;
	}
}
