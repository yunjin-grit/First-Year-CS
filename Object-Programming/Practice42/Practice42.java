//컴퓨터학과 20250492
import java.util.Scanner;
public class Practice42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Rectangle rec = new Rectangle();
		
		System.out.print("가로 입력: ");
		int w = sc.nextInt();
		rec.setWidth(w);
		
		System.out.print("세로 입력: ");
		int h = sc.nextInt();
		rec.setHeight(h);
		
		int width = rec.getWidth();
		int height = rec.getHeight();
		
		int area = rec.getArea();
		int perimeter = rec.getPerimeter();
		
		System.out.println("사각형의 가로는 " + width + "이고, 세로는 " + height + "입니다.");
		System.out.println("사각형의 넓이는 " + area + "이고, 둘레는 " + perimeter + "입니다.");
		
		sc.close();
	}

}
