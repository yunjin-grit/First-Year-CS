//컴퓨터학과 20250492 이윤진
import java.util.Scanner;
public class Practice76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 사각형 입력
        System.out.print("사각형의X좌표를입력하세요: ");
        int rx = sc.nextInt();
        System.out.print("사각형의Y좌표를입력하세요: ");
        int ry = sc.nextInt();
        System.out.print("사각형의가로를입력하세요: ");
        int rlen = sc.nextInt();
        System.out.print("사각형의세로를입력하세요: ");
        int rwid = sc.nextInt();
        Rectangle rect = new Rectangle(rx, ry, rlen, rwid);

        // 삼각형 입력
        System.out.print("삼각형의X좌표를입력하세요: ");
        int tx = sc.nextInt();
        System.out.print("삼각형의Y좌표를입력하세요: ");
        int ty = sc.nextInt();
        System.out.print("삼각형의밑변을입력하세요: ");
        int tbase = sc.nextInt();
        System.out.print("삼각형의높이를입력하세요: ");
        int theight = sc.nextInt();
        Triangle tri = new Triangle(tx, ty, tbase, theight);

        // 원 입력
        System.out.print("원의X좌표를입력하세요: ");
        int cx = sc.nextInt();
        System.out.print("원의Y좌표를입력하세요: ");
        int cy = sc.nextInt();
        System.out.print("원의반지름을입력하세요: ");
        int cradius = sc.nextInt();
        Circle circ = new Circle(cx, cy, cradius);

        // 출력
        System.out.println(rect);
        System.out.println(tri);
        System.out.println(circ);

        sc.close();
    }
}