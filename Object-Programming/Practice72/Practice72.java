//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Shape 객체에 대한 정보를 입력하세요.");
		
		System.out.print("중심좌표 (X): ");
		int x1 = sc.nextInt();
		
		System.out.print("중심좌표 (Y): ");
		int y1 = sc.nextInt();
		
		Shape shape = new Shape(x1, y1);
		
		System.out.println("Circle 객체에 대한 정보를 입력하세요.");
		
		System.out.print("중심좌표 (X): ");
		int x2 = sc.nextInt();
		
		System.out.print("중심좌표 (Y): ");
		int y2 = sc.nextInt();

		System.out.print("반지름 : ");
		double r2 = sc.nextDouble();
		
		Circle c1 = new Circle(x2, y2, r2);
		
		int x3 = 0; int y3 = 0; double r3 = 0.0; double h1 = 0.0;
		Cylinder c2 = new Cylinder(x3, y3, r3, h1);
		
		System.out.println("Circle 객체2에 대한 정보를 입력하세요.");
		
		System.out.print("중심좌표 (X): ");
		int x4 = sc.nextInt();
		
		System.out.print("중심좌표 (Y): ");
		int y4 = sc.nextInt();

		System.out.print("반지름 : ");
		double r4 = sc.nextDouble();
		
		System.out.print("높이 : ");
		double h2 = sc.nextDouble();
		
		Cylinder c3 = new Cylinder(x4, y4, r4, h2);
		
		System.out.println("Shape 객체에 대한 정보입니다.");
		System.out.println(shape.toString());
		
		System.out.println("Circle 객체에 대한 정보입니다.");
		System.out.println(c1.toString());
		
		System.out.println("Cylinder 객체 1에 대한 정보입니다.");
		System.out.println(c2.toString());
		
		System.out.println("Cylinder 객체 2에 대한 정보입니다.");
		System.out.println(c3.toString());
		
		sc.close();
	}

}
