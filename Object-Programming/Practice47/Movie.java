//컴퓨터학과 20250492 이윤진
public class Movie {
	private String title, director;
	private int score, year;
	
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
		
	public String toString() {
		String rslt = "";
		rslt += "제목: " + title + "\n";
		rslt += "평점: " + score + "\n";
		rslt += "감독: " + director + "\n";
		rslt += "개봉년도: " + year;
		return rslt;
	}
	
}
