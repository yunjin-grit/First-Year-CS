//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
Average ave = new Average();
		
		//System.out.print("원하는 기능을 선택하세요(1-정수, 2-실수) : ");
		int n = sc.nextInt();
		int num;
		if(n==1) {
			int first, second, third;
			//System.out.print("평균 값을 원하는 정수의 개수를 입력하세요: ");
			num=sc.nextInt();
			if(num==2) {
				first = sc. nextInt();
				second = sc.nextInt();
				int total = ave.getAverage(first, second);
				System.out.println(num + "개 정수의 평균은 " + total+"입니다.");
			}
			if(num==3) {
				first = sc. nextInt();
				second = sc.nextInt();
				third = sc.nextInt();
				int total = ave.getAverage(first, second, third);
				System.out.println(num + "개 정수의 평균은 " + total+"입니다.");
			}
		}
		
		if(n==2) {
			//System.out.print("평균 값을 원하는 정수의 개수를 입력하세요: ");
			double first, second, third;
			num=sc.nextInt();
			if(num==2) {
				first = sc. nextDouble();
				second = sc.nextDouble();
				double total = ave.getAverage(first, second);
				String str = String.format("%.2f", total);
				System.out.println(num +"개 실수의 평균은 " +str+"입니다.");
			}
			if(num==3) {
				first = sc. nextDouble();
				second = sc.nextDouble();
				third = sc.nextDouble();
				double total = ave.getAverage(first, second, third);
				String str = String.format("%.2f", total);
				System.out.println(num +"개 실수의 평균은 " + str + "입니다.");
			}
		}
		
		
		
		sc.close();
	}

}
