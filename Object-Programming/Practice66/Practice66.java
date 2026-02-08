//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("도형의 정보를 입력하세요.");
		System.out.print("중심좌표의 X값 : ");
		int x1 = sc.nextInt();
		System.out.print("중심좌표의 Y값 : ");
		int y1 = sc.nextInt();
		Shape shape = new Shape(x1, y1);
		
		System.out.println("사각형의 정보를 입력하세요.");
		System.out.print("중심좌표의 X값 : ");
		int x2 = sc.nextInt();
		System.out.print("중심좌표의 Y값 : ");
		int y2 = sc.nextInt();
		System.out.print("가로길이 : ");
		int w = sc.nextInt();
		System.out.print("세로길이 : ");
		int h = sc.nextInt();		
		Rectangle rec = new Rectangle(x2, y2, w, h);
		
		System.out.println("\n만들어진 도형의 정보는 다음과 같습니다.");
		System.out.println(shape.toString());
		rec.printInfo();
		
		sc.close();
	}

}
