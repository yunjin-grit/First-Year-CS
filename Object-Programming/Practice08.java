//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("거스름돈 총액: ");
		int money = sc.nextInt();
		
		System.out.println("500원짜리 동전: " + money / 500 + "개");
		System.out.println("100원짜리 동전: " + money % 500 / 100 + "개");
		System.out.println("50원짜리 동전: " + money % 500 % 100 / 50 + "개");
		System.out.println("10원짜리 동전: " + money % 500 % 100 % 50 / 10 + "개");
		System.out.println("1원짜리 동전: " + money % 500 % 100 % 50 % 10 / 1 + "개");
		
		sc.close();
	}

}
