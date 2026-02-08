//컴퓨터학과 20250492 이윤진
public class Movie {
	private String title, director;
	private int score, year;
	private String mid;
	
	public void setTitle (String title) {
		this.title = title;
	}
	public void setScore (int score) {
		this.score = score;
	}
	public void setDirector (String director) {
		this.director = director;
	}
	public void setYear (int year) {
		this.year = year;
	}
	public void setMid (String mid) {
		this.mid = mid;
	}
	
	String getTitle() {
		return title;
	}
	int getScore() {
		return score;
	}
	String getDirector() {
		return director;
	}
	int getYear() {
		return year;
	}
	String getMid() {
		return mid;
	}
		
	public String toString() {
		String rslt = "";
		rslt += "관리번호: " + mid + "\n";
		rslt += "제목: " + title + "\n";
		rslt += "감독: " + director + "\n";
		rslt += "제작년도: " + year + "년\n";
		rslt += "평점: " + score + "점\n";
		return rslt;
	}
	
	public Movie() {
		mid = "없음";
		title = "모름"; director = "모름";
		year = -1; score = -1;
	}
	
	private static boolean compareDirector (Movie x, Movie y) {
		/*String dX = x.getDirector();
		String dY = y.getDirector();
		return dX.equals(dY);*/
		if(x.getDirector().equals(y.getDirector())) {
			return true;
		}
		else {
			return false;
		}
	}
	
	private static boolean compareYear (Movie x, Movie y) {
		if (x.getYear() == y.getYear()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static String compareMovies (Movie x, Movie y) {
		 boolean sameD = Movie.compareDirector(x, y);
		 boolean sameY = Movie.compareYear(x, y);
		 
		 if (sameD && sameY) {
			 String s1 = "영화 " + x.getMid() + "와 영화 " + y.getMid() + "는 감독이 같고 제작년도가 같습니다.";
			 return s1;
		 }
		 else if (sameD && !sameY) {
			 String s2 = "영화 " + x.getMid() + "와 영화 " + y.getMid() + "는 감독이 같고 제작년도가 다릅니다.";
			 return s2;
		 }
		 else if (!sameD && sameY) {
			 String s3 = "영화 " + x.getMid() + "와 영화 " + y.getMid() + "는 감독이 다르고 제작년도가 같습니다.";
			 return s3;
		 }
		 else {
			 String s4 = "영화 " + x.getMid() + "와 영화 " + y.getMid() + "는 감독이 다르고 제작년도가 다릅니다.";
			 return s4;
		 }
	}
}
