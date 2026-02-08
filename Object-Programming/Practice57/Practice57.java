//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Student s1= new Student();
		Student s2 = new Student();
		
		System.out.print("첫번째 학생 이름: ");
		String n1 = sc.next();
		s1.setName(n1); s1.getName();
		System.out.print("첫번째 학생 학년: ");
		int y1 = sc.nextInt();
		s1.setYear(y1); s1.getYear();
		System.out.print("두번째 학생 이름: ");
		String n2 = sc.next();
		s2.setName(n2); s2.getName();
		System.out.print("두번째 학생 학년: ");
		int y2 = sc.nextInt();
		s2.setYear(y2); s2.getYear();
		
		System.out.println(n1 + " 학생은 " + y1 + "학년입니다.");
		System.out.println(n2 + " 학생은 " + y2 + "학년입니다.");
		
		sc.close();
	}

}
