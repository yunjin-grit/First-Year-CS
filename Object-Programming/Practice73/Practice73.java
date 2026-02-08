//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Animal a = new Animal();
		String n1 = sc.next();
		a.setName(n1);
		
		Lion l = new Lion();
		String n2 = sc.next();
		l.setName(n2);
		
		Eagle e = new Eagle();
		String n3 = sc.next();
		e.setName(n3);
		
		System.out.println("Animal 객체의 정보입니다.");
		System.out.println(a.toString());
		a.walk();
		a.fly();
		System.out.println("\nLion 객체의 정보입니다.");
		System.out.println(l.toString());
		l.walk();
		l.fly();
		System.out.println("\nEagle 객체의 정보입니다.");
		System.out.println(e.toString());
		e.walk();
		e.fly();
		
		sc.close();
	}

}
