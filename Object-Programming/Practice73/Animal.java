//컴퓨터학과 20250492 이윤진
public class Animal {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	
	void fly() {
		System.out.println("날 수 없음");
	}
	void walk() {
		System.out.println("걸을 수 없음");
	}
	
	public String toString() {
		return getName();
	}
}
