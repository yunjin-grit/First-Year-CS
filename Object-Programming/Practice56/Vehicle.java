//컴퓨터학과 20250492 이윤진
public class Vehicle {
	int speed;
	int heading;
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void turn(int angle) {
		heading = angle;
	}
	public void print() {
		System.out.print("속도: " + speed + "km / 방향: " + heading + "도");
	}
}
