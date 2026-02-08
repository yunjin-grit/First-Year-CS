//컴퓨터학과 20250492 이윤진
class Bus extends Vehicle {
	int seats;
	public void printInfo() {
		print();
		System.out.println(" / 최대 승객수: " + seats + "명");
	}
}
