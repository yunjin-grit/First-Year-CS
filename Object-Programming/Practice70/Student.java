//컴퓨터학과 20250492 이윤진
public class Student {
	private int id;
	private int tuition;
	private double gpa;
	
	public void setTuition(int tuition) {
		this.tuition = tuition;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	int getId() {
		return id;
	}
	int getTuition() {
		return tuition;
	}
	double getGpa() {
		return gpa;
	}
	
	public Student() {
		this(0, 0, 0.0);
	}
	
	public Student(int id, int tuition, double gpa) {
		this.id = id;
		this.tuition = tuition;
		this.gpa = gpa;
	}
	
	public String toString() {
		String rslt = "";
		rslt += "학번: " + getId();
		rslt += ", 등록금: " + getTuition();
		rslt += ", 평균등급: " + String.format("%.2f", getGpa());
		rslt += ", 장학금: " + calcScholarship(); 
		return rslt;
	}
	
	protected static double rate = 0.0;
	
	public static void setRate(double rate) {
		Student.rate = rate;
	}
	static double getRate() {
		return rate;
	}
	
	 public int calcScholarship() {
		 return (int)(getTuition() * rate);
	 }
}
