//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요: ");
		int num = sc.nextInt();
		
		int count = 0;
		for(int i = 0; i <= num; i += 3) {
			System.out.print(i + "\t");
			count++;
			if(count % 5 == 0) {
				System.out.print("\n");
			}
		}
		
		sc.close();
	}

}
