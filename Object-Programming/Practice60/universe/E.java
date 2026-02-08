package universe;

import planet.A;

public class E {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		//System.out.println(aobj.pro);
		/*pro의 접근자는 protected, 클래스 E는 클래스 A의 자식 클래스가 아니기 때문에 protected에 접근 불가능*/
		//System.out.println(aobj.def);
		/*def의 접근자는 protected, 클래스 E는 클래스 A의 자식 클래스가 아니기 때문에 protected에 접근 불가능*/
		//System.out.println(aobj.prv);
		/*prv는 접근자가 private이기 때문에 A 클래스 내부에서만 접근 가능*/
		
		//F fobj = new F();
		//fobj.accessTest();
		/*F는 planet 패키지에 있는 클래스인데, 현재 코드에는 import가 planet패키지의 A클래스에만 사용됨
		 즉, 컴파일러가 F클래스를 찾지 못해 오류가 발생함*/
	}
}
