//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Plane p0 = new Plane();
		Plane p1 = new Plane();
		Plane p2 = new Plane(2464737, "보잉 747", 150);
		
		System.out.println("디폴트 비행기의 정보입니다.");
		System.out.println(p0.toString());
		System.out.println("제주행 비행기의 정보입니다.");
		p1.setId(1030615);
		p1.setModel("보잉 737");
		p1.setCapacity(75);
		System.out.println(p1.toString());
		System.out.println("서울행 비행기의 정보입니다.");
		System.out.println(p2.toString());
		
		sc.close();
	}

}
