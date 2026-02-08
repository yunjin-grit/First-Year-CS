package planet;

public class B extends A  {
	 public void accessTest()  {
	 System.out.println(pub);
	 System.out.println(pro);
	 System.out.println(def);
	 //System.out.println(prv);
	 /*prv는 접근자가 private이기 때문에 A 클래스 내부에서만 접근 가능
	  자식 클래스여도 private은 접근 불가능*/
	 
	 F fobj = new F();
	 fobj.accessTest();
	 }
}