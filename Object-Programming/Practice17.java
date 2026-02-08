//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i < 11; i++) {
			for(int j = 1; j < 11; j++) {
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
		sc.close();
	}

}
