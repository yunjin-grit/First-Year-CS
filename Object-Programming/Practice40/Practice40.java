//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice40{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Date birthday = new Date();
		Date adultday = new Date();
		
		System.out.print("태어난 년도를 입력하세요: ");
		int y = sc.nextInt();
		birthday.setYear(y);
		
		System.out.print("태어난 월을 입력하세요: ");
		int m = sc.nextInt();
		birthday.setMonth(m);
		
		System.out.print("태어난 날짜를 입력하세요: ");
		int d = sc.nextInt();
		birthday.setDay(d);
		System.out.println("");
		
		adultday.setYear(y + 20);
		adultday.setMonth(m);
		adultday.setDay(d);
		
		String s1 = birthday.toString();
		String s2 = adultday.toString();
		
		System.out.println("당신의 생일은 " + s1 + "입니다.");
		System.out.println("당신의 성년일은 " + s2 + "입니다.");
		System.out.println("당신의 생일은 " + s1 + "입니다.");
		
		sc.close();
	}

}
