//컴퓨터학과 20250492
import java.util.Scanner;
public class Practice31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.print("가로 입력: ");
		rec.width = sc.nextInt();
		
		System.out.print("세로 입력: ");
		rec.height = sc.nextInt();
		
		System.out.println("면적은 " + rec.width * rec.height + "입니다.");
		System.out.println("둘레는 " + (rec.width * 2 + rec.height * 2) + "입니다.");
		
		sc.close();
	}

}
