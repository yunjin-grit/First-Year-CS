//컴퓨터학과 20250492 이윤진
import java.util.Scanner;

public class Practice74 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("기본 장학금 비율: ");
		double rate = sc.nextDouble();
		Student.setRate(rate);

		int i1 = 1111;
		System.out.print("첫번째 학생의 등록금: ");
		int t1 = sc.nextInt();
		System.out.print("첫번째 학생의 평균등급: ");
		double g1 = sc.nextDouble();
		Student s1 = new Undergraduate(i1, t1, g1, 1);

		int i2 = 2222;
		System.out.print("두번째 학생의 등록금: ");
		int t2 = sc.nextInt();
		System.out.print("두번째 학생의 평균등급: ");
		double g2 = sc.nextDouble();
		Student s2 = new Graduate(i2, t2, g2, "SE");

		int i3 = 3333;
		System.out.print("세번째 학생의 등록금: ");
		int t3 = sc.nextInt();
		System.out.print("세번째 학생의 평균등급: ");
		double g3 = sc.nextDouble();
		Student s3 = new VisitingStudent(i3, t3, g3);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}
}