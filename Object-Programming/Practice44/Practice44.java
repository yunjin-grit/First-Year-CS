//컴퓨터학과 20250492 이윤진
import java.util.Scanner;

public class Practice44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

		// 여기에 필요한 코드를 작성하세요.
        Date birthday = new Date();
        Date adultday = new Date();
        
        int year = sc.nextInt();
        birthday.setYear(year);
        adultday.setYear(year+20);
        int month = sc.nextInt();
        birthday.setMonth(month);
        adultday.setMonth(month);
        int day = sc.nextInt();
        birthday.setDay(day);
        adultday.setDay(day);
        
        /*
        int bY = birthday.getYear();
        int bM = birthday.getMonth();
        int bD = birthday.getDay();
        int aY = adultday.getYear();
        int aM = adultday.getMonth();
        int aD = adultday.getDay();
        */
        
        String str1 = birthday.toString();
        String str2 = adultday.toString();
        
        System.out.println("당신의 생일은 "+str1);
        System.out.println("당신의 성년일은 "+str2);
        
		sc.close();
    }
}
