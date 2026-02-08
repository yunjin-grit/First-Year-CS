//컴퓨터학과 20250492 이윤진
class VisitingStudent extends Student {

	public VisitingStudent(int id, int tuition, double gpa) {
		super(id, tuition, gpa);
	}

	@Override
	public int calcScholarship() {
		return 0; 
	}
}