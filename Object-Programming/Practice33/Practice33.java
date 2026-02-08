//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BankAccount bank = new BankAccount();
		
		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		
		bank.name = "김동덕";
		bank.accNo = "1234-5678";
		bank.balance = 100;
		bank.rate = 0.00;
		String str = String.format("%.2f", bank.rate);
		
		System.out.println("이름: " + bank.name);
		System.out.println("계좌번호: " + bank.accNo);
		System.out.println("잔액: " + bank.balance + "원");
		System.out.println("이자율: " + str + "%");
		
		System.out.println("");
		System.out.println("두 번째 은행 계좌의 정보입니다.");
		
		bank.name = "홍길동";
		bank.accNo = "9999-2531";
		bank.balance = 2000;
		bank.rate = 2.15;
		
		System.out.println("이름: " + bank.name);
		System.out.println("계좌번호: " + bank.accNo);
		System.out.println("잔액: " + bank.balance + "원");
		System.out.println("이자율: " + bank.rate + "%");
		
		sc.close();
	}

}
