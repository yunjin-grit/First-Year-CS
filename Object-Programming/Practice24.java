//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요: ");
		int x = sc.nextInt();
		
		printTimes(x);
		
		sc.close();
	}
	
	public static void printTimes(int x) {
		System.out.println("구구단 " + x + "단 입니다.");
		for(int i = 1; i < 10; i++) {
			System.out.println(x + " * " + i + " = " + x * i);
		}
	}

}
