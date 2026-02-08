//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Movie m0 = new Movie();
		Movie m1 = new Movie();
		
		System.out.println("영화정보를 입력하세요.");
		System.out.print("관리번호: ");
		String m = sc.next();
		m1.setMid(m);
		m1.getMid();
		System.out.print("영화제목: ");
		String t = sc.next();
		m1.setTitle(t);
		m1.getTitle();
		System.out.print("감독 : ");
		String d = sc.next();
		m1.setDirector(d);
		m1.getDirector();
		System.out.print("제작년도 : ");
		int y = sc.nextInt();
		m1.setYear(y);
		m1.getYear();
		System.out.print("평점 : ");
		int s = sc.nextInt();
		m1.setScore(s);
		m1.getScore();
		
		
		
		m0.getMid(); m0.getTitle(); m0.getDirector(); m0.getYear(); m0.getScore();
		
		System.out.println("디폴트 영화의 정보입니다.");
        System.out.println(m0.toString());
        System.out.println("입력한 영화의 정보입니다.");
        System.out.println(m1.toString());
		
		
		sc.close();
	}

}
