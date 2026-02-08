//컴퓨터학과 20250492 이윤진
class Circle extends Shape {
	private double radius;
	
	public Circle() {
		this(0, 0, 0);
	}
	public Circle(double radius) {
		this(0, 0, radius);
	}
	
	public Circle(int x, int y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	
	double getRadius() {
		return radius;
	}
	public double getArea() {
        return 3.14 * radius * radius;
    }
	
	@Override
	public String toString() {
		String rslt = "";
		rslt += super.toString();
		rslt += "반지름 : " + String.format("%.2f", getRadius()) + "\n";
		rslt += "단면적 : " + String.format("%.2f", getArea()) + "\n";
		return rslt;
	}
}
