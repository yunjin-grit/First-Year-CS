//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Circle 객체 정보를 입력하세요.");
		System.out.print("반지름 : ");
		double r1 = sc.nextDouble();
		Circle c = new Circle(r1);
		
		Cylinder c1 = new Cylinder();
		
		System.out.println("Cylinder 객체 2 정보를 입력하세요.");
		System.out.print("반지름 : ");
		double r2 = sc.nextDouble();
		System.out.print("높이 : ");
		double h = sc.nextDouble();
		Cylinder c2 = new Cylinder(r2, h);
		
		System.out.println("Circle 객체에 대한 정보입니다.");
		System.out.println("반지름 : " + String.format("%.2f", c.getRadius()));
		System.out.println("단면적 : " + String.format("%.2f", c.getArea()));
		
		System.out.println("Circle 객체 1에 대한 정보입니다.");
		System.out.println("반지름 : " + String.format("%.2f", c1.getRadius()));
		System.out.println("단면적 : " + String.format("%.2f", c1.getArea()));
		System.out.println("높이 : " + String.format("%.2f", c1.getRadius()));
		System.out.println("부피 : " + String.format("%.2f", c1.getArea()));
		
		System.out.println("Circle 객체 2에 대한 정보입니다.");
		System.out.println("반지름 : " + String.format("%.2f", c2.getRadius()));
		System.out.println("단면적 : " + String.format("%.2f", c2.getArea()));
		System.out.println("높이 : " + String.format("%.2f", c2.getHeight()));
		System.out.println("부피 : " + String.format("%.2f", c2.getVolume()));
		
		sc.close();
	}

}
