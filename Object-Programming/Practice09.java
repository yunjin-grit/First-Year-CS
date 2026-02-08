//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원뿔의 반지름: ");
		int r = sc.nextInt();
		
		System.out.print("원뿔의 높이: ");
		int h = sc.nextInt();
		
		final double Pl = 3.141592;
		
		double total = (((double)1/3) * Pl * r * r * h);
		
		String str  = String.format("%.2f", total);
		
		System.out.println("원뿔의 부피: " + str);
		
		sc.close();
	}

}
