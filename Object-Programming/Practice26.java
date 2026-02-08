//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번째 숫자를 입력하세요: ");
			num[i] = sc.nextInt();
		}
		
		System.out.println("입력된 숫자는 다음과 같습니다.");
		for(int i = 0; i < 5; i++) {
			System.out.print(num[i] + "\t");
		}
		System.out.println();
		
		System.out.println("역순 출력입니다.");
		for(int i = 4; i >= 0; i--) {
			System.out.print(num[i] + "\t");
		}
		System.out.println();
		
		int max = -1;
		for(int i = 0; i < 5; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		System.out.println("가장 큰 수는 " + max + "입니다.");
				
		sc.close();
	}

}
