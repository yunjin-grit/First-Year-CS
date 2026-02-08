//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요: ");
		String str = sc.next();
		
		greeting(str);
		
		sc.close();
	}
	
	public static void greeting(String name) {
		System.out.print(name + "씨, 좋은 아침입니다.");
	}

}