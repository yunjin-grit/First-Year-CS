//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 마일을 입력하세요: ");
		double mile = sc.nextDouble();
		
		String mileStr = String.format("%.2f", mile);
		String kmStr = String.format("%.2f", mile * 1.609);
		
		System.out.println(mileStr +"마일은 " + kmStr + "킬로미터입니다.");
		
		sc.close();
	}

}
