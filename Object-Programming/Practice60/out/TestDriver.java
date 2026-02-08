package out;

import    planet.*;
import    universe.*;

public class TestDriver {
	public static void main(String[] args)  {
		B bobj = new B();
		bobj.accessTest();
		E eobj = new E();
		//eobj.accessTest();
		/*E 클래스에 생성자를 직접 작성하지 않으면 자바가 default 생성자를 자동으로 만들고,
		 default 생성자는 그 패키지 내부에서만 접근 가능해서 이 out 패키지에서 접근 불가능*/
		F fobj = new F();
	}
}