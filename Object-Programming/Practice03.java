//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사각형의 가로 길이: ");
		int width = sc.nextInt();
		
		System.out.print("사각형의 세로 길이: ");
		int height = sc.nextInt();
		
		System.out.println("사각형의 넓이: " + (width * height));
		
		sc.close();
	}

}
