//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x 값을 입력하세요: ");
		double x = sc.nextDouble();
		
		if(x <= 0) {
			double fx1 = x * x * x - 9 * x + 2;
			String str1 = String.format("%.2f", fx1);
			System.out.println("f(x) = " + str1);
		}
		else {
			double fx2 = 7 * x + 2;
			String str2 = String.format("%.2f", fx2);
			System.out.println("f(x) = " + str2);
		}
			
		sc.close();
	}

}
