//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count1 = 0;
		for(int i = 1; i < 101; i += 3) {
			System.out.print(i + "\t");
			count1++;
			
			if(count1 % 5 == 0) {
				System.out.println();
			}
		}
		System.out.println("\n");
		
		int i = 1;
		int count2 = 0;
		while(i <= 100) {
			System.out.print(i + "\t");
			count2++;
			i += 3;
			
			if(count2 % 5 == 0) {
				System.out.println();
			}
		}
		
		sc.close();
	}

}
