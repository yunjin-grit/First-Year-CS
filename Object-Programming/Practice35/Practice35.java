//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Plane plane1 = new Plane();
		Plane plane2 = new Plane();
		Plane plane3 = new Plane();
		
		System.out.println("디폴트 비행기의 정보입니다.");
		plane1.id = 0;
		plane1.model = "모름";
		plane1.capacity = 0;
		System.out.println("식별번호: " + plane1.id + "편");
		System.out.println("모델: " + plane1.model);
		System.out.println("승객수: " + plane1.capacity + "명");
		
		System.out.println("제주행 비행기의 정보입니다.");
		plane2.id = 1030615;
		plane2.model = "보잉 737";
		plane2.capacity = 75;
		System.out.println("식별번호: " + plane2.id + "편");
		System.out.println("모델: " + plane2.model);
		System.out.println("승객수: " + plane2.capacity + "명");
		
		System.out.println("서울행 비행기의 정보입니다.");
		plane3.id = 2463747;
		plane3.model = "보잉 747";
		plane3.capacity = 150;
		System.out.println("식별번호: " + plane3.id + "편");
		System.out.println("모델: " + plane3.model);
		System.out.println("승객수: " + plane3.capacity + "명");
		
		sc.close();
	}

}
