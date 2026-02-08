//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 짜리의 개수: ");
		int a = sc.nextInt();
		
		System.out.print("100원 짜리의 개수: ");
		int b = sc.nextInt();
		
		System.out.print("50원 짜리의 개수: ");
		int c = sc.nextInt();
		
		System.out.print("10원 짜리의 개수: ");
		int d = sc.nextInt();
		
		System.out.println("저금통에 있는 총액: " + (a * 500 + b * 100 + c * 50 + d * 10) + "원");
		
		sc.close();
	}

}
