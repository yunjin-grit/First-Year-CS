//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice59 {

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
		
		System.out.print("재질: ");
		String a1 = sc.next();
		
		MaterialBox b1 = new MaterialBox(x1, y1, z1, a1);
		//int v1 = b1.getX() * b1.getY() * b1.getZ();
		//double m1 = v1 * 1.1; 
		//String str1 = String.format("%.2f", m1);
		
		System.out.println();
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
		//int v2 = b2.getX() * b2.getY() * b2.getZ();
		//double m2 = v2 * 1.1;
		//String str2 = String.format("%.2f", m2);
		
		System.out.println("\nbox1의 정보입니다.");
		b1.printInfo();
		
		System.out.println("\nbox2의 정보입니다.");
		b2.printInfo();
		
		sc.close();
	}

}
