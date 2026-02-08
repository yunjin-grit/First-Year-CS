//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("도형의 X좌표를입력하세요: ");
        int x1 = sc.nextInt();
        System.out.print("도형의 Y좌표를입력하세요: ");
        int y1 = sc.nextInt();
        Shape shape = new Shape(x1, y1);

        System.out.print("사각형의 X좌표를입력하세요: ");
        int x2 = sc.nextInt();
        System.out.print("사각형의 Y좌표를입력하세요: ");
        int y2 = sc.nextInt();
        System.out.print("사각형의 가로를입력하세요: ");
        int length = sc.nextInt();
        System.out.print("사각형의 세로를입력하세요: ");
        int width = sc.nextInt();
        Rectangle rect = new Rectangle(x2, y2, length, width);

        System.out.print("삼각형의 X좌표를입력하세요: ");
        int x3 = sc.nextInt();
        System.out.print("삼각형의 Y좌표를입력하세요: ");
        int y3 = sc.nextInt();
        System.out.print("삼각형의 밑변을입력하세요: ");
        int base = sc.nextInt();
        System.out.print("삼각형의 높이를입력하세요: ");
        int height = sc.nextInt();
        Triangle tri = new Triangle(x3, y3, base, height);

        System.out.println(shape);
        System.out.println(rect);
        System.out.println(tri);

        sc.close();

	}

}
