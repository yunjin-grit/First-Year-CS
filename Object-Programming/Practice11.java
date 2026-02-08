//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키를 입력하세요: ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게를 입력하세요: ");
		double weight = sc.nextDouble();
		
		double ave = (height - 100) * 0.9;
		String str = String.format("%.2f", ave);
		
		System.out.println("표중체중은 " + str + "입니다.");
		
		if( weight > ave ) {
			System.out.println("과체중입니다.");
		}
		else if( weight == ave ) {
			System.out.println("정상체중입니다.");
		}
		else {
			System.out.println("저체중입나다.");
		}
		
		sc.close();
	}

}
