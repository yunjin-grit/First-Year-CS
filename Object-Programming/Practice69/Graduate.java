//컴퓨터학과 20250492 이윤진
class Graduate extends Student {
	private String lab;
	
	public void setLab(String lab) {
		this.lab = lab;
	}
	
	String getLab() {
		return lab;
	}
	
	public Graduate() {
		super();
		this.lab = "";
	}
	
	public Graduate(int id, int tuition, double gpa, String lab) {
		super(id, tuition, gpa);
		this.lab = lab;
	}
	
	public String toString() {
		String rslt = "";
		rslt += super.toString();
		rslt += ", 연구실: " + getLab();
		return rslt;
	}
}
