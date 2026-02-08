//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("The biggest adventure you can ever take is");
		show();
		System.out.print("to live the life of your dreams.");
		
		sc.close();
	}
	
	public static void show() {
		for(int i = 0; i < 30; i++) {
			System.out.print("*");	
		}
		System.out.println();
	}
}
