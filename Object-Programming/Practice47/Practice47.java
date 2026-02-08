//컴퓨터학과 20250492 이윤진
import java.util.Scanner;

public class Practice47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Movie movie = new Movie();
		
		System.out.println("영화정보를 입력하세요.");
		System.out.print("영화 제목은? ");
		String t = sc.next();
		movie.setTitle(t);
		movie.getTitle();
		System.out.print("평점은? ");
		int s = sc.nextInt();
		movie.setScore(s);
		movie.getScore();
		System.out.print("감독은? ");
		String d = sc.next();
		movie.setDirector(d);
		movie.getDirector();
		System.out.print("개봉 년도는? ");
		int y = sc.nextInt();
		movie.setYear(y);
		movie.getYear();
		
		System.out.println("입력한 영화의 정보입니다.");
        System.out.println(movie.toString());
		
		
		sc.close();
	}

}
