//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int x = sc.nextInt();
		
		System.out.print("입력된 정수 " + x + "의 절대값은 " + abs(x) + "입니다.");
		
		sc.close();
	}
	
	public static int abs(int n) {
		if(n >= 0) {
			return n;
		}
		else {
			return -n;
		}
	}

}
