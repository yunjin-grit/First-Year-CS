//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원기둥의 반지름: ");
		int r = sc.nextInt();
		
		System.out.print("원기둥의 높이: ");
		int h = sc.nextInt();
		
		final double Pl = 3.141592;
		
		System.out.println("원기둥의 부피: " + (Pl * r * r * h));
		
		sc.close();
	}

}
