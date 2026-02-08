//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자를 입력하세요: ");
		String s = scan.next();
		
		switch(s) {
		case "a":
		case "A":
		case "e":
		case "E":
		case "i":
		case "I":
		case "o":
		case "O":
		case "u":
		case "U":
			System.out.println("모음입니다.");
			break;
		default:
			System.out.println("자음입니다.");
		}
		
		scan.close();
	}

}
