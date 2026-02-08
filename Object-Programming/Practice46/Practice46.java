//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Box b0 = new Box();
		Box b1 = new Box();
		Box b2 = new Box();
			
		b0.getX(); b0.getY(); b0.getZ();
			
		b1.setX(30); b1.setY(45); b1.setZ(53);
	    b1.fillBox();
		b1.getX(); b1.getY(); b1.getZ();
			
		b2.setX(100); b2.setY(60); b2.setZ(20);
		b2.getX(); b2.getY(); b2.getZ();
	        
		System.out.println("디폴트 상자의 정보입니다.");
		System.out.println(b0.toString());
		System.out.println("첫 번째 상자의 정보입니다.");
		System.out.println(b1.toString());
		System.out.println("두 번째 상자의 정보입니다.");
		System.out.println(b2.toString());
		
		sc.close();
	}

}
