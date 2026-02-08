//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Vehicle 객체 vehicle을 생성합니다.");
		Vehicle v = new Vehicle();
		v.speed = sc.nextInt();
		v.heading = sc.nextInt();
		
		System.out.println("Car 객체 c1를 생성합니다.");
		Car c1 = new Car();
		c1.speed = sc.nextInt();
		int a1 = sc.nextInt();
		c1.turn(a1);
		c1.price = sc.nextInt();
		
		System.out.println("Car 객체 c2를 생성합니다.");
		Car c2 = new Car();
		c2.speed = sc.nextInt();
		int a2 = sc.nextInt();
		c2.turn(a2);
		c2.price = sc.nextInt();
		
		System.out.println("Truck 객체 truck를 생성합니다.");
		Truck t = new Truck();
		t.speed = sc.nextInt();
		int a3 = sc.nextInt();
		t.turn(a3);
		t.payload = sc.nextInt();
		
		System.out.println("Bus 객체 bus를 생성합니다.");
		Bus b = new Bus();
		b.speed = sc.nextInt();
		int a4 = sc.nextInt();
		b.turn(a4);
		b.seats = sc.nextInt();
		
		System.out.println("Vehicle 객체 vehicle의 정보입니다.");
		v.print();
		System.out.println("\n");
		
		System.out.println("Car 객체 c1의 정보입니다.");
		c1.printInfo();
		System.out.println("\n");
		
		System.out.println("Car 객체 c2의 정보입니다.");
		c2.printInfo();
		System.out.println("\n");
		
		System.out.println("Truck 객체 truck의 정보입니다.");
		t.printInfo();
		System.out.println("\n");
		
		System.out.println("Bus 객체 bus의 정보입니다.");
		b.printInfo();
		System.out.println("\n");
		
		sc.close();
	}

}
