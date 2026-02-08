//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i < 10; i++) {
			for(int j = 2; j < 6; j++) {
				System.out.print( j + " * " + i + "= " + j * i + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i < 10; i++) {
			for(int j = 6; j < 10; j++) {
				System.out.print( j + " * " + i + "= " + j * i + "\t");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
