//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("받은 돈: ");
		int money = sc.nextInt();
		
		System.out.print("상품의 총액: ");
		int total = sc.nextInt();
		
		System.out.println("부가세: " + (int)(total * 0.1));
		System.out.println("잔돈: " + (money - total));
		
		sc.close();
		
	}

}
