//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하세요: ");
		int first = sc.nextInt();
		
		System.out.print("두 번째 숫자를 입력하세요: ");
		int second = sc.nextInt();
		
		System.out.print("세 번째 숫자를 입력하세요: ");
		int third = sc.nextInt();
		
		if( first < second ) {
			if( first < third ) {
				System.out.println("가장 작은 숫자는 " + first + "입니다.");
			}
			else {
				System.out.println("가장 작은 숫자는 " + third + "입니다.");
			}
		}
		else {
			if( second > third ) {
				System.out.println("가장 작은 숫자는 " + third + "입니다.");
			}
			else {
				System.out.println("가장 작은 숫자는 " + second + "입니다.");
			}
		}
		
		sc.close();
	}

}
