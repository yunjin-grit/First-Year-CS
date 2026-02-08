//컴퓨터학과 20250492 이윤진
public class Date { // 소속 변수만 가지고 있는 클래스
	int year;
	int month;
	int day;
	
	public String toString() {
		String rslt ="";
		rslt += year + "년 ";
		rslt += month + "월 ";
		rslt += day +"일";
		
		return rslt;
	}	
}