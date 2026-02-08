//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("기본 장학금 비율: ");
		double rate = sc.nextDouble();
		Student.setRate(rate);
		
		//System.out.print("첫번째 학생의 학번: ");
		int i1 = 1111;
		System.out.print("첫번째 학생의 등록금: ");
		int t1 = sc.nextInt();
		System.out.print("첫번째 학생의 평균등급: ");
		double g1 = sc.nextDouble();
		Student s1 = new Student(i1, t1, g1);
		
		//System.out.print("두번째 학생의 학번: ");
		int i2 = 2222;
		System.out.print("두번째 학생의 등록금: ");
		int t2 = sc.nextInt();
		System.out.print("두번째 학생의 평균등급: ");
		double g2 = sc.nextDouble();
		//System.out.print("두번째 학생의 학년: ");
		int y2 = 3;
		Undergraduate s2 = new Undergraduate(i2, t2, g2, y2);
		
		//System.out.print("세번째 학생의 학번: ");
		int i3 = 3333;
		System.out.print("세번째 학생의 등록금: ");
		int t3 = sc.nextInt();
		System.out.print("세번째 학생의 평균등급: ");
		double g3 = sc.nextDouble();
		//System.out.print("세번째 학생의 연구실: ");
		String l3 = "SE";
		Graduate s3 = new Graduate(i3, t3, g3, l3);
		
		//System.out.println("입력된 학생들의 정보입니다.");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
	
		sc.close();
	}

}
