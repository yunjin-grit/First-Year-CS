//컴퓨터학과 20250492 이윤진
public class Person {
	private String name, address;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	String getName() {
		return name;
	}
	String getAddress() {
		return address;
	}
	int getAge() {
		return age;
	}
}
