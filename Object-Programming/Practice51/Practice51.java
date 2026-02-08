//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("제주행 비행기의 정보를 입력하세요.");
		Plane p1 = new Plane();
		int i1 = scan.nextInt();
		p1.setId(i1);
		String m1 = scan.next();
		p1.setModel(m1);
		int c1 = scan.nextInt();
		p1.setCapacity(c1);
		System.out.println("제주행 비행기의 정보입니다.");
		System.out.println(p1.toString());
		System.out.println("현재까지 추가된 비행기는 모두 " + Plane.getPlanes() + "대입니다.");
		
		System.out.println("서울행 비행기의 정보를 입력하세요.");
		int i2 = scan.nextInt();
		String m2 = scan.next();
		int c2 = scan.nextInt();
		Plane p2 = new Plane(i2, m2, c2);
		p2.setId(i2); p2.setModel(m2); p2.setCapacity(c2);
		System.out.println("서울행 비행기의 정보입니다.");
		System.out.println(p2.toString());
		System.out.println("현재까지 추가된 비행기는 모두 " + Plane.getPlanes() + "대입니다.");
		
		scan.close();
	}

}
