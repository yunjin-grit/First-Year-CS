//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BankAccount b1 = new BankAccount();
		
		System.out.println("두 번째 은행 계좌의 정보를 입력하세요.");
		String a2 = sc.next();
		String n2 = sc.next();		
		int ba2 = sc.nextInt();		
		double r2 = sc.nextDouble();
		BankAccount b2 = new BankAccount(n2,ba2);
		b2.setAccNo(a2); b2.setName(n2); b2.setBalance(ba2); b2.setRate(r2);
		b2.getAccNo(); b2.getName(); b2.getBalance(); b2.getRate();		
		
		System.out.println("세 번째 은행 계좌의 정보를 입력하세요.");
		String a3 = sc.next();
		String n3 = sc.next();
		int ba3 = sc.nextInt();
		double r3 = sc.nextDouble();
		BankAccount b3 = new BankAccount(a3, n3, ba3, r3);
		b3.setAccNo(a3); b3.setName(n3); b3.setBalance(ba3); b3.setRate(r3);
		b3.getAccNo(); b3.getName(); b3.getBalance(); b3.getRate();
		
		System.out.println("첫 번째 은행 계좌의 정보입니다.");
		System.out.println(b1.toString());
	
		System.out.println("두 번째 은행 계좌의 정보입니다.");		
		System.out.println(b2.toString());
		
		System.out.println("세 번째 은행 계좌의 정보입니다.");		
		System.out.println(b3.toString());
		
		sc.close();
	}

}
