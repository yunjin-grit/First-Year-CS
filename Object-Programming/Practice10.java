//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨 온도: ");
		int f = sc.nextInt();
		
		double c = (((double)5/9) * (f - 32));
		String str = String.format("%.2f", c);
		
		System.out.println("화씨 " + f + "도는 섭씨" + str + "에 해당합니다.");
		
		sc.close();
	}

}
