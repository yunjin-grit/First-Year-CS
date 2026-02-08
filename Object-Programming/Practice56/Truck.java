//컴퓨터학과 20250492 이윤진
class Truck extends Vehicle {
	int payload;
	public void printInfo() {
		print();
		System.out.println(" / 화물 무게: " + payload + "kg");
	}
}
