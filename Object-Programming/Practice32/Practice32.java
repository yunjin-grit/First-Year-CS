//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle();
		
		System.out.println("첫 번째 사각형의 정보를 입력하세요.");		
		System.out.print("가로 입력: ");
		rec1.width = sc.nextInt();
		System.out.print("세로 입력: ");
		rec1.height = sc.nextInt();
		
		System.out.println("두 번째 사각형의 정보를 입력하세요.");
		System.out.print("가로 입력: ");
		rec2.width = sc.nextInt();
		System.out.print("세로 입력: ");
		rec2.height = sc.nextInt();
		System.out.println();
		
		System.out.println("첫 번째 사각형의 면적은 " + rec1.width * rec1.height + "입니다.");
		System.out.println("첫 번째 사각형의 둘레는 " + (rec1.width * 2 + rec1.height * 2) + "입니다.");
		
		System.out.println("두 번째 사각형의 면적은 " + rec2.width * rec2.height + "입니다.");
		System.out.println("두 번째 사각형의 둘레는 " + (rec2.width * 2 + rec2.height * 2) + "입니다.");
		
		sc.close();
	}

}
