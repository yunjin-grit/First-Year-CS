package planet;

public class F {
	void accessTest() {
		A aobj = new A();
		System.out.println(aobj.pub);
		System.out.println(aobj.pro);
		System.out.println(aobj.def);
		//System.out.println(aobj.prv);
		/*prv는 접근자가 private이기 때문에 A 클래스 내부에서만 접근 가능*/
	}
}
