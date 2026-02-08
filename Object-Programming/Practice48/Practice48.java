//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BankAccount b1 = new BankAccount();
		BankAccount b2 = new BankAccount();
		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		
		b1.setAccNo("1234-5678");
		b1.setName("김동덕");
		b1.setBalance(100);
		b1.setRate(0.00);
		
		b1.getAccNo(); b1.getName(); b1.getBalance(); b1.getRate();
		
		System.out.println(b1.toString());
		
		System.out.println("두 번째 은행 계좌의 정보입니다.");
		
		b2.setAccNo("9999-2531");
		b2.setName("홍길동");
		b2.setBalance(2000);
		b2.setRate(2.15);
		
		b2.getAccNo(); b2.getName(); b2.getBalance(); b2.getRate();
		
		System.out.println(b2.toString());
		
		sc.close();
	}

}
