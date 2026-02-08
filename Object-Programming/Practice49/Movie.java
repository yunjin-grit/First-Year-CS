//컴퓨터학과 20250492 이윤진
public class Movie {
	private String title, director;
	private int score, year;
	private String mid;
	
	public void setTitle(String title) {
		this.title = title;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setMid(String mid) {
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
	
}
