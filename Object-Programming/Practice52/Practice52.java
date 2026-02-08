//컴퓨터학과 20250492 이윤진
import java.util.Scanner;

public class Practice52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		// 여기에 필요한 코드를 작성하세요.
        System.out.println("첫 번째 날짜를 입력하세요.");
        System.out.print("년도: ");
        int y1 = sc.nextInt();
        System.out.print("월: ");
        int m1 = sc.nextInt();
        System.out.print("일: ");
        int day1 = sc.nextInt();
        Date d1 = new Date(y1, m1, day1);
        d1.setYear(y1); d1.setMonth(m1); d1.setDay(day1);
        d1.getYear(); d1.getMonth(); d1.getDay();
        
        System.out.println("두 번째 날짜를 입력하세요.");
        System.out.print("년도: ");
        int y2 = sc.nextInt();
        System.out.print("월: ");
        int m2 = sc.nextInt();
        System.out.print("일: ");
        int day2 = sc.nextInt();
        Date d2 = new Date();
        d2.setYear(y2); d2.setMonth(m2); d2.setDay(day2);
        d2.getYear(); d2.getMonth(); d2.getDay();
        
        int rslt = Date.compareDate(d1, d2);

        if(rslt == -1) {
        	System.out.println("첫 번째 날짜인 " + d1.toString() + "이 앞선 날짜입니다.");
        }
        else if(rslt == 1) {
        	System.out.println("두 번째 날짜인 " + d2.toString() + "이 앞선 날짜입니다.");
        }
        else {
        	System.out.println("두 날짜는 같은 날짜입니다.");
        }
        
		sc.close();
    }
}
