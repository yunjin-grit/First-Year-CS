//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BankAccount b0 = new BankAccount();
		b0.setAccNo("1234-5678");
	    b0.setName("김동덕");
	    b0.setBalance(100);
	    b0.setRate(3.10);
	    b0.getAccNo(); b0.getName(); b0.getBalance(); b0.getRate();
	    
		BankAccount b1 = new BankAccount("홍길동", 2000);
		b1.setAccNo("3456-7890");
		b1.setRate(2.15);
		b1.getAccNo(); b1.getName(); b1.getBalance(); b1.getRate();
		
        BankAccount b2 = new BankAccount("9999-2531", "성춘향", 500, 2.05);
        b2.getAccNo(); b2.getName(); b2.getBalance(); b2.getRate();
		
		System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.print(b0.toString());
        System.out.print(b1.toString());
        System.out.print(b2.toString() + "\n");
		
        System.out.print("계좌 1000-2345에 입금할 금액을 입력하세요: ");
        int m0 = sc.nextInt();
        if(b0.deposit(m0)) {
        	System.out.println("입금이 성공했습니다.\n");
        }
        else {
        	System.out.println("입금이 실패했습니다.\n");
        }
        
        System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.print(b0.toString());
        System.out.print(b1.toString());
        System.out.print(b2.toString() + "\n");
        
        System.out.print("계좌 1234-5678에서 출금할 금액을 입력하세요: ");
        int m1 = sc.nextInt();
        if(b1.withdraw(m1)) {
        	System.out.println("출금이 성공했습니다.\n");
        }
        else {
        	System.out.println("출금이 실패했습니다.\n");
        }
        
        System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.print(b0.toString());
        System.out.print(b1.toString());
        System.out.print(b2.toString() + "\n");
        
        System.out.print("계좌 1234-5678에서 계좌 9999-2531으로 송금할 금액을 입력하세요: ");
        int m2 = sc.nextInt();
        if(BankAccount.transfer(b1, b2, m2)) {
        	System.out.println("송금이 성공했습니다.\n");
        }
        else {
        	System.out.println("송금이 실패했습니다.\n");
        }
        
        System.out.println("은행 계좌 모두의 정보입니다.");
		System.out.print(b0.toString());
        System.out.print(b1.toString());
        System.out.print(b2.toString());
        
		sc.close();
	}

}
