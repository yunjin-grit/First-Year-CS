//컴퓨터학과 20250492 이윤진
import java.util.Scanner;

public class Practice53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Movie m1 = new Movie();
		Movie m2 = new Movie();
		Movie m3 = new Movie();
		
		System.out.println("영화정보를 입력하세요.");		
		System.out.print("관리번호: ");
		String mid1 = sc.next();
		m1.setMid(mid1);		
		System.out.print("영화제목: ");
		String t1 = sc.next();
		m1.setTitle(t1);		
		System.out.print("감독 : ");
		String d1 = sc.next();
		m1.setDirector(d1);
		System.out.print("제작년도 : ");
		int y1 = sc.nextInt();
		m1.setYear(y1);
		System.out.print("평점 : ");
		int s1 = sc.nextInt();
		m1.setScore(s1);
		
		System.out.println("\n영화정보를 입력하세요.");
		System.out.print("관리번호: ");
		String mid2 = sc.next();
		m2.setMid(mid2);
		System.out.print("영화제목: ");
		String t2 = sc.next();
		m2.setTitle(t2);
		System.out.print("감독 : ");
		String d2 = sc.next();
		m2.setDirector(d2);		
		System.out.print("제작년도 : ");
		int y2 = sc.nextInt();
		m2.setYear(y2);		
		System.out.print("평점 : ");
		int s2 = sc.nextInt();
		m2.setScore(s2);
		
		System.out.println("\n영화정보를 입력하세요.");
		System.out.print("관리번호: ");
		String mid3 = sc.next();
		m3.setMid(mid3);		
		System.out.print("영화제목: ");
		String t3 = sc.next();
		m3.setTitle(t3);		
		System.out.print("감독 : ");
		String d3 = sc.next();
		m3.setDirector(d3);		
		System.out.print("제작년도 : ");
		int y3 = sc.nextInt();
		m3.setYear(y3);		
		System.out.print("평점 : ");
		int s3 = sc.nextInt();
		m3.setScore(s3);
		
		System.out.println("\n입력한 영화의 정보입니다.\n");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		
		String str1 = Movie.compareMovies(m1, m2);
		String str2 = Movie.compareMovies(m1, m3);
		String str3 = Movie.compareMovies(m2, m3);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		sc.close();
	}

}
