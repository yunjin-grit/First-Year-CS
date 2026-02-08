//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Person per1 = new Person();
		Person per2 = new Person();
		Person per3 = new Person();
		
		per1.name = "김동덕";
		per1.address = "서울";
		System.out.print(per1.name + " 나이는? ");
		per1.age = sc.nextInt();
		
		per2.name = "홍길동";
		per2.address = "경북";
		System.out.print(per2.name + " 나이는? ");
		per2.age = sc.nextInt();
		
		per3.name = "성춘향";
		per3.address = "전남";
		System.out.print(per3.name + " 나이는? ");
		per3.age = sc.nextInt();
		
		System.out.println("");
		System.out.println("객체별 정보입니다.");
		System.out.println(per1.name + " : " + per1.age + "세, " + per1.address);
		System.out.println(per2.name + " : " + per2.age + "세, " + per2.address);
		System.out.println(per3.name + " : " + per3.age + "세, " + per3.address);
		System.out.println("");
		
		int mid;
		
		if (per1.age > per2.age) {
		    if (per2.age > per3.age)
		        mid = per2.age;
		    else if (per1.age > per3.age)
		        mid = per3.age;
		    else
		        mid = per1.age;
		} 
		else {
		    if (per1.age > per3.age)
		        mid = per1.age;
		    else if (per2.age > per3.age)
		        mid = per3.age;
		    else
		        mid = per2.age;
		}
		
		System.out.print("나이가 중간인 사람은 ");

		if (per1.age == mid) {
			System.out.println(per1.name + "입니다.");
		}
		else if (per2.age == mid) {
			System.out.println(per2.name + "입니다.");
		}
		else {
			System.out.println(per3.name + "입니다.");
		}
		    
		sc.close();
	}

}
