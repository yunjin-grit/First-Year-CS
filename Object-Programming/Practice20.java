//컴퓨텋학과 20250492 이윤진
import java.util.Scanner;
public class Practice20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		show();
		System.out.println("The biggest adventure you can ever take is");
		show();
		System.out.println("to live the life of your dreams.");
		show();
		
		sc.close();
	}

	public static void show() {
		for(int i = 0; i < 30; i++) {
			System.out.print("*");	
		}
		System.out.println();
	}
}
