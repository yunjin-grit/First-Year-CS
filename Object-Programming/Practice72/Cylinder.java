//컴퓨터학과 20250492 이윤진
class Cylinder extends Circle {
	private double height;
	
	public Cylinder() {
		this(0, 0, 0.0, 0.0);
	}
	public Cylinder(double radius) {
		this(0, 0, radius, 0.0);
	}
	public Cylinder(double radius, double height) {
		this(0, 0, radius, height);
	}
	public Cylinder(int x, int y, double radius, double height) {
		super(x, y, radius);
		this.height = height;
	}
	
	double getHeight() {
		return height;
	}
	
	double getVolume() {
		return getArea() * height;
	}
	
	@Override
	public String toString() {
		String rslt = "";
		rslt += super.toString();
		rslt += "높이 : " + String.format("%.2f", getHeight()) + '\n';
		rslt += "부피 : " + String.format("%.2f", getVolume()) + '\n';
		return rslt;
	}
}
