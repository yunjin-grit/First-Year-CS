//컴퓨터학과 20250492 이윤진
class Cylinder extends Circle {
	private double height;
	
	public Cylinder() {
		this(0, 0);
	}
	
	public Cylinder(double radius) {
		this(radius, 0);
	}
	
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	double getHeight() {
		return height;
	}
	
	double getVolume() {
		return getArea() * getHeight();
	}
}
