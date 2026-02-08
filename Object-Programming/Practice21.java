//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int n1 = sc.nextInt();
		
		System.out.print("정수를 입력하세요: ");
		int n2 = sc.nextInt();
		
		sum(n1, n2);
		sum(n2, n1);
		
		sc.close();
	}

	public static void sum(int x, int y) {
		System.out.println(x + " + " + y + " = " + (x + y));
	}
	
}
