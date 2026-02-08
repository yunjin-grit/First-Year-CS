//컴퓨터학과 20250492 이윤진
class Undergraduate extends Student {
	private int year;
	
	public void setYear(int year) {
		this.year = year;
	}
	
	int getYear() {
		return year;
	}
	
	public Undergraduate() {
		super();
		this.year = 1;
	}
	
	public Undergraduate(int id, int tuition, double gpa, int year) {
		super(id, tuition, gpa);
		this.year = year;
	}
	
	@Override
	public String toString() {
		String rslt = "";
		rslt += super.toString();
		rslt += ", 학년: " + getYear();
		return rslt;
	}
	
	public int calcScholarship() {
		return (int)(getTuition() * (getRate() + 0.1));
	 }
}
