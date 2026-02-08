//컴퓨터학과 20250492 이윤진
class Lion extends Animal {	
	@Override
	void fly() {
		System.out.println("날 수 없음");
	}
	@Override
	void walk() {
		System.out.println("걸을 수 있음");
	}
}
