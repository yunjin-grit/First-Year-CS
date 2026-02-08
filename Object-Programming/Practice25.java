//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = getInput(sc);
		
		printTimes(x);
		
		sc.close();
	}
	
	public static int getInput(Scanner sc) {
		int x;
		
		while(true) {
			System.out.print("정수를 입력하세요: ");
			x = sc.nextInt();
			
			if(x >= 1) {
				break;
			}
			
			System.out.println("잘못된 입력입니다. 다시 입력하세요.");
		}
		
		return x;
	}
	
	public static void printTimes(int x) {
		System.out.println("구구단 " + x + "단 입니다.");
		
		if(x <= 9) {
			for(int i = 1; i < 10; i++) {
				System.out.println(x + " * " + i + " = " + x * i);
			}
		}
		else {
			for(int i = 1; i <= x; i++) {
				System.out.println(x + " * " + i + " = " + x * i);
			}
		}
	}
	
}