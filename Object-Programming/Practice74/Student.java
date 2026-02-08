//컴퓨터학과 20250492 이윤진
public abstract class Student {
	private int id;
	private int tuition;
	private double gpa;
	
	protected static double rate = 0.0;

	public static void setRate(double rate) {
		Student.rate = rate;
	}
	static double getRate() {
		return rate;
	}

	public Student() {
		this(0, 0, 0.0);
	}
	
	public Student(int id, int tuition, double gpa) {
		this.id = id;
		this.tuition = tuition;
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
	
	public abstract int calcScholarship();

	@Override
	public String toString() {
		String rslt = "";
		rslt += "학번: " + getId();
		rslt += ", 등록금: " + getTuition();
		rslt += ", 평균등급: " + String.format("%.2f", getGpa());
		rslt += ", 장학금: " + calcScholarship();
		return rslt;
	}
}
