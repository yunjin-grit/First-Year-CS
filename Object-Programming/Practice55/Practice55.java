//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Shape s = new Shape();
		System.out.println("Shape 객체 정보를 입력하세요.");
		s.x = sc.nextInt();
		s.y = sc.nextInt();
		
		System.out.println("첫번째 Circle 객체 정보를 입력하세요.");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		Circle c1 = new Circle(r1);
		c1.x = x1;
		c1.y = y1;
		
		
		System.out.println("두번째 Circle 객체 정보를 입력하세요.");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		Circle c2 = new Circle(r2);
		c2.x = x2;
		c2.y = y2;
		
		System.out.println("Shape 객체 정보입니다.");
		s.print();
		System.out.println();
		
		System.out.println("첫번째 Circle 객체 정보입니다.");
		c1.draw();
		System.out.println();
		
		System.out.println("두번째 Circle 객체 정보입니다.");
		c2.draw();
		System.out.println("\n");
		
		if(compareArea(c1, c2) == 1) {
			System.out.println("첫번째 원의 면적이 더 넓습니다.");
		}
		else if(compareArea(c1, c2) == -1) {
			System.out.println("두번째 원의 면적이 더 넓습니다.");
		}
		else {
			System.out.println("두 원의 면적이 같습니다.");
		}
		
		
		
		sc.close();
	}
	
	public static int compareArea(Circle c1, Circle c2) {
		 if(c1.getArea() > c2.getArea()) {
				return 1;
			}
			else if (c1.getArea() < c2.getArea()) {
				return -1;
			}
			else {
				return 0;
			}
	 }

}
