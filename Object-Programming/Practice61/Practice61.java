//컴퓨터학과 20250492 이윤진
import java.util.Random;

public class Practice61 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rg = new Random();
		
		int count1000 = 0;
		int count9999 = 0;
		int n;
		
		for(int i = 0; i < 10000; i++) {			
			n = rg.nextInt(9000) + 1000;
			
			if(n == 1000) {
				System.out.print(n + "*\t");
				count1000++;
			}
			else if(n == 9999) {
				System.out.print(n + "+\t");
				count9999++;
			}
			else {
				System.out.print(n + "\t");
			}
			
			if((i + 1) % 10 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("# of 1000: " + count1000);
		System.out.println("# of 9999: " + count9999);
		
	}

}
