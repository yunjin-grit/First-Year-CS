//컴퓨터학과 20250492 이윤진
public class Circle {
	private double radius;
	
	public Circle() {
		radius = 0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}
	public double getArea() {
        return 3.14 * radius * radius;
    }
}
