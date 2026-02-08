//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("box1 정보를 입력하세요.");
		
		System.out.print("가로: ");
		int x1 = sc.nextInt();
		
		System.out.print("세로: ");
		int y1 = sc.nextInt();

		System.out.print("높이: ");
		int z1 = sc.nextInt();
		
		Box b1 = new Box(x1, y1, z1);
		
		System.out.println("box2 정보를 입력하세요.");
		
		System.out.print("가로: ");
		int x2 = sc.nextInt();
		
		System.out.print("세로: ");
		int y2 = sc.nextInt();

		System.out.print("높이: ");
		int z2 = sc.nextInt();
		
		System.out.print("재질: ");
		String a2 = sc.next();
		
		MaterialBox b2 = new MaterialBox(x2, y2, z2, a2);
		
		System.out.println("box3 정보를 입력하세요.");
		
		System.out.print("가로: ");
		int x3 = sc.nextInt();
		
		System.out.print("세로: ");
		int y3 = sc.nextInt();

		System.out.print("높이: ");
		int z3 = sc.nextInt();
		
		System.out.print("재질: ");
		String a3 = sc.next();
		
		MaterialBox b3 = new MaterialBox(x3, y3, z3, a3);
		
		System.out.println("box1의 정보입니다.");
		System.out.println(b1.toString());
		
		System.out.println("box2의 정보입니다.");
		System.out.println(b2.toString());
		
		System.out.println("box3의 정보입니다.");
		System.out.println(b3.toString());
		
		sc.close();
	}

}
